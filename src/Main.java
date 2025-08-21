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
        int leaveIndex = sc.nextInt() - 1;
        int leaveFloor = floors[leaveIndex];

        int minFloor = floors[0];
        int maxFloor = floors[n-1];

        int result = Integer.MAX_VALUE;

        // Вариант 1: снизу вверх
        int timeUp = leaveFloor - minFloor;
        if (timeUp <= t) {
            result = Math.min(result, maxFloor - minFloor);
        }

        // Вариант 2: сверху вниз
        int timeDown = maxFloor - leaveFloor;
        if (timeDown <= t) {
            result = Math.min(result, maxFloor - minFloor);
        }

        // Вариант 3: начать с leaveFloor
        int leftDist = leaveFloor - minFloor;
        int rightDist = maxFloor - leaveFloor;
        int steps3 = Math.min(leftDist, rightDist) + (maxFloor - minFloor);
        result = Math.min(result, steps3);

        System.out.println(result);
    }
}