package com.zohocrm1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohocrm1.entities.Billing;
@Repository
public interface BillingRepository extends JpaRepository<Billing, Long> {

}
