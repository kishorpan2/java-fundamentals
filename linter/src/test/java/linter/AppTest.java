/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void testAppHasAnError(){
        String[] test = new String[]{"/src/main/resources/test.js"};

        App obj = new App();
        int errorCount =0;

       //            expected,        actual
        assertEquals(obj.main(test), errorCount);
    }
}
