package racing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @CsvSource({"0, false", "1, false", "2, false", "3, false", "4, true", "5, true", "6, true", "7, true", "8, true", "9, true"})
    @ParameterizedTest(name = "자동차 전진 테스트")
    void move_car(int number, boolean expected) {
        // given
        Car car = new Car();

        // whern
        int prevPosition = car.position();
        car.move(number);

        // then
        assertThat(car.position() == prevPosition + 1).isEqualTo(expected);
    }
}
