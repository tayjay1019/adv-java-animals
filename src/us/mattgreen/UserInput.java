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
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input Cat's name: \n>");
        String catName = keyboard.nextLine();
        System.out.print("Input mice killed by Cat\n>");
        int killed = Integer.parseInt(keyboard.nextLine());
        Cat cat = new Cat(killed, catName);
        zoo.add(cat);
    }

    public void createDog(ArrayList<Talkable> zoo) {
        Scanner keyboard = new Scanner(System.in);
        Boolean friendly;
        System.out.print("Input Dog's name: \n>");
        String dogName = keyboard.nextLine();
        System.out.print("Friendly (Y/N)\n>");
        String friendlyChoice = keyboard.nextLine();
        if(friendlyChoice.toUpperCase().equals("Y") )
        {
            friendly = true;
        }
        else{ friendly = false;}
        Dog dog = new Dog(friendly, dogName);
        zoo.add(dog);
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
