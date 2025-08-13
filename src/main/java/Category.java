public enum Category {
    SALARY("Salary"),
    FOOD("Food"),
    ENTERTAINMENT("entertainment"),
    ;

    private String displayName;

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
}
