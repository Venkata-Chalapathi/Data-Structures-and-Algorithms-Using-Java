import java.util.ArrayList;

public class ContainerwithMostWater {

    // public static int storeWater(ArrayList<Integer> heights) {

    // int maxWater = 0;

    // for (int i = 0; i < heights.size(); i++) {
    // for (int j = 0; j < heights.size(); j++) {
    // int ht = Math.min(heights.get(i), heights.get(j));
    // int width = j - i;
    // int currWater = ht * width;
    // maxWater = Math.max(maxWater, currWater);

    // }
    // }

    // return maxWater;
    // }

    // 2 POINTER APPROACH
    public static int storeWater(ArrayList<Integer> heights) {

        int maxWater = 0;
        int lp = 0;
        int rp = heights.size() - 1;

        while (lp < rp) {
            // Calculate Water Area
            int ht = Math.min(heights.get(lp), heights.get(rp));
            int width = rp - lp;
            int currWater = ht * width;

            maxWater = Math.max(maxWater, currWater);

            // update pointer

            if (heights.get(lp) < heights.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {

        ArrayList<Integer> heights = new ArrayList<>();

        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);

        System.out.println(storeWater(heights));

    }
}
