package com.phimes.sic.business.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.phimes.sic.api.dto.UserProfileDto;
import com.phimes.sic.api.service.IProfileAccessorService;
import com.phimes.sic.business.config.AppConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AppConfig.class})
public class ProfileAccessorServiceTest {
	
	@Autowired
	private IProfileAccessorService profileAccessorService;
	
	@Test
	public void  test_getDomainCodeList() {
		
		// dichiariamo un parametro usernameUsr
		String username = "us_username_test";
		
		// viene chiamatto il metodo con il param
		List<String> domainList = profileAccessorService.getDomainCodeList(username);
		
		//testare se la lista contiene al meno un valore
		assertThat(domainList).isNotEmpty();
		
	}
	@Test
	public void test_logIn() {
		 
		profileAccessorService.logIn("us_username_test", "", "us_dom_code");
		
		UserProfileDto testDto = profileAccessorService.getUserProfileDto();
		
		// testare che is UserProfileDto e diverso da null
		assertThat(testDto).isNotNull();
	}

}
