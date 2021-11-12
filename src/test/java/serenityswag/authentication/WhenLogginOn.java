package serenityswag.authentication;

import static org.assertj.core.api.Assertions.assertThat;
import static serenityswag.authentication.User.STANDARD_USER;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import serenityswag.authentication.actions.LoginActions;
import serenityswag.inventory.InventoryPage;

@RunWith(SerenityRunner.class)
public class WhenLogginOn {

  @Managed
  WebDriver webDriver;

  @Steps
  LoginActions login;

  InventoryPage inventoryPage;

  @Test
  public void usersCanLogOnViaTheHomePage() {

    login.as(STANDARD_USER);
    Serenity.reportThat("The inventory page should be displayed with the correct tittle",
        () -> assertThat(inventoryPage.getHeading()).isEqualToIgnoringCase("Products"));
  }
}
