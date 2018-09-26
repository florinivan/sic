package com.phimes.sic.business.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.phimes.sic.api.dto.UserProfileDto;
import com.phimes.sic.api.service.IUserService;
import com.phimes.sic.business.config.AppConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { AppConfig.class })

public class UserServiceTest {

	@Autowired
	private IUserService userService;

	@Test
	public void testGetDomainCodeList() {

		String username = "us_username_test";

		List<String> domainList = userService.getDomainCodeList(username);

		assertThat(domainList).isNotEmpty();

	}

	@Test
	public void testGetUsername() {

		String domainCodeUsr = "us_dom_code";
		String username = "us_username_test";

		UserProfileDto userProfileDto = userService.getUsername(domainCodeUsr, username);

		assertThat(userProfileDto).isNotNull();

	}

}
