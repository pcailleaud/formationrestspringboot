package com.formation.restaurant.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.restaurant.exceptions.ResourceNotFoundException;
import com.formation.restaurant.models.Restaurant;
import com.formation.restaurant.services.RestaurantService;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

	@Autowired
	private RestaurantService restoService;
	
	@GetMapping
	public List<Restaurant> findAll() {
		return restoService.findAll();
	}
	
	@GetMapping("/{id}")
	public Restaurant findById(@PathVariable("id") String identifiant) {
		Restaurant reponse = restoService.findById(identifiant);
		if(reponse == null) {
			throw new ResourceNotFoundException();
		}
		return reponse;
	}
}
