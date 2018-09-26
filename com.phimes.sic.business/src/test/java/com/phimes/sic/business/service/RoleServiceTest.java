package com.phimes.sic.business.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.phimes.sic.api.dto.RoleDto;

import com.phimes.sic.api.service.IRoleService;

import com.phimes.sic.business.config.AppConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { AppConfig.class })

public class RoleServiceTest {

	@Autowired
	private IRoleService roleService;

	@Test
	public void test_getRoleListDto() {

		String codeApp = "app_code_test";
		String username = "us_username_test";
		Character idStateRl = 'c';

		List<RoleDto> listRoleDto = roleService.getRoleListDto(codeApp, username, idStateRl);

		assertThat(listRoleDto).isNotEmpty();

	}

	@Test
	public void test_getRoleDto() {

		String codeApp = "app_code_test";
		String username = "us_username_test";
		String codeRl = "rl_code_test";
		Character idStateRl = 'c';

		RoleDto roleDto = roleService.getRoleDto(codeApp, username, codeRl, idStateRl);

		assertThat(roleDto).isNotNull();

	}

}
