package geometricalfigure;

/**
 * Represents triangles.
 */
class Triangle extends Figure2D {
    // the name of the figure
    private final String NAME = "TRIANGLE";
    // description of the figure
    private final String DESCRIPTION = "with three straight sides and three "
        + "angles";
    
    /**
     * Overridden for nice printing.
     * @return the definition of a triangle
     */
    @Override
    public String toString() {
        return String.format("%s: a %s %s.", NAME, super.toString(), DESCRIPTION);
    }
}