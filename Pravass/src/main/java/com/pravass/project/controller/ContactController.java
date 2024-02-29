package com.pravass.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pravass.project.model.Contact;
import com.pravass.project.repository.ContactRepository;

//@RestController
@Controller
@RequestMapping("/contact")
public class ContactController {

	@Autowired
	ContactRepository repo;

	@GetMapping("/form")
	public String contactForm() {
		return "contact";
	}

	@PostMapping("/directhome")
	public String homePage(@ModelAttribute Contact contact) {
		repo.save(contact);
		return "home";
	}

	@GetMapping("/{email}")
	public ResponseEntity<Contact> getContactById(@PathVariable("email") String email) {
		Contact contact = repo.findById(email).orElse(null);
		if (contact != null) {
			return new ResponseEntity<>(contact, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Contact>> getAllRecords() {
		List<Contact> contacts = repo.findAll();
		return new ResponseEntity<>(contacts, HttpStatus.OK);
	}
	
//	@GetMapping("/getAll")
//	public List<Contact> getAllRecords() {
//		List<Contact> contact = repo.findAll();
//		return contact ;
//	}
	
	

}
