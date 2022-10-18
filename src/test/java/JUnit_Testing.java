import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnit_Testing
{
    @Test
    void studentUsernameTest(Student S1)
    {
        String a = S1.getName()+S1.getAge();
        String b = S1.getUsername();
        assertEquals(a,b);
    }
    @Test
    void lecturerUsernameTest(Lecturer L1)
    {
        String a = L1.getName()+L1.getAge();
        String b = L1.getUsername();
        assertEquals(a,b);
    }
}
