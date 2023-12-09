package com.zohocrm1.services;

import java.util.List;

import com.zohocrm1.entities.Lead;

public interface LeadService {
	
	public void saveOneLead( Lead lead);

	public Lead findByid(long id);

	public void deleteById(long id);

	public List<Lead> getALlLeads();

	


}
