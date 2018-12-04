package com.qa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qa.domain.Baby;

@Repository
public interface IBabyNameRepo extends CrudRepository<Baby, Long>{

}
