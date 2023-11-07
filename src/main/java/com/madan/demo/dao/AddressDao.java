package com.madan.demo.dao;

import com.madan.demo.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDao extends JpaRepository <Address, Integer> {
}
