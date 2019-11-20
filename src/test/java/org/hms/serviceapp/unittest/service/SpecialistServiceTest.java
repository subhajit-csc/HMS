package org.hms.serviceapp.unittest.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.hms.serviceapp.entity.SpecialistDtls;
import org.hms.serviceapp.exception.ResourceNotFoundException;
import org.hms.serviceapp.model.AppointmentDetails;
import org.hms.serviceapp.model.SpecialistDetails;
import org.hms.serviceapp.repository.DoctorRepository;
import org.hms.serviceapp.repository.HospitalRepository;
import org.hms.serviceapp.service.SpecialistService;
import org.hms.serviceapp.unittest.AppData;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;


@RunWith(MockitoJUnitRunner.class)
public class SpecialistServiceTest {

	@InjectMocks
	SpecialistService specialistService;
	
	@Mock HospitalRepository hospitalRepository;
	@Mock SpecialistDtls specialistDtls;
	@Mock DoctorRepository doctorRepository;
	@Mock AppointmentDetails appointmentDetails;
	@Mock SpecialistDetails specialists;
	
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);		
	}
	
	@Test
	public void testGetSpecialistDetails() throws ResourceNotFoundException {		
		Mockito.when(hospitalRepository.getHospital("XYZ")).thenReturn(AppData.HOSPITAL);
		Mockito.when(doctorRepository.getSpecialistDoctorByHospital(AppData.HOSPITAL.getHospitalId(),AppData.SPECIALIST_TYPE)).thenReturn(AppData.DOCTOR_LIST);
		
		SpecialistDetails specialistDetails=  specialistService.getSpecialistDetails("XYZ","Dentist");		
		assertNotNull(specialistDetails);
	}
	
	@Test
	public void testGetBedDetails() throws ResourceNotFoundException {		
		String count=specialistService.getBedDetails("XYZ");
		assertNotNull("Response count Should not be null", count);
		assertEquals("Number of Beds Available is = 2", count);
	}
	
	@Test
	public void testGetAppointment() throws ResourceNotFoundException {		
		Mockito.when(specialistDtls.getSpecialistInformation()).thenReturn(AppData.SPECIALIST_INFORMATION_LIST);
		AppointmentDetails appointmentDetails=specialistService.getAppointment(AppData.SPECIALIST_NAME, "Monday", "test");
		assertNotNull(appointmentDetails);
	}
	
	
}
