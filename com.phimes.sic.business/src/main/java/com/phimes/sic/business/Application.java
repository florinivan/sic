package com.phimes.sic.business;

import static java.lang.System.exit;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.phimes.sic.business.model.Accesso;
import com.phimes.sic.business.service.AccessoService;

//for jsr310 java 8 java.time.*
//@EntityScan(
//        basePackageClasses = { SpringBootConsoleApplication.class, Jsr310JpaConverters.class }
//)
@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	DataSource dataSource;

	@Autowired
	AccessoService accessoTest;

	@Override
	public void run(String... args) throws Exception {

		Accesso accTest = new Accesso();
		accTest.setDescrizione("Read");

		accTest.setIdAccesso('R');
		accTest.setDescrizione("Descrivo l'istanza che uso per il test");

		accessoTest.saveOrUpdate(accTest);

		System.out.println("Done!");

		exit(0);

	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}


}