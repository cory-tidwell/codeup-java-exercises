
import java.util.Arrays;


public class ArraysExercises {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers); //returns the memory location of the array

        Person[] persons = new Person[3];
        persons[0] = new Person("Gohan");
        persons[1] = new Person("Vegeta");
        persons[2] = new Person("Goku");
        Person Bulma = new Person("Bulma");

//        for (Person person : persons) {
//            System.out.println(person.getName());
//        }

        Person[] groupOfPeople = addPerson(persons, Bulma);

        for (Person person : groupOfPeople){
            System.out.println(person.getName());
        }
    }
    public static Person[] addPerson(Person[] persons, Person addPerson){
        Person[] personGroup = Arrays.copyOf(persons, persons.length + 1);
        personGroup[personGroup.length - 1] = addPerson;
        return personGroup;
    }

}
