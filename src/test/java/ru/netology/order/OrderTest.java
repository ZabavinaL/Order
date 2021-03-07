package ru.netology.order;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;

public class OrderTest {

    @Test
    void shouldOpen() {
        open("http://localhost:9999");
    }
}
