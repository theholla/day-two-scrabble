import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.io.Console;

public class Scrabble {
    public static void main(String[] args) {
/*
    get("/form", (request, response) -> {
          HashMap model = new HashMap();
          model.put("template", "templates/form.vtl");
          return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
*/

    HashMap <String, Integer> letterValues = new HashMap<String, Integer>(); //do we add data type??
    letterValues.put("A", 1);
    letterValues.put("E", 1);
    letterValues.put("I", 1);
    letterValues.put("O", 1);
    letterValues.put("U", 1);
    letterValues.put("L", 1);
    letterValues.put("N", 1);
    letterValues.put("R", 1);
    letterValues.put("S", 1);
    letterValues.put("T", 1);

    letterValues.put("D", 2);
    letterValues.put("G", 2);

    letterValues.put("B", 3);
    letterValues.put("C", 3);
    letterValues.put("M", 3);
    letterValues.put("P", 3);

    letterValues.put("F", 4);
    letterValues.put("H", 4);
    letterValues.put("V", 4);
    letterValues.put("W", 4);
    letterValues.put("Y", 4);

    letterValues.put("K", 5);

    letterValues.put("J", 8);
    letterValues.put("X", 8);

    letterValues.put("Q", 10);
    letterValues.put("Z", 10);


    Console console = System.console();
    String userInput = console.readLine();

    String[] userInputArray = userInput.toUpperCase().split("");

    Integer totalScore = 0;
    for (String letter : userInputArray) {
        Integer letterScore = letterValues.get(letter);
        totalScore += letterScore;
    }
    System.out.println(totalScore);
  }
}
