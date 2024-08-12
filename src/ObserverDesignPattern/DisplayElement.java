package ObserverDesignPattern;

public interface DisplayElement {
    public void display();
}

/* Interface Segregation principle.
 * Just to make sure every display is implementing this interface and have the common display() method.
 * All the display elements must implement this method ONLY, not any other methods.
 */
