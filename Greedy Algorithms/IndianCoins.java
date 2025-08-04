import java.util.*;

public class IndianCoins {

    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000, 2000 };

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 590;
        ArrayList<Integer> alist = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countOfCoins++;
                    alist.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("No of coins : " + countOfCoins);
        System.out.println("Coins : ");
        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }

    }
}
