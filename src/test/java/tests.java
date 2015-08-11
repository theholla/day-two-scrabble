import java.util.Arrays;
import java.util.HashMap;
import org.junit.*;
import static org.junit.Assert.*;

public class Scrabble {

/*
    @Test
    public void scrabble_LettersFromGroupOne_1() {
    Scrabble testScrabble = new Scrabble();
    assertEquals(3, testScrabble.scrabble('A'));
    }

    */
    @Test
    public void scrabbleScore_returnsScrabbleGroupOne_1() {
        Scrabble app = new Scrabble();
        Integer score = 1;
        assertEquals(score, app.scrabbleGroupOne('A'));
    }
}
