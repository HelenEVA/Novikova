public class Utils {

        public static boolean isGreenLight = false;

        public static int maxSpeed = 10;

    public static int[] getSpeed (int[] speeds) {
        int count = 0;
        if (!isGreenLight) {
            for (int i = 0; i < speeds.length; i++) {
                if (speeds[i] > maxSpeed) {
                    count++;
                }
            }
        }

        int[] speedsRetired = new int[count];
        int countAdd = 0;
        if (!isGreenLight) {
            for (int i = 0; i < speeds.length; i++) {
                if (speeds[i] > maxSpeed) {
                    speedsRetired[countAdd] = speeds[i];
                    countAdd++;
                }
            }
        }
        return speedsRetired;
    }

}
