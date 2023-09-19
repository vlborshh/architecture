package DZ12;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccessMenuTest {
    @Test
    public void testGetToken() {
        Token tokenTest = new Token("asdf");
        AccessRepo accessRepoTokenTest = new AccessRepo(new User("Иван", "qwe", "asdad343ff", "qwe@qwe.ru"), tokenTest);
        assertEquals(accessRepoTokenTest.getToken(), tokenTest);
    }

    @Test
    public void testGetUser() {
        User userTest = new User("Иван", "qwe", "asdad343ff", "qwe@qwe.ru");
        AccessRepo accessRepoUserTest = new AccessRepo(userTest,
                new Token("asdf"));
        assertEquals(userTest, accessRepoUserTest.getUser());
    }

    @Test
    public void testSetToken() {
        Token tokenTest = new Token("asdf");
        AccessRepo accessRepoTokenTest = new AccessRepo(new User("Иван", "qwe", "asdad343ff", "qwe@qwe.ru"), tokenTest);
        accessRepoTokenTest.setToken(tokenTest);
        assertEquals(accessRepoTokenTest.getToken(), tokenTest);
    }

    @Test
    public void testSetUser() {
        User userTest = new User("Иван", "qwe", "asdad343ff", "qwe@qwe.ru");
        AccessRepo accessRepoUserTest = new AccessRepo(new User("Петр", "qwe", "asdad343ff", "qwe@qwe.ru"),
                new Token("Архитектура ПО"));
        accessRepoUserTest.setUser(userTest);
        assertEquals(userTest, accessRepoUserTest.getUser());
    }

    @Test
    public void testRemoveToken() {
        Token tokenTest = new Token("asdf");
        AccessRepo accessRepoTokenTest = new AccessRepo(new User("Иван", "qwe", "asdad343ff", "qwe@qwe.ru"), tokenTest);
        assertEquals(accessRepoTokenTest.getToken(), tokenTest);
        // удаление токена

    }
}
