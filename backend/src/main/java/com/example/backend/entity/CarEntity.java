package com.example.backend.entity;

import com.example.backend.entity.enums.CarState;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@Entity
@Table(name = "cars")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CarEntity extends AbstractAuditing<String> {
    @Id
    String id;

    @Column(name = "car_brand", nullable = false)
    String carBrand;

    @Column(name = "max_speed", nullable = false)
    float maxSpeed;

    @Column(name = "state", nullable = false)
    @Enumerated(EnumType.STRING)
    CarState state;

    @Column(name = "seats_num", nullable = false)
    int seatsNumber;

    @Column(name = "rental_price_per_day", nullable = false)
    float rentalPrice;

    @Column(name = "rating")
    float rating;
}
