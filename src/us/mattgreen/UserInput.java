package us.mattgreen;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {
    public UserInput() {
    }

    public void askQuestion(ArrayList<Talkable> zoo) {
        System.out.println("What type of animal do you want to create?");
        System.out.print("1. Cat\n2. Dog\n3. Teacher\n>");
        userAnimal(zoo);
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
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input Cat's name: \n>");
        String catName = keyboard.nextLine();
        System.out.print("Input mice killed by Cat\n>");
        try {
            int killed = TypeVerifier.verifyInt(keyboard.nextLine());
            Cat cat = new Cat(killed, catName);
            zoo.add(cat);
        } catch (BadInputException b)
        {
            System.out.println(b.getMessage());
        }

    }

    public void createDog(ArrayList<Talkable> zoo) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input Dog's name: \n>");
        String dogName = keyboard.nextLine();
        System.out.print("Friendly (Y/N)\n>");
        try {
            boolean friendly = TypeVerifier.verifyBool(keyboard.nextLine());
            Dog dog = new Dog(friendly, dogName);
            zoo.add(dog);
        } catch (BadInputException b) {
            System.out.println(b.getMessage());
        }
    }

    public void createTeacher(ArrayList<Talkable> zoo) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input Teacher's name: \n>");
        String teacherName = keyboard.nextLine();
        System.out.print("Input Teacher's age\n>");
        int age = Integer.parseInt(keyboard.nextLine());
        Teacher teacher = new Teacher(age, teacherName);
        zoo.add(teacher);
    }


}
