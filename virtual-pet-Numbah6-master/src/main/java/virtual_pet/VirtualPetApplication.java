package virtual_pet;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import java.util.List;
import java.util.ArrayList;

public class VirtualPetApplication {
    //Adding instance variables 
    private static String name;
    private static int hunger = 100;
    private static int thirst = 100;
    private int bladder = 0;
    private static int boredLevel = 0;
    private int sickness = 0;
    private static int tiredness = 0;
    private int eatPoints = 50;

    //Constructor 
    public VirtualPetApplication(String name, int hunger, int thirst, int boredLevel, int tiredness){
        VirtualPetApplication.name = name;
        VirtualPetApplication.hunger = hunger;
        VirtualPetApplication.thirst = thirst;
        VirtualPetApplication.boredLevel = boredLevel;
        VirtualPetApplication.tiredness = tiredness;
    }

    //Gets
    public String petName(){
        return name;
    }

    public int petHunger(){
        return hunger;
    }

    public int petThirst(){
        return thirst;
    }

    public int petBoredLevel(){
        return boredLevel;
    }

    public int petTired(){
        return tiredness;
    }

    public static void displayPets(){
        System.out.println(name);
        System.out.println("Hunger: "+hunger);
        System.out.println("Thirst: "+thirst);
        System.out.println("Boredom: "+boredLevel);
        System.out.println("Tiredness "+tiredness);
    }
    



    public static void eat(int petChoice){
    hunger += 30;
    thirst -= 5;
    System.out.println(name+"has eaten a hearty meal!");
}

public static void drink(int petChoice){
    thirst += 30;
    System.out.println(name+" has drunk some water!");
}

public static void play(int petChoice){
    boredLevel -= 20;
    System.out.println("You took "+name+" to the park to play with them");
}

public static void sleep(int petChoice){
    tiredness -= 20;
    System.out.println(name+" Went to sleep...now"+name+" they feels refreshed");
}

public static void lazy(int petChoice){
    System.out.println("You and "+name+" decided to be lazy right now");
    hunger -= 10;
    thirst -= 10;
    boredLevel += 10;
    tiredness += 10;
}

public static void tick(){
    hunger -= 5;
    thirst -= 5;
    boredLevel += 5;
    tiredness += 5;
}
    public static void main(String[] args) {
        List<String> questions = new ArrayList<>();
        questions.add("What would you like to do with "+name+" ?");
        questions.add("1.Feed "+name+" ?");
        questions.add("2. Give "+name+" water?");
        questions.add("3. Play with "+name+" ?");
        questions.add("4. Tell "+name+" to go to sleep? ");
        questions.add("5. Do nothing. ");
        
        //Adding scanner to take user input
        Scanner userInput = new Scanner(System.in);
        boolean playing = true;
        

        //Looping through questions
        while(playing){
            displayPets();
            for (String question : questions){
            System.out.println(question);
            playing = false;
        }
        //Doing something with the answers and updating values 
            int petChoice = userInput.nextInt();
            userInput.nextLine();
            switch(petChoice){
                case 1:
                System.out.println("You gave "+name+" some food.");
                eat(petChoice);
                break;

                case 2:
                System.out.println("You gave "+name+" some water");
                drink(petChoice);;

                case 3:
                System.out.println("You took "+name+"to the park to play");
                play(petChoice);
                break;

                case 4:
                System.out.println(name+" went to sleep...sweet dreams!");
                sleep(petChoice);
                break;

                case 5:
                System.out.println("You and "+name+" decided to be lazy today");
                lazy(petChoice);
                break;

                default:
                System.out.println("Thats not a valid answer, please try again");
                break;

            }
            tick();
            // A way to break the loop
            System.out.println("Would you like to keep playing? Yes/No");
            String keepPlaying = userInput.nextLine();
            if(keepPlaying.equalsIgnoreCase("yes")){
                playing = true;
            }
            else {
            //Closing the scanner
                System.out.println("Goodbye "+name+" will miss you!");
            userInput.close(); 
            }
            
        }

        
        

        
        
    
        
        
}
}




    








