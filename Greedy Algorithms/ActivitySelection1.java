import java.util.*;

public class ActivitySelection1 {

    public static void maxActivities(int start[], int end[]) {

        int maxCount = 0;
        ArrayList<Integer> al = new ArrayList<>();

        int activities[][] = new int[start.length][3];

        // sort
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lamda function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // 1st activity
        maxCount = 1;
        al.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                // Activity Selection
                maxCount++;
                al.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max Activties : " + maxCount);

        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }

    // // 1st activity
    // maxCount = 1;
    // al.add(0);
    // int lastEnd = end[0];
    // for (int i = 0; i < end.length; i++) {
    // if (start[i] >= lastEnd) {
    // // Activity Selection
    // maxCount++;
    // al.add(i);
    // lastEnd = end[i];
    // }
    // }

    // System.out.println("Max Activties : " + maxCount);

    // for (int i = 0; i < al.size(); i++) {
    // System.out.print(al.get(i) + " ");
    // }
    // }

    public static void main(String[] args) {

        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        maxActivities(start, end);

    }
}