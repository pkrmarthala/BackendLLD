package ObserverDesignPattern;

import java.util.Observable;

public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}

// anyone who wants to observe, must implement / have the update() method.