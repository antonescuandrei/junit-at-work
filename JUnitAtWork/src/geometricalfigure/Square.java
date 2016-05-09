package geometricalfigure;

/**
 * Represents squares.
 */
class Square extends Figure2D {
    // the name of the figure
    private final String NAME = "SQUARE";
    // description of the figure
    private final String DESCRIPTION = "with four equal straight sides and " + 
        "four right angles";
    
    /**
     * Overridden for nice printing.
     * @return the definition of a square
     */
    @Override
    public String toString() {
        return String.format("%s: a %s %s.", NAME, super.toString(), DESCRIPTION);
    }
}