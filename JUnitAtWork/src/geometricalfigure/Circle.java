package geometricalfigure;

/**
 * Represents circles.
 */
class Circle extends Figure2D {
    // the name of the figure
    private final String NAME = "CIRCLE";
    // adjectives that describe the figure
    private final String ADJECTIVES = "round";
    // description of the figure
    private final String DESCRIPTION = "whose boundary (the circumference) " +
        "consists of points equidistant from a fixed point (the centre)";
    
    /**
     * Overridden for nice printing.
     * @return the definition of a circle
     */
    @Override
    public String toString() {
        return String.format("%s: a %s %s %s.", NAME, ADJECTIVES, 
            super.toString(), DESCRIPTION);
    }
}