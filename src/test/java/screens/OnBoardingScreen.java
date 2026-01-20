package screens;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import tests.Constants;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class OnBoardingScreen {

    private final SelenideElement
        primaryTextView = $(id("org.wikipedia.alpha:id/primaryTextView")),
        onboardingForwardButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
        onboardingDoneButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_done_button")),
        searchFieldRu = $(accessibilityId(Constants.RU_TEXT_IN_SEARCH_FIELD)),
        searchFieldEng = $(accessibilityId(Constants.ENG_TEXT_IN_SEARCH_FIELD))
    ;

    @Step("Check first onboarding screen in Russian")
    public OnBoardingScreen checkFirstOnboardingScreenRu(){
        primaryTextView.shouldHave(matchText("^.*"+ Constants.RU_TEXT_IN_FIRST_SCREEN +".*?$"));
        onboardingForwardButton.click();

        return this;
    }

    @Step("Check second onboarding screen in Russian")
    public OnBoardingScreen checkSecondOnboardingScreenRu(){
        primaryTextView.shouldHave(text(Constants.RU_TEXT_IN_SECOND_SCREEN));
        onboardingForwardButton.click();

        return this;
    }

    @Step("Check third onboarding screen in Russian")
    public OnBoardingScreen checkThirdOnboardingScreenRu(){
        primaryTextView.shouldBe(text(Constants.RU_TEXT_IN_THIRD_SCREEN));
        onboardingForwardButton.click();

        return this;
    }

    @Step("Check fourth onboarding screen in Russian")
    public OnBoardingScreen checkFourthOnboardingScreenRu(){
        primaryTextView.shouldBe(text(Constants.RU_TEXT_IN_FOURTH_SCREEN));
        onboardingDoneButton.click();

        return this;
    }

    @Step("Verify search field in Russian")
    public OnBoardingScreen verifySearchFieldRu(){
        searchFieldRu.shouldBe(visible);

        return this;
    }

    @Step("Check first onboarding screen in English")
    public OnBoardingScreen checkFirstOnboardingScreenEng(){
        primaryTextView.shouldHave(matchText("^.*"+ Constants.ENG_TEXT_IN_FIRST_SCREEN +".*?$"));
        onboardingForwardButton.click();

        return this;
    }

    @Step("Check second onboarding screen in English")
    public OnBoardingScreen checkSecondOnboardingScreenEng(){
        primaryTextView.shouldHave(text(Constants.ENG_TEXT_IN_SECOND_SCREEN));
        onboardingForwardButton.click();

        return this;
    }

    @Step("Check third onboarding screen in English")
    public OnBoardingScreen checkThirdOnboardingScreenEng(){
        primaryTextView.shouldBe(text(Constants.ENG_TEXT_IN_THIRD_SCREEN));
        onboardingForwardButton.click();

        return this;
    }

    @Step("Check fourth onboarding screen in English")
    public OnBoardingScreen checkFourthOnboardingScreenEng(){
        primaryTextView.shouldBe(text(Constants.ENG_TEXT_IN_FOURTH_SCREEN));
        onboardingDoneButton.click();

        return this;
    }

    @Step("Verify search field in English")
    public OnBoardingScreen verifySearchFieldEng(){
        searchFieldEng.shouldBe(visible);

        return this;
    }

}
