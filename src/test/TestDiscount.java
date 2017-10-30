import javax.annotation.Nonnull;
public enum TestDiscount {
	
	
    FIRST(TestAmount.FIVE, TestPrice.TEN),
    SECOND(TestAmount.TWO, TestPrice.FIVE),
    THIRD(TestAmount.THREE, TestPrice.SEVEN);

    private final TestAmount amount;
	
    private final TestPrice  price;

    TestDiscount(@Nonnull TestAmount amount, @Nonnull TestPrice price) {
        this.amount = amount;
        this.price = price;
    }

    public @Nonnull Discount toDiscount() {
        return aDiscount().forProductAmount(amount.toInt())
                          .withPrice(price.getValue())
                          .create();
    }
}
