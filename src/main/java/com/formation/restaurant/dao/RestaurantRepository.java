package com.formation.restaurant.dao;

import org.springframework.data.repository.CrudRepository;

import com.formation.restaurant.models.Restaurant;

public interface RestaurantRepository extends CrudRepository<Restaurant, String> {
}
