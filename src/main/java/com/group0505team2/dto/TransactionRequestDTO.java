package com.group0505team2.dto;


import com.group0505team2.enums.Category;

import java.time.LocalDate;

public class TransactionRequestDTO {
    private int id;
    private LocalDate date;
    private String desc;
    private Category category;
    private double amount;
    // добавить номер account по которому будет операция

    public TransactionRequestDTO(int id, LocalDate date, String desc, Category category, double amount) {
        this.id = id;
        this.date = date;
        this.desc = desc;
        this.category = category;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDesc() {
        return desc;
    }

    public Category getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }
}
