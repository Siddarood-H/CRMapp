package com.zohocrm1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm1.entities.Billing;
import com.zohocrm1.repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	@Autowired
	private BillingRepository BillingRepo;

	@Override
	public void saveBill(Billing billing) {
		
		BillingRepo.save(billing);
	}
	

}
