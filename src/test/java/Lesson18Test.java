import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lesson18Test {


    @Test

    public void shouldIsGreenLightTru() {

        Utils.isGreenLight = true;
        int[] speeds = {1, 0, 15};

        int[] expected = {};
        int[] actual = Utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldIsGreenLightFalse() {

        Utils.isGreenLight = false;
        int[] speeds = {1, 0, 15};

        int[] expected = {15};
        int[] actual = Utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldSpeedPlayerEqual10() {

        Utils.isGreenLight = false;
        Utils.maxSpeed = 10;
        int[] speeds = {1, 7, 10};

        int[] expected = {};
        int[] actual = Utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldSpeedPlayerLimitValue9() {

        Utils.isGreenLight = false;
        Utils.maxSpeed = 10;
        int[] speeds = {1, 9, 12};

        int[] expected = {12};
        int[] actual = Utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldSpeedPlayerLimitValue11() {

        Utils.isGreenLight = false;
        Utils.maxSpeed = 10;
        int[] speeds = {1, 9, 11};

        int[] expected = {11};
        int[] actual = Utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldSpeedPlayer0IsGrinLightTru() {

        Utils.isGreenLight = true;
        Utils.maxSpeed = 10;
        int[] speeds = {1, 0, 12};

        int[] expected = {};
        int[] actual = Utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldSpeedPlayer0IsGreenFalse() {

        Utils.isGreenLight = false;
        Utils.maxSpeed = 10;
        int[] speeds = {1, 0, 12};

        int[] expected = {12};
        int[] actual = Utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }


}
