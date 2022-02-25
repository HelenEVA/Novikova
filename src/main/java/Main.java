public class Main {

    public static void main(String[] args) {

        Utils utils = new Utils(false);

        utils.maxSpeed = 10;

        String[] speeds = new String[3];
        speeds[0] = "Вася 5";
        speeds[1] = "Петя 15";
        speeds[2] = "Олег 7";

        String[] g = utils.getSpeed(speeds);
        for (String text : g) {
            System.out.println(text);
        }

    }
}

