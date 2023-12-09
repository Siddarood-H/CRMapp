package com.zohocrm1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohocrm1.entities.Lead;
@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {

}
