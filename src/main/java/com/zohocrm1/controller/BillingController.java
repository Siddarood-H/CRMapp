package com.zohocrm1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm1.entities.Billing;
import com.zohocrm1.entities.Contact;
import com.zohocrm1.services.BillingService;
import com.zohocrm1.services.ContactService;

@Controller
public class BillingController {
	@Autowired
	private ContactService contactService;
	@Autowired
	private BillingService billingService;
	
	@RequestMapping("/generateBill")
	public String viewBillingPAge(@RequestParam("id")long id,ModelMap model)
	{
		
		Contact contact=contactService.getContactById(id);
		
		model.addAttribute("contact", contact);
		
		return "generate_bill";
	}
	@RequestMapping("/saveBill")
	
	public String saveBill(@ModelAttribute("billing") Billing billing,ModelMap model)
	{
		billingService.saveBill(billing);
		
		model.addAttribute("msg", "bill Generated");
		return "generate_bill";
		
	}

}
