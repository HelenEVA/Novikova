public class Lesson19 {

    public static void main(String[] args) {

        String []speeds = new String[3];
        speeds[0] = "Вася 5";
        speeds[1] = "Петя 15";
        speeds[2] = "Олег 7";
//        Lesson19.getSpeed(speeds);

        String [] ArrayRetired = Utils.getSpeed(speeds);
        for (int i = 0; i < ArrayRetired.length; i++) {
            System.out.println(ArrayRetired[i]);
        }
    }

}

