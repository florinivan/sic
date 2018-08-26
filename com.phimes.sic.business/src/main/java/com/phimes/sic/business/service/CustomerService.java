package com.phimes.sic.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import com.phimes.sic.business.dao.CustomerRepository;
import com.phimes.sic.business.model.Customer;

@org.springframework.stereotype.Service
public class CustomerService extends Service<Customer, Long> {

	@Autowired
	private CustomerRepository rep;

	@Override
	protected CrudRepository<Customer, Long> getCrudRep() {

		return rep;
	}

}
