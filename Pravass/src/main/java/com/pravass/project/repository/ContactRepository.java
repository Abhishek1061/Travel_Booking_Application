package com.pravass.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pravass.project.model.Contact;

public interface ContactRepository extends JpaRepository<Contact,String> {

}
