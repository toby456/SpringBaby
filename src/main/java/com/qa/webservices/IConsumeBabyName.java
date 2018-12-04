package com.qa.webservices;

import org.springframework.web.bind.annotation.RestController;

import com.qa.domain.Baby;

@RestController
public interface IConsumeBabyName {
	
	String getBabyName (Baby baby);

}
