package geometricalfigure;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains the main() function which starts program execution.
 */
public class Main {
    /**
     * Constructs a list of geometrical figures and prints their descriptions.
     * @param args command-line parameters
     */
    public static void main(String[] args) {
        // create a list to hold geometrical figures
        List<GeometricalFigure> geometricalFigures = new ArrayList<>();
        // add new figures to the list
        geometricalFigures.add(new Circle());
        geometricalFigures.add(new Rectangle());
        geometricalFigures.add(new Square());
        geometricalFigures.add(new Triangle());
        
        // print the description of each figure
        for (GeometricalFigure figure : geometricalFigures)
            System.out.println(figure);
    }
}