package com.sda.onlineAuction.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String description;
    private Integer startingPrice;
    private Category category;
    private LocalDateTime endDateTime;

    @Lob
    private byte[] image;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private List<Bid> bidsList;

}
