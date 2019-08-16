package com.cg.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Promo;
import com.cg.service.PromoServiceImpl;


@RestController
public class PromoController {

	@Autowired
	private PromoServiceImpl service;
	
	//Dummy database
		 @PostConstruct
		 public String createSample() {
		 Promo p1 = new Promo(1,"Promox");
		 Promo p2 = new Promo(2,"PromSnap");
		 service.addPromo(p1);
		 service.addPromo(p2);
		 return "promo created";
		 }
	
	@GetMapping("/promos") // Get mapping for getting list of sessions
	public List<Promo>  getAllPromos() {
		return service. getAllPromos();
	}
	
	@PostMapping(value = "/new", consumes = { "application/json" }) // to add session into the database
	public String save(@RequestBody Promo p) {
		service.addPromo(p);
		return "Promo added!";
	}
	
	@DeleteMapping(value = "/delete{id}") // to delete session from database using id
	public String deleteUser(@PathVariable int id) {
		service.deletePromo(id);
		return "Promo deleted";
	}
}
