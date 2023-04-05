package org.example.Final;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPost extends AbstractTest{
    @BeforeEach
    void Login1() {
        Main main = new Main(getWebDriver());
        main
                .userpole("iiiyruk97@mail.ru")
                .passwordpole("92a3d3671d")
                .vhodclick();
        Assertions.assertEquals("https://test-stand.gb.ru/login",getWebDriver().getCurrentUrl());
    }

    //Переход на последний свой пост
    @Test
 void cat () {
        Main main = new Main (getWebDriver());
        main
                .kotclick();
        Assertions.assertEquals("https://test-stand.gb.ru/",getWebDriver().getCurrentUrl());
    }

    //Переход на следующую страницу
    @Test
    void nextlist() {
        Main main = new Main(getWebDriver());
        main
                .NextPage();
        Assertions.assertEquals("https://test-stand.gb.ru/?page=2",getWebDriver().getCurrentUrl());
    }
    //Переход на страницу назад
    @Test
    void downlist(){
        Main main = new Main (getWebDriver());
        main
                .NextPage()
        .DownPage();
        Assertions.assertEquals("https://test-stand.gb.ru/?page=1",getWebDriver().getCurrentUrl());
    }

}
