package com.powercoffee.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Builder
@Table(name = "coffee_shops")
@NoArgsConstructor
@AllArgsConstructor
public class CoffeeShop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 60)
    private String name;

    @Column(nullable = false, length = 200)
    private String address;

    // Relations
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_id", nullable = false)
    private User admin;
}
