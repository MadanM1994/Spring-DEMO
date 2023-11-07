package com.madan.demo.dao;

import com.madan.demo.ContactInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactInformationDao extends JpaRepository<ContactInformation , Integer> {
}
