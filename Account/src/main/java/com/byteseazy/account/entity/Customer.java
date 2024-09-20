package com.byteseazy.account.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString

public class Customer extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator="native")
    @GenericGenerator(name="native ", strategy = "native")
    @Column(name ="customer_id")
    private Long customerId;

    private String name;
    private String email;
    private String mobileNumber;






}
