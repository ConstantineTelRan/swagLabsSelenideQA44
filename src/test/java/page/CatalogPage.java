package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class CatalogPage extends HeaderAndFooter{
    private SelenideElement pageTitle = $x("//span[@class=\"title\"]");

    @Step("The catalog page has opened")
    public void isTitleVisible() {
        pageTitle.shouldBe(Condition.visible).shouldHave(Condition.exactText("Products"));
    }

}
