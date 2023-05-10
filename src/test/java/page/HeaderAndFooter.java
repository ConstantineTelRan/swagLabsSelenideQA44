package page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public abstract class HeaderAndFooter {
    private ElementsCollection socialLinks = $$x("//ul[@class='social']//a");

    public List<String> linkText = socialLinks.texts();

    public void checkAndClickToSocialLink(String linkText, String url) {
        socialLinks.findBy(Condition.exactText(linkText)).shouldHave(Condition.href(url)).click();
    }

    public void checkUrl(String url) {
        switchTo().window(1);
        webdriver().shouldHave(url(url));
        closeWindow();
        switchTo().window(0);
    }

    public void checkUrlLinkedIn() {
        switchTo().window(1);
        webdriver().shouldHave(urlContaining("https://www.linkedin.com/"));
        closeWindow();
        switchTo().window(0);
    }

}
