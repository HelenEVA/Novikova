public class Utils {
    boolean isGreenLight;
    int maxSpeed;

    public Utils(boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

    public String[] getSpeed(String[] speeds) {
        int c = 0;
        if (!isGreenLight) {
            for (String text : speeds) {
                String[] parts = text.split(" ");
                if (Integer.parseInt(parts[1]) <= maxSpeed) {
                    c++;
                }
            }
        } else {
            c = speeds.length;
        }
        String[] returned = new String[c];
        int countAdd = 0;
        for (String text : speeds) {
            String[] parts = text.split(" ");
            if (Integer.parseInt(parts[1]) <= maxSpeed) {
                returned[countAdd] = parts[0];
                countAdd++;
            } else
                if (isGreenLight) {
                returned[countAdd] = parts[0];
                countAdd++;
            }
        }
        return returned;
    }

}
