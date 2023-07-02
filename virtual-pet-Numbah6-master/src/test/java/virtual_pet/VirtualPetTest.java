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

public ArrayList<String> listOptions(){
    System.out.println("What would like to do?");
    pet_options.add("Feed "+name);
    pet_options.add("Give water to "+name);
    pet_options.add("Play with "+name);
    pet_options.add("Tell "+name+"to go to sleep");
    pet_options.add("Do nothing");
 
}

public void tick(){
    while (petChoice >=5) {
        switch(petChoice){
            case 1:
            System.out.println("What would you like to do?");
            break;

            case 2:
            System.out.println("Feed "+name+" ?");
            
        }
    }
}


//creating methods for updating the instance variables 
public void eat (int eatPoints){
    this.hunger = this.hunger + eatPoints;
    System.out.println(name+"has eaten a hearty meal!");
}

public void drink(int waterPoints){
    this.thirst = this.thirst + waterPoints;
    System.out.println(name+" has drunk some water!");
}

public void play(int playPoints){
    this.boredLevel = this.boredLevel - playPoints;
    System.out.println("You took "+name+" to the park to play with them");
}

public void sleep(int sleepPoints) {
    this.tiredness = this.tiredness - sleepPoints;
    System.out.println(name+" Went to sleep...now"+name+" they feels refreshed");
}


//creating methods that update instance variables to correspond with the methods
public void hungry(int eatPoints){
    this.hunger = this.hunger - eatPoints;
    System.out.println(name+" is really hungry...give it something to eat!");
}

public void thirsty(int waterPoints){
    this.thirst = this.thirst - waterPoints;
    System.out.println(name+" is is thirsty...give it something to drink!");
}

public void bored(int playPoints) {
    this.boredLevel = this.boredLevel + playPoints;
    System.out.println(name+" is getting bored just staring out the window...take it out to the park to have some fun! ");
}

public void sleepy(int sleepPoints){
    this.tiredness = this.tiredness + sleepPoints;
    System.out.println(name+" is getting tired");
}


//random and logical occurring methods and instance variables to make the pet feel more alive 

}


