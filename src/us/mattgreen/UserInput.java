package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    public UserInput() {
    }

    public void askQuestion() {
        System.out.println("What type of animal do you want to create?");
        System.out.print("1. Cat\n2. Dog\n3. Teacher\n>");
    }

    public void userAnimal (ArrayList<Talkable> zoo) {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        switch (input) {
            case "1":
                createCat(zoo);
                break;
            case "2":
                createDog(zoo);
                break;
            case "3":
                createTeacher(zoo);
                break;
            default:
                System.out.println("Not a valid number");
        }
    }

    public void createCat(ArrayList<Talkable> zoo) {
        Cat cat = new Cat(0, "Trixy");
        zoo.add(cat);
    }

    public void createDog(ArrayList<Talkable> zoo) {
        Dog dog = new Dog(true, "Whiskey");
        zoo.add(dog);
    }

    public void createTeacher(ArrayList<Talkable> zoo) {
        Teacher teacher = new Teacher(32, "Matt");
        zoo.add(teacher);
    }


}
