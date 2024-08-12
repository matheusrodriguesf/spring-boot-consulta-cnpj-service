package br.com.arcelino.cnpjservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CnpjServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CnpjServiceApplication.class, args);
	}

}
