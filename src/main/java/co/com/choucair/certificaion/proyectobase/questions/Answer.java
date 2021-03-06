package co.com.choucair.certificaion.proyectobase.questions;


import co.com.choucair.certificaion.proyectobase.userinterface.InData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer (String question){
        this.question= question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String textFinal= Text.of(InData.TEXT_F).viewedBy(actor).asString();
        if (question.equals(textFinal)){

            result = true;
        }
        else {
            result =false;
        }

        return result;
    }
}
