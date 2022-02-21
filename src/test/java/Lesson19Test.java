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

}
