package com.skilldistillery.astsunit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.astsunit.dao.AirmanRepository;
import com.skilldistillery.astsunit.entity.Airman;

@Service
public class AirmanServiceImpl implements AirmanService {

	private AirmanRepository airmanRepository;
	
	@Autowired
	public AirmanServiceImpl(AirmanRepository theAirmanDAO) {
		airmanRepository = theAirmanDAO;
	}
	
	@Override
	public List<Airman> findAll() {
		return airmanRepository.findAllByOrderByLastNameAsc();
	}

	@Override
	public Airman findById(int theId) {
		Optional <Airman> result = airmanRepository.findById(theId);
		
		Airman theAirman = null;
		if (result.isPresent() ) {
			theAirman = result.get();
		}
		else {
			throw new RuntimeException("Did not find airman id - " + theId);
		}
		return theAirman;
	}

	@Override
	public void save(Airman theAirman) {
		airmanRepository.save(theAirman);
	}

	@Override
	public void deleteById(int theId) {
		airmanRepository.deleteById(theId);
	}

}
