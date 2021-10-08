package co.com.choucair.certificaion.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SignEmail {

    public static final Target LOGIN_B = Target.the("Boton registrar usuario").
            located(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button/span"));
    public static final Target INPUT_EMAIL = Target.the("ingresar un email para hacer registo").
            located(By.id("email_create"));
    public static final Target ENTER_BUTTON = Target.the("Boton registrar usuario").
            located(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[3]/button/span"));

    public static final Target SignUp = Target.the("Quiero ingresar")
            .located(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));

}
