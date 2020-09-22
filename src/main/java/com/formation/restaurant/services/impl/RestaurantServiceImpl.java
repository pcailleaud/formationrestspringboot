package com.formation.restaurant.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.formation.restaurant.models.Restaurant;
import com.formation.restaurant.services.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {

	@Override
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
