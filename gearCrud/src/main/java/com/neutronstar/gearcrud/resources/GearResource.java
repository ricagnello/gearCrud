package com.neutronstar.gearcrud.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neutronstar.gearcrud.entities.Gear;
import com.neutronstar.gearcrud.repositories.GearRepository;

@RestController
public class GearResource {
	
	@Autowired
	private GearRepository gearRepository;
	
	//GET method
	@GetMapping("/gears")
	public List<Gear> getAllGears() {
		return gearRepository.findAll();
	}

}
