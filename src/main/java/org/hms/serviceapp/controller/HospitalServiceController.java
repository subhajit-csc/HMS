package org.hms.serviceapp.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hms.serviceapp.exception.ResourceNotFoundException;
import org.hms.serviceapp.model.SpecialistDetails;
import org.hms.serviceapp.service.SpecialistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class HospitalServiceController {
	
	@Autowired
	private SpecialistService specialistService;
	
	@GetMapping("/specialist")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public ResponseEntity<SpecialistDetails> getSpecialistDetails() throws ResourceNotFoundException {		
		return ResponseEntity.ok().body(specialistService.getSpecialistDetails());
	}
}
