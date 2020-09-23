package com.formation.restaurant.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formation.restaurant.dao.RestaurantRepository;
import com.formation.restaurant.models.Restaurant;
import com.formation.restaurant.services.RestaurantService;

@Service
public class RestaurantServiceImpl implements RestaurantService {
	
	@Autowired
	private RestaurantRepository restoRepository;

	@Override
	public List<Restaurant> findAll() {
		List<Restaurant> liste = new ArrayList<Restaurant>();
		restoRepository.findAll().forEach(liste::add);
		return liste;
	}

	@Override
	public Restaurant findById(String id) {
		if(restoRepository.findById(id).isPresent()) {
			return restoRepository.findById(id).get();
		}
		return null;
	}

	@Override
	public String create(Restaurant restaurant) {
		return restoRepository.save(restaurant).getId();
	}

	@Override
	public void update(String identifiant, Restaurant restaurant) {
		restaurant.setId(identifiant);
		restoRepository.save(restaurant);
	}

}
