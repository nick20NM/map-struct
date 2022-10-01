package com.alpha.www.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.www.entity.Contact;


@Repository
public interface ContactRepository  extends JpaRepository<Contact, Long>{

}
