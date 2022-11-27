import java.awt.*;
import java.util.Scanner;

public class RebootGamePage {
    Scanner scanner = new Scanner ( System.in );
    String mode, options;

    RebootGamePage()  {

    }
     void rebootGame() {
         FrontPage  frontPagePrint = new FrontPage();
         PickUpPage pickUpPage = new PickUpPage();

        System.out.println("Do you want to try again? y/n");
        mode = scanner.next();

        if ( mode.equalsIgnoreCase("y")){

            pickUpPage.picUpNum();

        }

        if ( mode.equalsIgnoreCase("N")){

            System.out.println("See you next time!");
            mode = scanner.next();



        }
        else if ( !(mode.equalsIgnoreCase("n"))){
            System.out.println("Invalid entry try y or n");

        }else {
            System.out.println("Are you ready to play? y/n");
        }
        rebootGame();


    }


}
