package com.nissan.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.nissan.model.Customer;
@Repository
public interface ICutomerDAO extends JpaRepositoryImplementation<Customer, Integer> {

}
