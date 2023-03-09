package com.devsuperior.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.Topic;

public interface TopicRepository extends JpaRepository <Topic, Long> {

}
