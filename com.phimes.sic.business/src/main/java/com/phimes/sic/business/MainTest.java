package com.phimes.sic.business;

import com.phimes.sic.business.model.Access;
import com.phimes.sic.business.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.phimes.sic.api.dto.AccessDto;
import com.phimes.sic.business.dao.AccessRepository;
import com.phimes.sic.business.service.AccessService;

import antlr.collections.List;

public class MainTest {

	public static void main(String[] args) {

		AccessDto accDto = new AccessDto();

		AccessService ac = new AccessService();
		accDto = ac.getAccessDto();
		java.util.List lista = ac.findAll();

		for (Object actdo : lista) {
			System.out.println(actdo);
		}

	}

}
