package com.nishanthan.ecom.model;

import java.math.BigDecimal;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String desc;
  private String brand;
  private BigDecimal price;
  private String category;
  @JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy")
  private Date releaseDate;
  private boolean available;
  private int quantity;

}
