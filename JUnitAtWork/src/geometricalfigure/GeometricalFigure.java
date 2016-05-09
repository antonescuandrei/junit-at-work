package geometricalfigure;

/**
 * Represents geometrical figures.
 */
abstract class GeometricalFigure {
    // the description of an abstract geometrical figure
    private final String DESCRIPTION = "figure";
    
    /**
     * Overridden for nice printing.
     * @return the description of an abstract geometrical figure
     */
    @Override
    public String toString() {
        return DESCRIPTION;
    }
}