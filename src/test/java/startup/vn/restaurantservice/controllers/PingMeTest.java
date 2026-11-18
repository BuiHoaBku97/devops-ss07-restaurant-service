package startup.vn.restaurantservice.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PingMeTest {

    @Test
    void pingReturnsPongMessage() {
        PingMe pingMe = new PingMe();

        assertEquals("[restaurant-service] Pong!", pingMe.ping());
    }
}
