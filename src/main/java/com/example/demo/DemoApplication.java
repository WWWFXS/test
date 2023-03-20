package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.concurrent.locks.ReentrantLock;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ReentrantLock lock;
	}

	@GetMapping("/hello")
	public Person sayHello(){
		Person person = new Person();
		person.setAge(31);
		person.setName("hello");
		return person;
	}
//	@RequestParam("access_token") String accessToken,@RequestBody DraftAddRequest request

	@PostMapping("/hh")
	public Person hh(@RequestParam("access_token") String accessToken,@RequestBody DraftAddRequest request){
		Person person = new Person();
		person.setAge(31);
		person.setName("hello");
		return person;
	}

	@PostMapping("/gg")
	public Person gg(@Validated @RequestParam(value = "access_token") @NotEmpty @Size(min = 1) String accessToken){
		Person person = new Person();
		person.setAge(31);
		person.setName("hello");
		return person;
	}

}
