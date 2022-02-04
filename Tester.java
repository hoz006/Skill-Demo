import static org.junit.Assert.*;
import org.junit.*;

public class Tester {
    @Test
    public void test(){
        Square test1 = new Square(1);
        assertEquals(4, test1.result());
    }
}


//javac -cp .:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar Tester.java Square.java
//java -cp .:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore Tester