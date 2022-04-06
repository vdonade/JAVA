package com.medicine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.medicine.service.ItemService;
import com.medicine.service.RegistrationService;

@RestController
public class CartController {
	@Autowired
	private ItemService service;
	
	@Autowired
	private RegistrationService service1;
}
