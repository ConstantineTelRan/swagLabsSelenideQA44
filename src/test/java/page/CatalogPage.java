package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class CatalogPage {
    private SelenideElement pageTitle = $x("//span[@class=\"title\"]");


    public void isTitleVisible() {
        pageTitle.shouldBe(Condition.visible).shouldHave(Condition.exactText("Products"));
    }

}
