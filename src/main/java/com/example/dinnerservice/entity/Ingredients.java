package com.example.dinnerservice.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ingredients")
public class Ingredients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "product")
    private String product;
    @Column(name = "amount")
    private String amount;
    @Column(name = "dinner_id", insertable = false, updatable = false)
    private Long dinner_id;

    @ManyToOne
    @JoinColumn(name = "dinner_id", referencedColumnName = "id")
    @JsonBackReference
    private Dinner dinner;
}
