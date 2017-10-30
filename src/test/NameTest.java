import junitx.extensions.EqualsHashCodeTestCase;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Enclosed.class)
public class NameTest {
    public static class NameEqualsAndHashCodeTest extends EqualsHashCodeTestCase {
        public NameEqualsAndHashCodeTest(String name) {
            super(name);
        }

        @Override
        protected Object createInstance() throws Exception {
            return TestName.A.toName();
        }

        @Override
        protected Object createNotEqualInstance() throws Exception {
            return TestName.B.toName();
        }
    }
}
