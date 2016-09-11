package Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RangeCollection {
    private int min;
    private int max;
    private int size;

    public RangeCollection(int min, int max) {
        this.max = max;
        this.min = min;
        size = max - min + 1;
    }

    public RangeCollection(int max) {
        this(0, max);
    }

    public Iterator iterator() {
        return new NewIterator();
    }

    public class NewIterator implements Iterator {
        int pos = min;

        @Override
        public boolean hasNext() {
            if (pos == size)
                return false;
            else
                throw new NoSuchElementException("This collection has no more elements");

        }

        @Override
        public Object next() {
            if (hasNext())
                return (pos + 1);
            return null;
        }
    }
}

