package com.devsuperior.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.Section;

public interface SectionRepository extends JpaRepository <Section, Long> {

}
