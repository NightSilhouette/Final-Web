package org.example.Final;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestVhod extends AbstractTest {
    // тест на  вход
    @Test
    void Login() {
        Main main = new Main(getWebDriver());
        main
                .userpole("iiiyruk97@mail.ru")
                .passwordpole("92a3d3671d")
                .vhodclick();
        Assertions.assertEquals("https://test-stand.gb.ru/login",getWebDriver().getCurrentUrl());
    }
    // негативный тест на вход
    @Test
    void Loginnegativ() {
        Main main = new Main(getWebDriver());
        main.userpole("LOL")
                .passwordpole("DOTA")
                .vhodclick();
        Assertions.assertEquals("https://test-stand.gb.ru/login",getWebDriver().getCurrentUrl());
    }
    // пограничные значение тест №1
    @Test
    void Loginpogran1() {
        Main main = new Main(getWebDriver());
        main.userpole("0")
                .passwordpole("1")
                .vhodclick();
        Assertions.assertEquals("https://test-stand.gb.ru/login",getWebDriver().getCurrentUrl());
    }
    // пограничные значение тест №2
    @Test
    void Loginpogran2() {
        Main main = new Main(getWebDriver());
        main.userpole("1")
                .passwordpole("0")
                .vhodclick();
        Assertions.assertEquals("https://test-stand.gb.ru/login",getWebDriver().getCurrentUrl());
    }
    // пограничные значение тест №3
    @Test
    void Loginpogran3() {
        Main main = new Main(getWebDriver());
        main.userpole("0")
                .passwordpole("0")
                .vhodclick();
        Assertions.assertEquals("https://test-stand.gb.ru/login",getWebDriver().getCurrentUrl());
    }


}
