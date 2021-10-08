package co.com.choucair.certificaion.proyectobase.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InData {
    public static final Target MALE = Target.the("malewww").located(By.id("id_gender1"));
    public static final Target FIRST_NAME = Target.the("nombre").located(By.id("customer_firstname"));
    public static final Target LAST_NAME = Target.the("apellido").located(By.id("customer_lastname"));
    public static final Target EMAIL = Target.the("email").located(By.id("email"));
    public static final Target PASSWORD = Target.the("contraseña").located(By.id("passwd"));
    public static final Target DAY_BIRTH = Target.the("dia de nacimiento").located(By.id("days"));
    public static final Target MONTHS_BIRTH = Target.the("mes de nacimiento").located(By.id("months"));
    public static final Target YEAR_BIRTH = Target.the("año de nacimiento").located(By.id("years"));


    public static final Target FRIST_NAMEE= Target.the("nombre de empresa").located(By.id("firstname"));
    public static final Target LAST_NAMEE = Target.the("apellido de la empresa").located(By.id("firstname"));
    public static final Target COMPANY= Target.the("nombre compañia").located(By.id("company"));
    public static final Target ADDRESS= Target.the("direccion").located(By.id("address1"));
    public static final Target CITY= Target.the("ciudad").located(By.id("city"));
    public static final Target STATE= Target.the("ESTADO").located(By.id("id_state"));
    public static final Target POSTAL_CODE= Target.the("codigo postal").located(By.id("postcode"));
    public static final Target COUNTRY= Target.the("pais").located(By.id("id_country"));
    public static final Target IFO_ADICIONAL= Target.the("INFORMACION ADICIONAL").located(By.id("other"));
    public static final Target HOME_PHONE= Target.the("telefono1").located(By.id("phone"));
    public static final Target MOBILE_PHONE =Target.the("telefono2").located(By.id("phone_mobile"));
    public static final Target ALIAS= Target.the("un alias").located(By.id("alias"));

    public static final Target BT_REGISTRE = Target.the("boton generar rgistro").located(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[4]/button/span"));

    public static final Target TEXT_F= Target.the("mensage final").located(By.xpath("/html/body/div/div[2]/div/div[3]/div/h1"));
}
