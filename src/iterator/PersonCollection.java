package iterator;


import java.util.ArrayList;
import java.util.List;

public class PersonCollection{

    public static List<Person> people = new ArrayList<>();

    public PersonIterator iterator(){return new PersonIterator();}

    public void add(Person person){people.add(person);}

}
