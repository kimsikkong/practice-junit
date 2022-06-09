package chapter_02;

public enum Bool {
    FALSE(0),
    TRUE(1);

    private final int value;

    Bool(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
