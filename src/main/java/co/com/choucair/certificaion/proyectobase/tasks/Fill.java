package co.com.choucair.certificaion.proyectobase.tasks;

import co.com.choucair.certificaion.proyectobase.model.Insert;
import co.com.choucair.certificaion.proyectobase.userinterface.InData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class Fill implements Task {
    private List<Insert> insert;

    public Fill(List<Insert> insert) {
        this.insert = insert;
    }

    public static Fill theForm(List<Insert> insert) {
        return Tasks.instrumented(Fill.class, insert);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InData.MALE),
                Enter.theValue(insert.get(0).getStfristname()).into(InData.FIRST_NAME),
                Enter.theValue(insert.get(0).getStlastname()).into(InData.LAST_NAME),
                Enter.theValue(insert.get(0).getStpassword()).into(InData.PASSWORD),
                SelectFromOptions.byValue(insert.get(0).getStday()).from(InData.DAY_BIRTH),
                SelectFromOptions.byValue(insert.get(0).getStmonth()).from(InData.MONTHS_BIRTH),
                SelectFromOptions.byValue(insert.get(0).getStyear()).from(InData.YEAR_BIRTH),
                Enter.theValue(insert.get(0).getStlasnamef()).into(InData.LAST_NAMEE),
                Enter.theValue(insert.get(0).getStfrisnamef()).into(InData.FRIST_NAMEE),
                Enter.theValue(insert.get(0).getStcompany()).into(InData.COMPANY),
                Enter.theValue(insert.get(0).getStaddress()).into(InData.ADDRESS),
                //Enter.theValue(insert.get(0).getStaddress2()).into(InData.ADDRESS),
                Enter.theValue(insert.get(0).getStcity()).into(InData.CITY),
                SelectFromOptions.byValue(insert.get(0).getStstate()).from(InData.STATE),
                // Enter.theValue(insert.get(0).getStstate()).into(InData.STATE),
                Enter.theValue(insert.get(0).getStpostal()).into(InData.POSTAL_CODE),

                SelectFromOptions.byValue(insert.get(0).getStcountry()).from(InData.COUNTRY),
                Enter.theValue(insert.get(0).getStadditional()).into(InData.IFO_ADICIONAL),
                SelectFromOptions.byValue(insert.get(0).getStstate()).from(InData.STATE),
                Enter.theValue(insert.get(0).getStrphone()).into(InData.HOME_PHONE),
                Enter.theValue(insert.get(0).getStrmyadrdres()).into(InData.ALIAS),
                Click.on(InData.BT_REGISTRE)

        );

    }
}
