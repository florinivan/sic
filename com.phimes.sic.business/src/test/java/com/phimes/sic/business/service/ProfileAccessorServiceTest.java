package com.phimes.sic.business.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.phimes.sic.api.dto.FilterDto;
import com.phimes.sic.api.dto.LevelDto;
import com.phimes.sic.api.dto.RoleDto;
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
	
	
	@Test
	public void test_getRoleList() {
		List<RoleDto> roleDtoList = profileAccessorService.getRoleList();
		
		//testare che roleDtoList non sia una lista vuota
		assertThat(roleDtoList).isNotEmpty();
	}

	@Test
	public void test_getLevelList() {
		List<LevelDto> levelDtoList = profileAccessorService.getLevelList();
		
		//testare che levelDtoList non sia una lista vuota
		assertThat(levelDtoList).isNotEmpty();
		}
	
	@Test
	public void test_getFilterList() {
		List<FilterDto> filterDtoList = profileAccessorService.getFilterList();
		//testare che filterDtoList non sia una lista vuota
		assertThat(filterDtoList).isNotEmpty();
	}
	
	
	@Test
	public void test2_getFilterList() {
		LevelDto levelDto = new LevelDto();
		levelDto.setCode("lev_code_test");
		List<FilterDto> filterDtoList= profileAccessorService.getFilterList(levelDto);
		assertThat(filterDtoList).isNotEmpty();
		
	}
}
