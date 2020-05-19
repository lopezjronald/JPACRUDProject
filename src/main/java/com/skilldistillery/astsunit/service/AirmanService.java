package com.skilldistillery.astsunit.service;

import java.util.List;

import com.skilldistillery.astsunit.entity.Airman;

public interface AirmanService {

	public List<Airman> findAll();
	
	public Airman findById(int theId);
	
	public void save(Airman theAirman);
	
	public void deleteById(int theId);
	
}
