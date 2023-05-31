import org.junit.jupiter.api.Test;

import javax.jws.soap.SOAPBinding;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void testFunctionCriterion1() {

        User user1 = new User("user1", "Password123", "user1@gmail.com");
        User user2 = new User("user2", "abc123", "user2@gmail.com");

        List<User> allUsers = new ArrayList<>();
        allUsers.add(user1);

        assertTrue(SILab2.function(user1, allUsers));
        assertFalse(SILab2.function(user2, allUsers));
    }

    @Test
    public void testFunctionCriterion2() {

        User user1 = new User("user1", "Passw0rd123", "user1@gmail.com");
        User user2 = new User("user2", "ads123", "user2@gmail.com");
        User user3 = new User("user3", "Password123", "user3@gmail.com");

        List<User> allUsers = new ArrayList<>();
        allUsers.add(user1);
        allUsers.add(user2);

        assertFalse(SILab2.function(user1, allUsers));
        assertTrue(SILab2.function(user2, allUsers));
        assertFalse(SILab2.function(user3, allUsers));
    }

    @Test
    public void testFunctionInvalidEmailFormat() {

        User user = new User("user", "Password123", "invalidemail");

        List<User> allUsers = new ArrayList<>();

        assertFalse(SILab2.function(user, allUsers));
    }

    @Test
    public void testFunctionPasswordOnlySpecialCharacters() {

        User user = new User("user", "!@#$%^&*", "user@gmail.com");

        List<User> allUsers = new ArrayList<>();

        assertFalse(SILab2.function(user, allUsers));
    }

    @Test
    public void testFunctionPasswordOnlyWhitespaceCharacters() {

        User user = new User("user", "     ", "user@gmail.com");

        List<User> allUsers = new ArrayList<>();

        assertFalse(SILab2.function(user, allUsers));
    }

    @Test
    public void testFunctionCaseInsensitiveUsernamePasswordMatch() {

        User user = new User("user", "UsErNaMe", "user@gmail.com");

        List<User> allUsers = new ArrayList<>();

        assertFalse(SILab2.function(user, allUsers));
    }

    @Test
    public void testFunctionEmptyPassword() {

        User user = new User("user", "", "user@gmail.com");

        List<User> allUsers = new ArrayList<>();

        assertFalse(SILab2.function(user, allUsers));
    }

    @Test
    public void testFunctionEmptyEmail() {

        User user = new User("user", "Password123", "");

        List<User> allUsers = new ArrayList<>();

        SILab2.function(user, allUsers);
    }
}