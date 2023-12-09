package com.zohocrm1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm1.entities.Contact;
import com.zohocrm1.entities.Lead;
import com.zohocrm1.services.ContactService;

@Controller
public class ContactController {
	@Autowired
	private ContactService contactService;

	@RequestMapping("/listallContacts")
	public String listAllLeads(ModelMap model) 
	{
		List<Contact> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "list_contacts";
		
	}
@RequestMapping("/contactInfo")
	
	public String contactInfo(@RequestParam("id") long id, Model model)
	{
		Contact contacts = contactService.findByid(id);
		model.addAttribute("contact", contacts);
		return "contact_info";
	}
	
}
