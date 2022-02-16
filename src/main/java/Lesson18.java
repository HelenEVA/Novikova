public class Lesson18 {

    public static void main(String[] args) {

        int[]speeds = new int[3];
        speeds[0] = 1;
        speeds[1] = 0;
        speeds[2] = 15;

        int[]ArrayRetired = Utils.getSpeed(speeds);
        for (int i = 0; i < ArrayRetired.length; i++) {
            System.out.println(ArrayRetired[i]);
        }
    }
}

