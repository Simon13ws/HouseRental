package com.houserental.houserental;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Houses")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private User owner;

    private int numberOfRooms;

    private String country;

    private String region;

    private String postCode;

    private String street;

    private String houseNumber;

    private BigDecimal rent;
}
