package com.skilldistillery.astsunit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.astsunit.entity.Airman;
import com.skilldistillery.astsunit.service.AirmanService;

@Controller
@RequestMapping("/allAirmen")
public class AirmanController {

	private AirmanService airmanService;
	
	@Autowired
	public AirmanController(AirmanService theAirmanService) {
		airmanService = theAirmanService;
	}
	
	
	@GetMapping("/list")
	public String listAirmen(Model theModel) {
		List<Airman> theAirmen = airmanService.findAll();
		
		theModel.addAttribute("allAirmen", theAirmen);
		
		return "allAirmen/list-airmen";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Airman theAirman = new Airman();
		
		theModel.addAttribute("airman", theAirman);
		
		return "allAirmen/airman-form";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("airmanId") int theId, Model theModel) {
		
		Airman theAirman = airmanService.findById(theId);
		
		theModel.addAttribute("airman", theAirman);
		
		return "allAirmen/airman-form";
	}
	
	@PostMapping("/save")
	public String saveAirman(@ModelAttribute("airman") Airman theAirman) {
		airmanService.save(theAirman);
		return "redirect:/allAirmen/list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("airmanId") int theId) {
		
		airmanService.deleteById(theId);
		
		return "redirect:/allAirmen/list";
	}
	
	
	
	
}
