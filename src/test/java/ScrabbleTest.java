import java.util.Arrays;
import java.util.ArrayList;
import static spark.Spark.*;

//to use velocity templates:
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

//libraries probably for running tests
import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {
    @Test
    public void letterValues_returnsValueOfALetter_1() {
        Scrabble app = new Scrabble();
        Integer score = 1;
        assertEquals(score, app.letterValues("A"));
    }
}
