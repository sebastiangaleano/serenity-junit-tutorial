package serenityswag.authentication.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import serenityswag.authentication.User;

public class LoginActions extends UIInteractionSteps {

  @Step("Log in as a {0}")
  public void as(User user) {
    openUrl("https://www.saucedemo.com/");
    $("[data-test='username']").sendKeys(user.getUsername());
    $("[data-test='password']").sendKeys(user.getPassword());
    $("[data-test='login-button']").click();

  }

}
