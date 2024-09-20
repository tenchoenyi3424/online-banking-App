package com.byteseazy.account.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema
public class CustomerDto {

    @NotEmpty(message = "name cannot be empty")
    @Size(min=5, max=30,message="The length of customer name should be between 5 and 30")
    private String name;

    @NotEmpty(message = "Email cannot be empty")
    @Email(message ="Email address should be valid")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;



}
