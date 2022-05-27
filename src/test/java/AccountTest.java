import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class AccountTest {

    private final String name;
    private final boolean expected;

    public AccountTest (String name, boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getNameData() {
        return new Object[][]{
                {"Денис Уланов", true},
                {"ДенисУланов", false},
                {" ДенисУланов", false},
                {"ДенисУланов ", false},
                {"Денис  Уланов", false},
                {"Денис   Уланов", false},
                {"  ДенисУланов", false},
                {"ДенисУланов  ", false},
                {"Де", false},
                {"Денис АлександровичУланов", false}
        };
    }

    @Test
    public void checkNameToEmbossTest() {
            Account account = new Account(name);
            boolean actual = account.checkNameToEmboss();
            assertEquals(expected, actual);
    }
}