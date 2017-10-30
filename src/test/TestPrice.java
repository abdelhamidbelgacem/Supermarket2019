import javax.annotation.Nonnull;

public enum TestPrice {
    ZERO(0),
	
    FIVE(5),
    SEVEN(7),
    TEN(10),
    TWENTY(20),
    FIFTY(50);

    private final double value;

    TestPrice(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public @Nonnull Price toPrice() {
        return Price.of(value);
    }
}
