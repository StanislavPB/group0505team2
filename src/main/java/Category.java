public enum Category {
    SALARY("Зарплата"),
    FOOD("Еда"),
    ENTERTAINMENT("Развлечения"),
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
