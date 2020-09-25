package com.formation.restaurant.dao;

import org.springframework.data.repository.CrudRepository;

import com.formation.restaurant.models.Menu;

public interface MenuRepository extends CrudRepository<Menu, String> {
}
