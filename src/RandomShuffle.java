import java.util.Random;


public class RandomShuffle {

    {

    }

    public  int[] getRandomValue() {

        int[] array = new int[]{1, 0, 1};

        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndexToSwap = rand.nextInt(array.length);
            int shuffle = array[randomIndexToSwap];
            array[randomIndexToSwap] = array[i];
            array[i] = shuffle;
        }return (array);


    }

}