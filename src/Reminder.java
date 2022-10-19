
/**
 * Abstract Reminder Class for Visitor Pattern
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.0
 * @since 10-17-2022
 */
public abstract class Reminder {

    public abstract Reminder accept(NodeVisitor visitor);

}
