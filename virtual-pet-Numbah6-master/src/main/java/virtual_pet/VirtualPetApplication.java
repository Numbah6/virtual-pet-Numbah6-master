package virtual_pet;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import java.util.List;
import java.util.ArrayList;

public class VirtualPetApplication {
    private static String name;
    private static int hunger = 100;
    private static int thirst = 100;
    private int bladder = 0;
    private static int boredLevel = 0;
    private int sickness = 0;
    private static int tiredness = 0;
    private int eatPoints = 50;
    
    



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
        questions.add("1. Feed?");
        questions.add("2. Give water?");
        questions.add("3. Play with?");
        questions.add("4. Tell to go to sleep? ");
        questions.add("5. Do nothing. ");
        
        //Adding scanner to take user input
        Scanner userInput = new Scanner(System.in);
        boolean playing = true;
        //Looping through the questions
        // for (int i = 0; i < questions.size(); i++){
        //     String question = questions.get(i);
        //     System.out.println(question);
        //     int petChoice = userInput.nextInt();

        while(playing){
            for (String question : questions){
            System.out.println(question);
            playing = false;
        }
        
            int petChoice = userInput.nextInt();
            userInput.nextLine();
            switch(petChoice){
                case 1:
                eat(petChoice);
                break;

                case 2:
                drink(petChoice);;

                case 3:
                play(petChoice);
                break;

                case 4:
                sleep(petChoice);
                break;

                case 5:
                lazy(petChoice);
                break;

                default:
                System.out.println("Thats not a valid answer, please try again");
                break;
            }
            
            // A way to break the loop
            System.out.println("Would you like to keep playing? Yes/No");
            String keepPlaying = userInput.nextLine();
            if(keepPlaying.equalsIgnoreCase("yes")){
                playing = true;
            }
            else {
                System.out.println("Goodbye "+name+" will miss you!");
            userInput.close(); 
            }
            
        }

        
        

        
        
    
        //Closing the scanner
        
}
}




    








