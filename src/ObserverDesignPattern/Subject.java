package ObserverDesignPattern;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}

// Whoever wants to be a provider, they need to implement these methods.