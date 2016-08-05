package TemplatePattern;

/**
 * Created by ahmetatalay on 05/08/16.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        System.out.println();

        game = new Football();
        game.play();
    }
}
