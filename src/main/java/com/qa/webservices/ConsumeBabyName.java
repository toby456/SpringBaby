package com.qa.webservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qa.constants.BabyConstants;
import com.qa.domain.Baby;

@RestController
@CrossOrigin
public class ConsumeBabyName implements IConsumeBabyName {

	@Autowired
	private RestTemplate restTemplate;

	@PostMapping
	public String getBabyName(Baby baby) {
		
		return restTemplate.postForObject(BabyConstants.LOCAL_HOST + BabyConstants.BABYNAME_GEN_PORT
				+ BabyConstants.GET_BABYNAME_PATH + baby.getLength() + BabyConstants.SLASH + baby.getToStart(), baby,
				String.class);
		
		

	}

}
