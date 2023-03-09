package com.devsuperior.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.Course;

public interface CourseRepository extends JpaRepository <Course, Long> {

}
