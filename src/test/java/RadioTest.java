import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void shouldSetNextStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.nextStation();


        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetPrevStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.prevStation();


        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void shouldSetNextVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetPrevVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.prevVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldSetAnyStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);
        radio.chooseStation();

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

}