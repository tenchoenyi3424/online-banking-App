package com.example.loans.service;

import com.example.loans.dto.LoansDto;

public interface ILoanService {

    void createLoan(String mobileNumber);



    boolean updateLoan(LoansDto loansDto);

    LoansDto fetchLoan(String mobileNumber);

    boolean deleteLoan(String mobileNumber);

}
