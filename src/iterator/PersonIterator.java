package iterator;

public class PersonIterator implements Iterator{
    private int current = 0;

    @Override
    public Person first() {
        if(PersonCollection.people.size() != 0)
            return PersonCollection.people.get(0);
        return null;
    }

    @Override
    public Person last() {
        if(PersonCollection.people.size() != 0)
            return PersonCollection.people.get(PersonCollection.people.size()-1);
        return null;
    }

    @Override
    public Person getNext() {
        //if(PersonCollection.people.size() == current++)
            return PersonCollection.people.get(current++);

    }

    @Override
    public boolean hasNext() {
        if(PersonCollection.people.size() == current)
            return false;
        return true;
    }
}
