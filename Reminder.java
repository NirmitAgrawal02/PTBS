
/**
 * Abstract Reminder Class for Visitor Pattern
 *
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.0
 * @since 10-17-2022
 */
public abstract class Reminder {

    @SuppressWarnings("all")
    public abstract Reminder accept(NodeVisitor visitor);

}
