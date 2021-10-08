package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certificaion.proyectobase.model.Insert;
import co.com.choucair.certificaion.proyectobase.questions.Answer;
import co.com.choucair.certificaion.proyectobase.tasks.Fill;
import co.com.choucair.certificaion.proyectobase.tasks.Login;
import co.com.choucair.certificaion.proyectobase.tasks.OpenUP;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class MyStoreStepDefinition {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }



    @Given("^Fernando wants to register on the page$")
    public void fernandoWantsToRegisterOnThePage() {OnStage.theActorCalled("fernando").wasAbleTo(OpenUP.thePage());

    }

    @Given("^enter the register module$")
    public void enterTheRegisterModule(List<Insert> insert) { OnStage.theActorCalled("fernando")
            .wasAbleTo(Login.thePage(insert.get(0).getEmail()));
    }


    @When("^he enters his personal data$")
    public void heEntersHisPersonalData(List<Insert> insert) throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.theForm(insert));

    }



        @Then("^user registration should be successful (.*)$")
        public void userRegistrationShouldBeSuccessfulWelcomeToYourAccount(String mensaje) {
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(mensaje)));
        }

}
