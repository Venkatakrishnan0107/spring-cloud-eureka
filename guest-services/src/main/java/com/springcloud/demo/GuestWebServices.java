package com.springcloud.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guests")
public class GuestWebServices {
	
	@Autowired
	private  GuestRepository repository;

	
	@GetMapping("/{id}")
	public Guest getGuest(@PathVariable("id") long id)
	{
		return repository.findById(id).get();
	}
	
	@GetMapping
	public Iterable<Guest> getAllGuest()
	{
		return repository.findAll();
	}

}
