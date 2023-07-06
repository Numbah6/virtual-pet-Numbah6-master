package virtual_pet;
import java.util.Scanner;
import java.util.ArrayList;

public class VirtualPetTest {
    Scanner userInput = new Scanner(System.in);
    private String name;
    private int hunger = 100;
    private int thirst = 100;
    private int bladder = 0;
    private int boredLevel = 0;
    private int sickness = 0;
    private int tiredness = 0;
    private int eatPoints = 50;
    private ArrayList<Integer> number_options = new ArrayList<>();
    private ArrayList<String> pet_options = new ArrayList<>();
    private ArrayList<String> special_modifiers = new ArrayList();
    private ArrayList<String> questions = new ArrayList();

    public int petChoice = userInput.nextInt();


//main methods
public VirtualPetTest (String name){
    this.name = name;
    this.hunger = 100;
    this.thirst = 100;
    this.bladder = 0;
    this.boredLevel = 0;
    this.sickness = 0;
    this.tiredness = 0;
    pet_options.add("Eat");
    pet_options.add("Drink");
    pet_options.add("Play");
    pet_options.add("Sleep");
    pet_options.add("Nothing");

}

// public void tick(){
//     questions.add("What would like to do?");
//     questions.add("1.Feed "+name);
//     questions.add("2.Give water to "+name);
//     questions.add("3.Play with "+name);
//     questions.add("4.Tell "+name+"to go to sleep");
//     questions.add("5.Do nothing.");
    
//     for (String question : questions){
//             System.out.println(question);
//             int petChoice = userInput.nextInt();
//         }

// }

public void choices(){
    while (petChoice >= 5 ) {
        switch(petChoice){
            case 1:
            eat();
            break;
            case 2:
            drink();
            break;
            case 3:
            play();
            break;
            case 4:
            sleep();
            break;
            case 5:

        
        }
    }
}


// private String[] listQuestions() {
//     return null;
// }

//creating methods for updating the instance variables 
public void eat(){
    this.hunger = this.hunger + 30;
    System.out.println(name+"has eaten a hearty meal!");
}

public void drink(){
    this.thirst = this.thirst + 30;
    System.out.println(name+" has drunk some water!");
}

public void play(){
    this.boredLevel = this.boredLevel - 20;
    System.out.println("You took "+name+" to the park to play with them");
}

public void sleep(){
    this.tiredness = this.tiredness - 20;
    System.out.println(name+" Went to sleep...now"+name+" they feels refreshed");
}


//creating methods that update instance variables to correspond with the methods
public void hungry(){
    this.hunger = this.hunger - 25;
    System.out.println(name+" is really hungry...give it something to eat!");
}

public void thirsty(){
    this.thirst = this.thirst - 25;
    System.out.println(name+" is is thirsty...give it something to drink!");
}

public void bored() {
    this.boredLevel = this.boredLevel + 15;
    System.out.println(name+" is getting bored just staring out the window...take it out to the park to have some fun! ");
}

public void sleepy(){
    this.tiredness = this.tiredness + 15;
    System.out.println(name+" is getting tired");
}


//random and logical occurring methods and instance variables to make the pet feel more alive 
public void lazy(){
    System.out.println("You and "+name+" decided to be lazy right now");
    this.hunger = this.hunger - 10;
    this.thirst = this.thirst - 10;
    this.boredLevel = this.boredLevel + 10;
    this.tiredness = this.tiredness + 10;
}
}


