package com.medicine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicine.model.Items;
import com.medicine.repository.ItemsRepo;

@Service
public class ItemService {

	@Autowired
	private ItemsRepo repo;

	public Items saveItem(Items item) {
		return repo.save(item);
	}

	public List<Items> getAllUser() {
		return repo.findAll();
	}

}
