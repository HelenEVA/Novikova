public class Utils {

    public static boolean isGreenLight = false;

    public static int maxSpeed = 10;

    public static String[] getSpeed(String[] speeds) {
        int c = 0;
        if (!isGreenLight) {
            for (String text : speeds) {
                String[] parts = text.split(" ");
                if (Integer.parseInt(parts[1]) < maxSpeed) {
                    c++;
                }
            }
        }

        String []returned = new String[c];
        int countAdd = 0;
        for (String text : speeds) {
            String[] parts = text.split(" ");
            if (Integer.parseInt(parts[1]) < maxSpeed) {
                returned[countAdd] = parts[0];
                countAdd++;
            }
        }
        return returned;
    }

}
