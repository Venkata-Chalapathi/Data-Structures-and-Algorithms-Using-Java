import java.util.*;

public class FKnapsack {

    public static int knapsack(int weight[], int val[], int w) {
        int capacity = w;

        double ratio[][] = new double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int finalVal = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) {
                finalVal += val[idx];
                capacity -= weight[idx];
            } else {
                finalVal += ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }

        return finalVal;
    }

    public static void main(String[] args) {
        int weight[] = { 10, 20, 30 };
        int val[] = { 60, 100, 120 };
        int w = 50;

        int result = knapsack(weight, val, w);
        System.out.println("Max : " + result);
    }
}
