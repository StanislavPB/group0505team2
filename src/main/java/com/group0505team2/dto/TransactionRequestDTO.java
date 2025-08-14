package com.group0505team2.dto;


import java.time.LocalDate;

public class TransactionRequestDTO {
    private Integer id;
    private String date;
    private String desc;
    private String categoryName;
    private Double amount;
    private int accountName;

    public TransactionRequestDTO(Integer id, String date, String desc, String categoryName, Double amount, int accountName) {
        this.id = id;
        this.date = date;
        this.desc = desc;
        this.categoryName = categoryName;
        this.amount = amount;
        this.accountName = accountName;
    }

    public Integer getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getDesc() {
        return desc;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public Double getAmount() {
        return amount;
    }

    public int getAccountName() {
        return accountName;
    }
}
