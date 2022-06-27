package com.belajar.spring.latihan;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

	Logger logger = Logger.getLogger(Main.class.getName());

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AddressesRepository addressesRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User user1 = new User("wndd@gmail.com", "winda", "root");
		User user2 = new User("cooo@gmail.com", "winda", "123root");

		userRepository.save(user1);
		userRepository.save(user2);

		Addresses addr1 = new Addresses("Jambi", "indonesia", "indonesia", "pangpolim street", "30333", user1);
		Addresses addr2 = new Addresses("Jambi", "indonesia", "indonesia", "beringin street", "30333", user2);

		addressesRepository.save(addr1);
		addressesRepository.save(addr2);

		System.out.println(addr1);
		System.out.println(addr2);
	}

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

	}
}
