package com.phimes.sic.business.service;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.phimes.sic.api.service.IService;
import com.phimes.sic.business.config.AppConfig;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {AppConfig.class})
public class ApplicationServiceTest {

	// DI usiamo l'interfaccia
	@Autowired
	IService applicationService;
	

	@Test
	public void test_findAll() {
		/*Application app = new Application();
		app.setCode("cod_1");
		app.setIdState('A');
		app.setDescription("App_Test_1");
		
		List<Application> applist = new ArrayList<>();
		applist.add(app);
		
		//usiamo Mockito
		Mockito.when(appRep.findAll()).thenReturn(applist);*/
		
		// assert that has field description with value 'acc_description_test'
		assertThat(applicationService.get(1L)).hasFieldOrPropertyWithValue("description", "acc_description_test");

	}

}
