import java.io.Reader;
import java.util.*;



public class PickUpPage {

    String options;
    int[] array = new int[]{1,0,1};

    Scanner scanner = new Scanner ( System.in );

    PickUpPage(){

    }

    public void picUpNum() {

        RebootGamePage rebootPage = new RebootGamePage();
        FrontPage frontPage = new FrontPage();
        ShuffleArray  shuffleArray = new ShuffleArray();
        RandomShuffle shuffleTwo = new RandomShuffle();

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(0);
        list.add(1);


        System.out.println("pick 1, 2 or 3");
        this.options = scanner.next();


        if (this.options.equals("1")){

            Collections.shuffle(list);
            System.out.println("[* * *] : " + list);

            if (list.indexOf(0) !=0) {
                System.out.println("Sorry!!! wrong guess!");

            }else System.out.println("Good guess!");

        }else if (this.options.equals("2")){

            Collections.shuffle(list);
            System.out.println("[* * *] : " + list);

            if (list.indexOf(1) !=0) {
                System.out.println("Sorry!!! wrong guess!");

            }else System.out.println("Good guess!");


        }else if (this.options.equals("3")){

            Collections.shuffle(list);
            System.out.println("[* * *] : " + list);

            if (list.indexOf(2) !=0) {
                System.out.println("Sorry!!! wrong guess!");

            }else System.out.println("Good guess!");

        }else {
            System.out.println("Pick 1, 2, or 3");
            this.options = scanner.next();
        }rebootPage.rebootGame();

    }


}






