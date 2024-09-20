
package com.byteseazy.account.service;

import com.byteseazy.account.dto.CustomerDto;

public interface IAccountService {

    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);
    boolean updateAccount(CustomerDto customerDto);

    boolean deleteAccount(String mobileNumber);




}
