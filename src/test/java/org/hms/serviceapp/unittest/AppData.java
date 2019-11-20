package org.hms.serviceapp.unittest;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hms.serviceapp.entity.Doctor;
import org.hms.serviceapp.entity.Hospital;
import org.hms.serviceapp.entity.SpecialistDtls.SpecialistInformation;

public class AppData {

	public static final String HOSPITAL_NAME="Appolo Hospital";
	public static final String HOSPITAL_ID="APL122";
	public static final String SPECIALIST_TYPE ="Dentist";
	public static final String CREATED_BY ="Super User1";
	public static final Date CREATED_ON = new Date();
	public static final Hospital HOSPITAL = getHospital();
	public static final Doctor DOCTOR=getDoctor();
	public static final List<Doctor> DOCTOR_LIST=getDoctorList();
	public static final String AVAILABLE_DAY = "Monday,WednesDay";
	public static final String AVAILABLE_TIME = "10 12";
	public static final String IS_AVAILABLE = "Y";
	public static final String SPECIALIST_NAME = "Edward";
	public static final SpecialistInformation SPECIALIST_INFORMATION = getSpecialistInformation();
	public static final List<SpecialistInformation> SPECIALIST_INFORMATION_LIST = getSpecialistInformations();
	
	public static Hospital getHospital() {
		Hospital hospital=new Hospital();
		hospital.setHospitalId(HOSPITAL_ID);
		hospital.setHospitalName(HOSPITAL_NAME);
		hospital.setCreatedBy(CREATED_BY);
		hospital.setCreatedOn(CREATED_ON);
		hospital.setModifiedBy(CREATED_BY);
		hospital.setModifiedOn(CREATED_ON);
		return hospital;
	}
	public static Doctor getDoctor() {
		Doctor doctor=new Doctor();
		doctor.setId(12222);
		doctor.setHospitalId(HOSPITAL_ID);
		doctor.setName(CREATED_BY);
		doctor.setType(SPECIALIST_TYPE);
		doctor.setDateAvailable(AVAILABLE_DAY);
		doctor.setTimeAvailable(AVAILABLE_TIME);
		doctor.setStatus(IS_AVAILABLE);
		return doctor;
	}
	public static List<Doctor> getDoctorList() {
		List<Doctor> doctors=new ArrayList<Doctor>();
		doctors.add(DOCTOR);
		return doctors;
	}
	public static SpecialistInformation getSpecialistInformation() {
		SpecialistInformation specialistInformation=new SpecialistInformation();
		specialistInformation.setName(SPECIALIST_NAME);
		specialistInformation.setDay(AVAILABLE_DAY);
		specialistInformation.setTime(AVAILABLE_TIME);
		return specialistInformation;
	}	
	public static List<SpecialistInformation> getSpecialistInformations() {
		List<SpecialistInformation> specialistInformations= new ArrayList<>();
		specialistInformations.add(SPECIALIST_INFORMATION);
		return specialistInformations;
	}
			
}
