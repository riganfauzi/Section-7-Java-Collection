package collection;

import collection.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("Rigan");

        person.addHobby("Game");
        person.addHobby("Sleep");

        doSomethingWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()){
            System.out.println(hobby);
        }

    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("Bukan Hobi");
    }
}
