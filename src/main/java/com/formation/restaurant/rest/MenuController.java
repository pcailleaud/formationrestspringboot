package com.formation.restaurant.rest;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.formation.restaurant.models.Menu;
import com.formation.restaurant.services.MenuService;
import com.formation.restaurant.services.RestaurantService;
import com.formation.restaurant.util.CtrlPreconditions;

@RestController
public class MenuController {
	
	@Autowired
	public MenuService menuService;
	
	@Autowired
	public RestaurantService restoService;
	
	@GetMapping("/restaurants/{idResto}/menus")
	public Set<Menu> findAllOfRestaurant(@PathVariable("idResto") String idRestaurant) {
		CtrlPreconditions.checkFound(restoService.findById(idRestaurant));
		return menuService.findAllOfRestaurant(idRestaurant);
	}
	
	@GetMapping("/menus/{id}")
	public Menu findById(@PathVariable("id") String id) {
		Menu reponse = menuService.findById(id);
		CtrlPreconditions.checkFound(reponse);
		return reponse;
	}
	
	@PostMapping("/restaurants/{idResto}/menus")
	@ResponseStatus(code = HttpStatus.CREATED)
	public String create(@PathVariable("idResto") String idRestaurant, @RequestBody Menu menu) {
		CtrlPreconditions.checkFound(restoService.findById(idRestaurant));
		return menuService.create(idRestaurant, menu);
	}
	
	@PutMapping("/menus/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void update(@PathVariable("id") String id, @RequestBody Menu menu) {
		CtrlPreconditions.checkFound(menuService.findById(id));
		menuService.update(id, menu);
	}

}
