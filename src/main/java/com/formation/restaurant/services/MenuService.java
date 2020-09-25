package com.formation.restaurant.services;

import java.util.Set;

import com.formation.restaurant.models.Menu;

public interface MenuService {
	
	public Set<Menu> findAllOfRestaurant(String idRestaurant);

	public Menu findById(String id);

	public String create(String idRestaurant, Menu menu);

	public void update(String id, Menu menu);

}
