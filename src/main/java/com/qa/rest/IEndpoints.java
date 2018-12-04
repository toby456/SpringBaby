package com.qa.rest;

import java.util.Optional;

import com.qa.domain.Baby;


public interface IEndpoints {
	
	public Iterable<Baby> getAllBabies();

	public Optional<Baby> findBaby(Long id);

	public String deleteBaby(Long id);

	public String updateBaby(Long id, Baby baby);

	public String createBaby(int length, String toStart);


}
