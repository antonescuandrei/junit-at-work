package geometricalfigure;

/**
 * Represents 2D (plane) geometrical figures.
 */
abstract class Figure2D extends GeometricalFigure {
    // the description of an abstract 2D (plane) figure
    private final String DESCRIPTION = "plane";
    
    /**
     * Overridden for nice printing.
     * @return the description of an abstract 2D (plane) figure
     */
    @Override
    public String toString() {
        return String.format("%s %s", DESCRIPTION, super.toString());
    }
}