package com.devsuperior.movieflix.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.Notification;
import com.devsuperior.movieflix.entities.User;

public interface NotificationRepository extends JpaRepository <Notification, Long> {
	
	Page <Notification> findByUser (User user, Pageable pageable);
	
}
