package com.skilldistillery.astsunit.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.skilldistillery.astsunit.entity.Airman;

@RepositoryRestResource(path="349astsAirmen")
public interface AirmanRepository extends JpaRepository<Airman, Integer> {
	
	public List<Airman> findAllByOrderByLastNameAsc();
	

}
