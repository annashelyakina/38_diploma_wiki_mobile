package screens;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import tests.Constants;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class SearchScreen {

    private final SelenideElement
        textInSearchFieldEng = $(accessibilityId(Constants.ENG_TEXT_IN_SEARCH_FIELD)),
        textInSearchFieldRu = $(accessibilityId(Constants.RU_TEXT_IN_SEARCH_FIELD)),
        searchField = $(id("org.wikipedia.alpha:id/search_src_text"))
    ;

    private final ElementsCollection
            searchedValuesList =$$(id("org.wikipedia.alpha:id/page_list_item_title"))
    ;

    @Step("Type and search 'Appium' in English Wikipedia")
    public SearchScreen typeAndSearchAppiumEng(){
        textInSearchFieldEng.click();
        searchField.sendKeys(Constants.APPIUM);

        return this;
    }

    @Step("Type and search 'Java' in English Wikipedia")
    public SearchScreen typeAndSearchJavaEng(){
        textInSearchFieldEng.click();
        searchField.sendKeys(Constants.JAVA);

        return this;
    }

    @Step("Type and search 'Appium' in Russian Wikipedia")
    public SearchScreen typeAndSearchAppiumRu(){
        textInSearchFieldRu.click();
        searchField.sendKeys(Constants.APPIUM);

        return this;
    }

    @Step("Type and search 'Java' in Russian Wikipedia")
    public SearchScreen typeAndSearchJavaRu(){
        textInSearchFieldRu.click();
        searchField.sendKeys(Constants.JAVA);

        return this;
    }

    @Step("Verify found content")
    public SearchScreen verifyFoundContent(){
        searchedValuesList.shouldHave(sizeGreaterThan(0));

        return this;
    }
}
