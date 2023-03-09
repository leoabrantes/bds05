package com.devsuperior.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.Enrollment;
import com.devsuperior.movieflix.entities.pk.EnrollmentPK;

public interface EnrollmentRepository extends JpaRepository <Enrollment, EnrollmentPK> {

}
