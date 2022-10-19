/**
 * SER -515 List iterator class for implementing iterator pattern
 *
 * @author Nirmit Agrawal, nagraw18@asu.edu
 * @version 1.0
 * @since 10-17-2022
 */

import java.util.Iterator;

public abstract class ListIterator
{
    public abstract boolean hasNext(Iterator iterator);
    public abstract void MoveToHead(Iterator iterator);
    public abstract String Next(Iterator iterator);
    public abstract void Remove(Iterator iterator);

}
