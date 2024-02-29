package com.pravass.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;

import com.pravass.project.model.Login;
import com.pravass.project.repository.LoginRepository;

@Controller
//@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	LoginRepository repo;

	@GetMapping("/Form")
	public String loginForm() {
		return "login";
	}

	@PostMapping("/homepage")
	public String homePage(@ModelAttribute Login login) {
		repo.save(login);
		return "home";
	}

	// this API is already present in registration controller so delete it form
	// either of files.
	@RequestMapping("/del/{email}")
	public String deleteValue(@PathVariable String email) {
		repo.deleteById(email);
		return "login";
	}

	@PutMapping("/setValue/{email}/{password}")
	public String updatePassword(@PathVariable String email, @PathVariable String password) {
		Login login = repo.findByEmail(email);

		if (login != null) {
			login.setPassword(password);
			repo.save(login);
			return "home";
		} else {
			return "error";
		}
	}

}
