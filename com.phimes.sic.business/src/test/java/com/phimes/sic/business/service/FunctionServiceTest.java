
package com.phimes.sic.business.service;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.phimes.sic.api.dto.FunctionDto;
import com.phimes.sic.api.service.IFunctionService;

import com.phimes.sic.business.config.AppConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { AppConfig.class })
public class FunctionServiceTest {

	@Autowired
	IFunctionService functionService;

	@Test

	public void test_getFunctionListDto() {

		String codeRl = "rl_code_test";
		String codeApp = "app_code_test";

		List<FunctionDto> listFunctionDto = functionService.getFunctionListDto(codeRl, codeApp);

		assertThat(listFunctionDto).isNotEmpty();

	}

}
