package co.com.choucair.certificaion.proyectobase.tasks;

import co.com.choucair.certificaion.proyectobase.userinterface.MyStorePage;
import co.com.choucair.certificaion.proyectobase.userinterface.SignEmail;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUP implements Task {

    private MyStorePage myStorePage;
    public static OpenUP thePage(){
        return Tasks.instrumented(OpenUP.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(myStorePage), Click.on(SignEmail.SignUp));
    }
}
