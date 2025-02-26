package com.apimicroservicios.Datos;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Datos {

    @Id
    @JsonProperty("id")
    @JsonAlias("id")
    private String id;

    @JsonProperty("user_id")
    @JsonAlias("userId")
    private String userId;

    @JsonProperty("movie_id")
    @JsonAlias("movieId")
    private String movieId;

    @JsonProperty("title")
    @JsonAlias("title")
    private String title;

    @JsonProperty("transaction_type")
    @JsonAlias("transactionType")
    private String transactionType;

    @JsonProperty("transaction_date")
    @JsonAlias("transactionDate")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime transactionDate;

    // Si manejas el campo "price", agrégalo también
    private Double price;

    public Datos() { }

    public Datos(String userId, String movieId, String transactionType, LocalDateTime transactionDate) {
        this.id = UUID.randomUUID().toString();
        this.userId = userId;
        this.movieId = movieId;
        this.title = "";
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.price = null;
    }

    // Getters y Setters

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getMovieId() {
        return movieId;
    }
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }
    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
