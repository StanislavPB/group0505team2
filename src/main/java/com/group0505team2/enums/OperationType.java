package com.group0505team2.enums;

public enum OperationType {
    INCOME("Income"),
    EXPENSE("Expense"),
    ;

    private final String displayName;

    OperationType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return "OperationType{" +
                "displayName='" + displayName + '\'' +
                '}';
    }

}