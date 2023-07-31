import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int amount = Integer.parseInt(args[0]);
        int[] lens = new int[amount];

        for (int i=0; i<amount; i++)
            lens[i] = Integer.parseInt(args[i+1]);

        int lensAmount=0;

        Arrays.sort(lens);
        if (lens.length!=2) {
            for (int i = 1; i < amount; i++) {
                lensAmount++;
                if (lens[i] - lens[i - 1] <= 2)
                    i++;
            }
        } else{
            lensAmount+=1;
            if (lens[1] - lens[0] > 2)
                lensAmount+=1;
        }

        if (lens.length%2 != 0)
            lensAmount++;

        System.out.println(lensAmount);
    }
}
