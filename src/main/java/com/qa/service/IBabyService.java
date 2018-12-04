package com.qa.service;

import java.util.Optional;

import com.qa.domain.Baby;

public interface IBabyService {

	public String deleteBaby(Long id);

	public Optional<Baby> findBaby(Long id);

	public Iterable<Baby> getAllBabies();

	public String updateBaby(Long id, Baby baby);

	public String createBaby(int length, String toStart);

}
