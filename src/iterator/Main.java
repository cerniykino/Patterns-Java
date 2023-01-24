package iterator;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jakub", 21);
        Person p2 = new Person("Matus", 30);
        Person p3 = new Person("Braxo", 44);
        Person p4 = new Person("Ivan", 43);
        Person p5 = new Person("Jozef", 17);

        PersonCollection personCollection = new PersonCollection();

        personCollection.add(p1);
        personCollection.add(p2);
        personCollection.add(p3);
        personCollection.add(p4);
        personCollection.add(p5);

        Iterator iterator = personCollection.iterator();

        while(iterator.hasNext()){
            Person person = iterator.getNext();
            System.out.println("Meno: " + person.getName() + " age:" + person.getAge());
        }

        Person person = iterator.first();
        System.out.println("Meno: " + person.getName() + " age:" + person.getAge());

        person = iterator.last();
        System.out.println("Meno: " + person.getName() + " age:" + person.getAge());
    }
}
