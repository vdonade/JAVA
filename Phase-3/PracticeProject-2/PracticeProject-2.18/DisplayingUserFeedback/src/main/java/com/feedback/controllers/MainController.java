package com.feedback.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.entity.Feedback;
import com.feedback.entity.FeedbackRepo;

@RestController
@RequestMapping("/myapi")
public class MainController {
	
	@Autowired
	private FeedbackRepo feedbackRepo;
	@PostMapping("/")
	public ResponseEntity<Feedback> createFeedback(@RequestBody Feedback feedback){
		try {
			Feedback f=feedbackRepo.save(feedback);
			return new ResponseEntity<>(f,HttpStatus.CREATED);
		}
		catch(Exception e)
		{
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

