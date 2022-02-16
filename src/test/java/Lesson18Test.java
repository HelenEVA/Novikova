import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Lesson18Test {

    @Test

    public void shouldMaxSpeedRetired(){

        int[]speeds = {1, 0, 15};

        int [] expected = {15};
        int [] actual = Utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void shouldIsGreenLightTru(){

        Utils.isGreenLight=true;
        int[]speeds = {1, 0, 15};

        int [] expected = {};
        int [] actual = Utils.getSpeed(speeds);

        Assertions.assertArrayEquals(expected, actual);

    }


}