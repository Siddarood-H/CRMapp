package com.zohocrm1.services;

import java.util.List;

import com.zohocrm1.entities.Contact;
import com.zohocrm1.entities.Lead;

public interface ContactService {
	public void saveContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact findByid(long id);

	public  Contact getContactById(long id);

}
