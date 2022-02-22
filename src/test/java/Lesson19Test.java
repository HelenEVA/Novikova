import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lesson19Test {
    @Test

    public void shouldGetSurvivors(){

        String []speeds = new String[3];
        speeds[0] = "Вася 5";
        speeds[1] = "Петя 15";
        speeds[2] = "Олег 7";

        String [] expected = {"Вася", "Олег"};
        String [] actual = Utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldNotGetSurvivors(){

        String []speeds = new String[3];
        speeds[0] = "Вася 17";
        speeds[1] = "Петя 15";
        speeds[2] = "Олег 77";

        String [] expected = {};
        String [] actual = Utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test

    public void shouldGet3Survivors(){

        String []speeds = new String[3];
        speeds[0] = "Иван 1";
        speeds[1] = "Петя 3";
        speeds[2] = "Семён 9";

        String [] expected = {"Иван", "Петя", "Семён"};
        String [] actual = Utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldMaxSpeed3(){

        Utils.maxSpeed = 3;
        String [] speeds = {"Иван 2", "Петя 5", "Семён 17"};

        String [] expected = {"Иван"};
        String [] actual = Utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldMaxSpeed0(){

        Utils.maxSpeed = 0;
        String [] speeds = {"Иван 27", "Петя 51", "Семён 37"};

        String [] expected = {};
        String [] actual = Utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test

    public void shouldMaxSpeed10(){

        Utils.maxSpeed = 10;
        String [] speeds = {"Иван 10", "Петя 1", "Семён 10"};

        String [] expected = {"Петя"};
        String [] actual = Utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }


    @Test

    public void shouldIsGreenLight(){

        Utils.isGreenLight = false;
        String [] speeds = {"Иван 7", "Петя 51", "Семён 10"};

        String [] expected = {"Иван"};
        String [] actual = Utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }

}
