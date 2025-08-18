import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] floors = new int[n];
        for (int i = 0; i < n; i++) {
            floors[i] = sc.nextInt();
        }
        int k = sc.nextInt() - 1;
        int minFloor = floors[0];
        int maxFloor = floors[n - 1];
        int kFloor = floors[k];
        int answer = 100;
        int timeToK = kFloor - minFloor;
        if (timeToK <= t) {
            answer = Math.min(answer, maxFloor - minFloor);
        }
        timeToK = maxFloor - kFloor;
        if (timeToK <= t) {
            answer = Math.min(answer, maxFloor - minFloor);
        }
        int leftDist = kFloor - minFloor;
        int rightDist = maxFloor - kFloor;
        int total = Math.min(leftDist, rightDist) + (maxFloor - minFloor);
        answer = Math.min(answer, total);
        System.out.println(answer);
    }
}