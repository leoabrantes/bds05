package com.devsuperior.movieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.movieflix.entities.Reply;

public interface ReplyRepository extends JpaRepository <Reply, Long> {

}
