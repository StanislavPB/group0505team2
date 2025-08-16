package com.group0505team2.enums;

public enum Category {
    SALARY("Salary"),
    BUSINESS("Business"),
    GIFTS("Gifts"),
    OTHER_INCOME("Other income"),

    FOOD("Food"),
    RENT("Rent"),
    TRANSPORT("Transport"),
    HEALTH("Health"),
    ENTERTAINMENT("entertainment"),
    EDUCATION("Education"),
    OTHER_EXPENSE("Other expense"),
    ;

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }

    public static boolean isValidCategory(String categoryName){
        for(Category category : values()){
            if (category.displayName.equalsIgnoreCase(categoryName)){
                return true;
            }
        }
        return false;
    }
}