import java.util.Arrays;
import java.util.HashMap;
import org.junit.*;
import static org.junit.Assert.*;

public class Scrabble {

    @Test
    public void letterValues_returnsValueOfALetter_1() {
        Scrabble app = new Scrabble();
        Integer score = 1;
        assertEquals(score, app.letterValues("A"));
    }
}
