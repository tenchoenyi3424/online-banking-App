package com.byteseazy.account.repository;

import com.byteseazy.account.dto.CustomerDto;
import com.byteseazy.account.entity.Customer;
import io.micrometer.core.instrument.distribution.StepBucketHistogram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByMobileNumber(String mobileNumber);




}
