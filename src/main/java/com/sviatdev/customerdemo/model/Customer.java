package com.sviatdev.customerdemo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

//Simple JavaBean domain object that represents Customer
@Entity
@Table(name = "customers")
@Getter
@Setter
@ToString
public class Customer extends BaseEntity{
    @Column(name="firstname")
    private String firstName;

    @Column(name="lastname")
    private String lastName;

    @Column(name="address")
    private String address;

    @Column(name="budget")
    private BigDecimal budget;
}
