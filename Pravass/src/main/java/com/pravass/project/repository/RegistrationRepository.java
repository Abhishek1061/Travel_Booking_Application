package com.pravass.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pravass.project.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, String> {

	Registration findByEmail(String email);

	boolean existsByEmail(String email);

}
