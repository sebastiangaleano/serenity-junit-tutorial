package serenityswag.authentication.actions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.pagefactory.ByAll;
import serenityswag.authentication.User;

public class LoginActions extends UIInteractionSteps {

  @Step("Log in as a {0}")
  public void as(User user) {
    openUrl("https://www.saucedemo.com/");

//    $("[data-test='username']").sendKeys(user.getUsername());
    $("#user-name").sendKeys(user.getUsername());
//    $("[data-test='password']").sendKeys(user.getPassword());
    $("#password").sendKeys(user.getPassword());
//    $("[data-test='login-button']").click();
    $("#login-button").click();
  }

}
