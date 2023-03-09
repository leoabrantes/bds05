package com.devsuperior.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.Course;
import com.devsuperior.movieflix.entities.Offer;

public interface OfferRepository extends JpaRepository <Offer, Long> {

}
