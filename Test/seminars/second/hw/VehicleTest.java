package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class VehicleTest {
    Car car = new Car("Dodge", "Ram", 2010);
    Motorcycle moto = new Motorcycle("Yamaha", "R1", 2020);

    @Test
    public void testCarIsInstanceOfVehicle() {
//        Car car = new Car("Dodge", "Ram", 2010);
        assertTrue(car instanceof Vehicle);
    }


    @Test
    void four_wheels_test() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    void two_wheels_test() {
        assertThat(moto.getNumWheels()).isEqualTo(2);
    }

    @Test
    void car_test_drive_speed_check() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void moto_test_drive_speed_check() {
        moto.testDrive();
        assertThat(moto.getSpeed()).isEqualTo(75);
    }

    @Test
    void car_parking_mode_speed_check() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void moto_parking_mode_speed_check() {
        moto.testDrive();
        moto.park();
        assertThat(moto.getSpeed()).isEqualTo(0);
    }
}