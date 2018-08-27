package com.phimes.sic.business;

import static java.lang.System.exit;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.phimes.sic.business.model.Access;
import com.phimes.sic.business.service.AccessService;

//for jsr310 java 8 java.time.*
//@EntityScan(
//        basePackageClasses = { SpringBootConsoleApplication.class, Jsr310JpaConverters.class }
//)
@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	DataSource dataSource;

	@Autowired
	AccessService accessoTest;

	@Override
	public void run(String... args) throws Exception {

		Access accTest = new Access();
		accTest.setDescription("Read");

		accTest.setIdAccess('R');
		accTest.setDescription("Descrivo l'istanza che uso per il test");

		accessoTest.saveOrUpdate(accTest);

		System.out.println("Done!");

		exit(0);

	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}


}