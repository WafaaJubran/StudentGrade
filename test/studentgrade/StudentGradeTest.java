package studentgrade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/* JUnit 4 */
public class StudentGradeTest {
    
   public StudentGradeTest(){   
   }
   
 @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeClass");
    }
    
    @AfterClass
    public static void afterClass() {
        System.out.println("AfterClass");
    }
    
    @Before
    public void before() {
        System.out.println("Before");
    }
    
    @After
    public void after() {
        System.out.println("After");
    }
    
    @Test
    public void testGetGrade95() {
        System.out.println("getGrade 95");
        int mark = 95;
        String expResult = "A";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetGrade85() {
        System.out.println("getGrade 85");
        int mark = 85;
        String expResult = "B";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetGrade75() {
        System.out.println("getGrade 75");
        int mark = 75;
        String expResult = "F";
        String result = StudentGrade.getGrade(mark);
        assertEquals(expResult, result);
    }
}
