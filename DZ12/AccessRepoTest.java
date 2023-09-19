package DZ12;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AccessRepoTest {
    @Test
    public void testGetToken() {
        Token tokenTest = new Token("asdf");
        AccessRepo accessRepoTokenTest = new AccessRepo(new User("фио", "qwe", "asdad343ff", "qwe@qwe.ru"), tokenTest);
        assertEquals(accessRepoTokenTest.getToken(), tokenTest);
    }

    @Test
    public void testGetUser() {
        User userTest = new User("фио", "qwe", "asdad343ff", "qwe@qwe.ru");
        AccessRepo accessRepoUserTest = new AccessRepo(userTest,
                new Token("Архитектура ПО"));
        assertEquals(userTest, accessRepoUserTest.getUser());
    }

    @Test
    public void testSetToken() {

    }

    @Test
    public void testSetUser() {

    }
}
