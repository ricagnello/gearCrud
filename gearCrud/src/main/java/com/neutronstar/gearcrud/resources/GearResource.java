package com.neutronstar.gearcrud.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.neutronstar.gearcrud.entities.Gear;
import com.neutronstar.gearcrud.exceptions.GearNotFoundException;
import com.neutronstar.gearcrud.repositories.GearRepository;

@RestController
public class GearResource {

	@Autowired
	private GearRepository gearRepository;

	// GET method
	@GetMapping("/gears")
	public List<Gear> getAllGears() {
		return gearRepository.findAll();
	}

	// Get method by Id
	@GetMapping("gears/{id}")
	public Gear getGearById(@PathVariable Long id) {
		Optional<Gear> gear = gearRepository.findById(id);

		if (!gear.isPresent())
			throw new GearNotFoundException("id: " + id + " not found");

		return gear.get();

	}
	
	//DELETE method
	@DeleteMapping("/gears/{id}")
	public void deleteGear(@PathVariable Long id) {
		gearRepository.deleteById(id);
	}

}
