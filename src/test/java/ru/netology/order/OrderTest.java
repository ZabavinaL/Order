package ru.netology.order;


import static com.codeborne.selenide.Condition.exactText;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

public class OrderTest {

    @Test
    void shouldOpen() {
        open("http://localhost:7777");
        $("[data-test-id = name] input").setValue("Иванов Петр");
        $("[data-test-id = phone] input").setValue("+79017007729");
        $("[data-test-id = agreement]").click();
        $("[type = button]").click();
        $("[data-test-id = order-success]")
                .shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));


    }
}
