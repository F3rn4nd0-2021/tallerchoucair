package co.com.choucair.certificaion.proyectobase.tasks;


import co.com.choucair.certificaion.proyectobase.userinterface.SignEmail;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private String email;

    public Login(String email) {
        this.email = email;
    }

    public static Login thePage(String email){
        return Tasks.instrumented(Login.class, email);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(email).into(SignEmail.INPUT_EMAIL),
                Click.on(SignEmail.ENTER_BUTTON));
    }
}