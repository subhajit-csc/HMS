package org.hms.serviceapp.repository;

import org.hms.serviceapp.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>{

}