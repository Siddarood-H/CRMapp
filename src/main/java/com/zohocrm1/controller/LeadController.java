package com.zohocrm1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm1.entities.Contact;
import com.zohocrm1.entities.Lead;
import com.zohocrm1.services.ContactService;
import com.zohocrm1.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/viewcreateLeadPage")
	public String viewcreateLeadPage()
	{
		return"create_new_lead";
	}
	
	@PostMapping("/save")
public String saveLead(@ModelAttribute("lead") Lead lead , Model model)
{
		
		leadService.saveOneLead(lead);
		model.addAttribute("lead", lead);
		return "lead_info";
}
	@PostMapping("/convertLead")
	public String ConvertLead(@RequestParam("id") long id,ModelMap model)
	{
	Lead lead=leadService.findByid(id);
	
	Contact contact=new Contact();
	contact.setFirstName(lead.getFirstName());
	contact.setLastName(lead.getLastName());
	contact.setEmail(lead.getEmail());
	contact.setMobile(lead.getMobile());
	contact.setSource(lead.getSource());
	
	contactService.saveContact(contact);
	
	
	leadService.deleteById(id);
	List<Contact> contacts = contactService.getAllContacts();
	model.addAttribute("contacts", contacts);
	return "list_contacts";
	
	
	
		
	}
	@RequestMapping("/listall")
	public String listAllLeads(ModelMap model) 
	{
		List<Lead> leads = leadService.getALlLeads();
		model.addAttribute("leads", leads);
		return "list_leads";
		
	}
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id, Model model)
	{
		Lead lead = leadService.findByid(id);
		model.addAttribute("lead", lead);
		return "lead_info";
		
	}
	
	
}
