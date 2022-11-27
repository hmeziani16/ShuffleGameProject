import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArray  {

    ShuffleArray() {

    }

    public void shuffleList () {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(0);
        list.add(1);

        Collections.shuffle(list); // shuffling the list
        System.out.println("[* * *] : " + list);


    }





}
