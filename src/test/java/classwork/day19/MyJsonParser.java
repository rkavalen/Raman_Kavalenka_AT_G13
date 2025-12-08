package classwork.day19;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class MyJsonParser {
    ObjectMapper objectMapper = new ObjectMapper();

    public void fromJson() throws IOException {
        Recipe recipe = objectMapper
                .readValue(new File("src/test/resources/recipes/recipe.json"), Recipe.class);
        System.out.println(recipe);
    }

    public void toJson() throws IOException {
        Recipe recipe = new Recipe("Salad",
                Arrays.asList(
                        new Ingredient("Tomato", 2),
                        new Ingredient("Cucumber", 1)),
                3);

        objectMapper.writerWithDefaultPrettyPrinter()
                .writeValue(new File("src/test/resources/recipes/recipe2.json"), recipe);
    }

    public static void main(String[] args) throws IOException {
        MyJsonParser myJsonParser = new MyJsonParser();
        myJsonParser.fromJson();
        myJsonParser.toJson();
    }
}

