package rocks.zipcode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


// Student should write this test class
public class PasswordValidatorTest {
    // TODO: Write tests for the PasswordValidator class
    private PasswordValidator passwordValidator= new PasswordValidator();

    @BeforeEach
    void setUp() {

    }

//    @Test
//    void testIsValid () {
//        this.passwordValidator = PasswordValidator;
//        String passwordnull = "bob";
//        assertEquals(true, passwordValidator.isValid(passwordnull));
//    }

    @Test
    void testContainsUppercase () {
        String passwordlower = "lowercase";
        assertEquals(false, );
    }


    // Test cases should include:
    // - Valid passwords
    // - Passwords that are too short or too long
    // - Passwords missing uppercase, lowercase, digits, or special chars
    // - Edge cases like null or empty strings
}
