package AdderSubtractorAtomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Value {
    public AtomicInteger value = new AtomicInteger(0);
}

// CAS: Compare and Swap Algo used behind the scenes