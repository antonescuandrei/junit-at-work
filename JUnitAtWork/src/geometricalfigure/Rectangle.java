package geometricalfigure;

/**
 * Represents rectangles.
 */
class Rectangle extends Figure2D {
    // the name of the figure
    private final String NAME = "RECTANGLE";
    // description of the figure
    private final String DESCRIPTION = "with four straight sides and four right " + 
        "angles, especially one with unequal adjacent sides, in contrast to a " +
        "square";
    
    /**
     * Overridden for nice printing.
     * @return the definition of a rectangle
     */
    @Override
    public String toString() {
        return String.format("%s: a %s %s.", NAME, super.toString(), DESCRIPTION);
    }
}