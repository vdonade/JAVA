package com.medicine.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicine.model.Items;


public interface CartRepo extends JpaRepository<Items, Integer> {

}


