package com.fpoly.java6.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fpoly.java6.entities.Review;


public interface ReviewJPA extends JpaRepository<Review, Integer>{

}
