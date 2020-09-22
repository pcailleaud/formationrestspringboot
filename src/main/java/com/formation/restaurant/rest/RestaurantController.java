package com.formation.restaurant.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formation.restaurant.models.Restaurant;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

	@GetMapping
	public List<Restaurant> findAll() {
		List<Restaurant> liste = new ArrayList<Restaurant>();
		Restaurant resto1 = new Restaurant();
		resto1.setId("resto1");
		resto1.setNom("Le Restaurant Test");
		resto1.setAdresse("4 Boulevard de Paris 44000 Nantes");
		liste.add(resto1);
		Restaurant resto2 = new Restaurant();
		resto2.setId("resto2");
		resto2.setNom("Crêperie");
		resto2.setAdresse("6 Boulevard de Paris 44000 Nantes");
		liste.add(resto2);
		
		return liste;
	}
}
