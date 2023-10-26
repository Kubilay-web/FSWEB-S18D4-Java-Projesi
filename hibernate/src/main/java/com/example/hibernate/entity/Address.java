package com.example.hibernate.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @Column(name = "street")
    private String street;

    @Column(name = "no")
    private String no;

    @Column(name = "city")
    private String city;

    @Column(name = "country")
    private String country;

    @Column(name = "description", nullable = true)
    private String description;

    @OneToOne(mappedBy = "address")
    private Customer customer;

}
