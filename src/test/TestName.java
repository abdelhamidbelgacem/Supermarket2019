import javax.annotation.Nonnull;

public enum TestName {
    A,
	
    B,
    C;

    public @Nonnull Name toName() {
        return Name.of(name());
    }
}
