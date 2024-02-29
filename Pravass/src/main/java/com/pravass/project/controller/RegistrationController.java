package com.pravass.project.controller;

//import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.pravass.project.model.Registration;
import com.pravass.project.repository.RegistrationRepository;

@Controller
@RequestMapping("/registration")
public class RegistrationController {
	
	@Autowired
	RegistrationRepository repo ;

	@GetMapping("/reg")
	public String registrationForm() {
		return "registration";
	}

	@PostMapping("/add")
	public String addDetails(@ModelAttribute Registration registration) {
		repo.save(registration);
		return "home";
	}

	@RequestMapping("/delete/{email}")
	public String deleteValue(@PathVariable String email) {
		repo.deleteById(email);
		return "login";
	}
	
	
	@PutMapping("/updateName/{email}/{name}")
	public String updateName(@PathVariable String email, @PathVariable String name) {
	    Registration registration = repo.findByEmail(email);
	    if (registration != null) {
	    	registration.setName(name);
	        repo.save(registration);
	        return "Name" + name + "updated Successfully"; 
	    } else {
	        return "error";
	    }
	}
	
	@PutMapping("/updatePassword/{email}/{password}")
	public String updatePassword(@PathVariable String email, @PathVariable String password) {
		Registration registration = repo.findByEmail(email);

	    if (registration != null) {
	    	registration.setPassword(password);
	        repo.save(registration);
	        return "Password" + password + "updated Successfully"; 
	    } else {
	        return "error"; 
	    }
	}
	
	@PutMapping("/updateDOB/{email}/{dob}")
	public String updateDOF(@PathVariable String email, @PathVariable String dob) {
		Registration registration = repo.findByEmail(email);

	    if (registration != null) {
	    	registration.setDOB(dob);
	        repo.save(registration);
	        return "Bate of birth" + dob + "updated Successfully"; 
	    } else {
	        return "error"; 
	    }
	}
	
	@PutMapping("/updateCountry/{email}/{country}")
	public String updateCountry(@PathVariable String email, @PathVariable String country) {
		Registration registration = repo.findByEmail(email);

	    if (registration != null) {
	    	registration.setCountry(country);
	        repo.save(registration);
	        return "Country" + country + "updated Successfully"; 
	    } else {
	        return "error"; 
	    }
	}
	
	@PutMapping("/updateState/{email}/{state}")
	public String updateState(@PathVariable String email, @PathVariable String state) {
		Registration registration = repo.findByEmail(email);

	    if (registration != null) {
	    	registration.setState(state);
	        repo.save(registration);
	        return "State" + state + "updated Successfully"; 
	    } else {
	        return "error"; 
	    }
	}
	

//	@GetMapping("/get")
//	public List<Registration> getValue() {
//		System.out.println(repo.findAll()); // findAll() method with List<> return type we get output in web.
//		return repo.findAll(); // @Restcontroller is needed to show JSON
//	}
	
//	@RequestMapping("/update/{email}")
//	public String updateEmail(@PathVariable String email, @RequestBody Registration updatedReg) {
//		System.out.println(updatedReg.getName());
//		Optional<Registration> optionalEmployee = repo.findById(email);
//		if(optionalEmployee.isPresent()) {
//			Registration exisitingReg = optionalEmployee.get();
//			exisitingReg.setName(updatedReg.getName());
//			exisitingReg.setEmail(updatedReg.getEmail());
//			exisitingReg.setPassword(updatedReg.getPassword());
//			exisitingReg.setDOB(updatedReg.getDOB());
//			exisitingReg.setCountry(updatedReg.getCountry());
//			exisitingReg.setContact(updatedReg.getContact());
//			exisitingReg.setState(updatedReg.getState());
//			repo.save(exisitingReg);
//			return "register";
//		}else {
//			return "error";
//		}
//	}

}


