package Generics;

public class Pair <V, S> {
    V first;
    S second;
    int x;
//    public Pair(V first, S second) {
//        this.first = first;
//        this.second = second;
//    }

    public V getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public void setFirst(V first) {
        this.first = first;
    }

    public void setSecond(S second) {
        this.second = second;
    }

}
