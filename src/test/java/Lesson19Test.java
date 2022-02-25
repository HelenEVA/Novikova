import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lesson19Test {

    @Test

    public void shouldGetSurvivors() {

        Utils utils = new Utils(false);
        String[] speeds = {"Иван 2", "Петя 25", "Семён 17"};
        utils.maxSpeed = 10;

        String[] expected = {"Иван"};
        String[] actual = utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test

    public void shouldGetSurvivorsForSpeedEquals10() {

        Utils utils = new Utils(false);
        String[] speeds = {"Petr 10", "Leonid 25", "Ivan 11"};
        utils.maxSpeed = 10;

        String[] expected = {"Petr"};
        String[] actual = utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldMaxSpeed0(){

        Utils utils = new Utils(false);
        String[] speeds = {"Petr 10", "Leonid 25", "Ivan 10"};
        utils.maxSpeed = 0;

        String[] expected = {};
        String[] actual = utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldGetSurvivorsForSpeedEquals9(){

        Utils utils = new Utils(false);
        String[] speeds = {"Petr 12", "Leonid 9", "Ivan 21"};
        utils.maxSpeed = 10;

        String[] expected = {"Leonid"};
        String[] actual = utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldGetSurvivorsForSpeedEquals0(){

        Utils utils = new Utils(false);
        String[] speeds = {"Petr 12", "Leonid 19", "Ivan 0"};
        utils.maxSpeed = 10;

        String[] expected = {"Ivan"};
        String[] actual = utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldSpeedTest11(){

        Utils utils = new Utils(false);
        String[] speeds = {"Petr 11", "Leonid 19", "Ivan 32"};
        utils.maxSpeed = 10;

        String[] expected = {};
        String[] actual = utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldIsGreenLightTrue(){

        Utils utils = new Utils(true);
        String[] speeds = {"Petr 10", "Leonid 25", "Ivan 10"};

        String[] expected = {"Petr", "Leonid", "Ivan"};
        String[] actual = utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);



    }

    @Test

    public void shouldIsGreenLightFalse(){

        Utils utils = new Utils(false);
        String[] speeds = {"Petr 3", "Leonid 25", "Ivan 10"};
        utils.maxSpeed = 9;

        String[] expected = {"Petr"};
        String[] actual = utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);


    }


}
