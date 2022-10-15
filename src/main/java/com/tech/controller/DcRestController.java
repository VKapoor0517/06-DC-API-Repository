package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.binding.Plans;
import com.tech.service.DcService;

@RestController
public class DcRestController {

	@Autowired
	private DcService service;
	
	@GetMapping("/plans")
	public ResponseEntity<List<Plans>> getPlans()
	{
		return new ResponseEntity<List<Plans>>(service.getAllPlans(), HttpStatus.OK);
	}
}
