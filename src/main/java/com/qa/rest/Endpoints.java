package com.qa.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.domain.Baby;
import com.qa.service.IBabyService;

@RequestMapping ("${base_endpoint}")
@RestController
@CrossOrigin
public class Endpoints implements IEndpoints{
	
	@Autowired
	private IBabyService service;

	@Override
	@GetMapping("${getAll_endpoint}")
	public Iterable<Baby> getAllBabies() {
		return service.getAllBabies();
	}

	@Override
	@GetMapping("${find_endpoint}")
	public Optional<Baby> findBaby(@PathVariable Long id) {
		return service.findBaby(id);
	}

	@Override
	@PostMapping("${create_endpoint}")
	public String createBaby(@PathVariable int length, @PathVariable String toStart) {
		return service.createBaby(length, toStart);
	}

	@Override
	@DeleteMapping("${delete_endpoint}")
	public String deleteBaby(@PathVariable Long id) {
		return service.deleteBaby(id);
	}

	@Override
	@PutMapping("${update_endpoint}")
	public String updateBaby(@PathVariable Long id, @RequestBody Baby baby) {
		return service.updateBaby(id, baby);
	}

}
