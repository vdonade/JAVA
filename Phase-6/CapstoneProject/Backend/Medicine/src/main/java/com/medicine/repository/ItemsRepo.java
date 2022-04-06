package com.medicine.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.medicine.model.Items;
import com.medicine.model.User;


public interface ItemsRepo extends JpaRepository<Items, Integer>{
	
	
}
