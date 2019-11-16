package org.hms.serviceapp.service;

import org.hms.serviceapp.entity.Doctor;
import org.hms.serviceapp.model.Specialist;
import org.hms.serviceapp.model.SpecialistDetails;
import org.hms.serviceapp.repository.DoctorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SpecialistService {

    @Autowired
    private DoctorRepository doctorRepository;   

    private static final Logger logger = LoggerFactory.getLogger(SpecialistService.class);
    
    public SpecialistDetails getSpecialistDetails() {
    	SpecialistDetails specialists=new SpecialistDetails();
    	 
    	try {
			List<Doctor> dList=doctorRepository.findAll();
			List<Specialist> specialistDetails=dList.stream().map(doctor -> {
				Specialist specialist=new Specialist(doctor);
				return specialist;
			}).collect(Collectors.toList());
			specialists.setSpecialistDetails(specialistDetails);
		} catch (Exception e) {
			// TODO: handle exception
		}
    	return specialists;
	}

    
}
