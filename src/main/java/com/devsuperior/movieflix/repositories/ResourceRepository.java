package com.devsuperior.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.Resource;

public interface ResourceRepository extends JpaRepository <Resource, Long> {

}
