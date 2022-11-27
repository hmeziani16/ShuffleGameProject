import java.util.*;
public class FrontPage {
    String mode;
    FrontPage() {

    }
    public void frontPagePrint() {

        PickUpPage pickUpPage = new PickUpPage();
        RandomShuffle  shuffleOne = new RandomShuffle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------* Welcome to shuffle game *-------------------------------\n" );
        System.out.println("Guess where the 0 is ?");
        System.out.println();
        System.out.println("Are you ready to play? y/n");
        mode = scanner.nextLine();

        if (mode.equalsIgnoreCase("y")){

            pickUpPage.picUpNum();
        }

        if (mode.equalsIgnoreCase("n")){
            System.out.println("See you next time !!!");
        }else {
            frontPagePrint();
        }


    }




}
