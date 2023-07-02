package virtual_pet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        Scanner userInput = new Scanner(System.in);
        //Implementing a way to display date and time for the game 
        LocalDateTime passageOfGameTime = LocalDateTime.now();
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("dd-MMM-yyy HH:mm:ss");
        String formattedPassage = passageOfGameTime.format(formatTime); 
        System.out.println(formattedPassage);

        //Importing a clock for the game
        Clock gameClock = Clock.systemUTC();
        Instant time = gameClock.instant();
        Clock inGameClock = Clock.tick(gameClock, Duration.ofHours(1));
        



    
    }
}

    








