package iterator;

public interface Iterator {
    public Person first();
    public Person last();
    public Person getNext();
    public boolean hasNext();
}
