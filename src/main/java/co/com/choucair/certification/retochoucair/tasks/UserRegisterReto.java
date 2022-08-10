package co.com.choucair.certification.retochoucair.tasks;

import co.com.choucair.certification.retochoucair.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UserRegisterReto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.REGISTER),
                SendKeys.of("Katherine").into(Personal.FIRSTNAME),
                SendKeys.of("Puello").into(Personal.LASTNAME),
                SendKeys.of("kppr.0524@gmail.com").into(Personal.EMAIL),
                SendKeys.of("Mayo").into(Personal.BIRTHMONTH),
                SendKeys.of("24").into(Personal.BIRTHDAY),
                SendKeys.of("1995").into(Personal.BIRTHYEAR),
                Click.on(Personal.NEXTLOCATION),
                Click.on(Address.NEXTDEVICES),
                Click.on(Devices.SYSTEM),
                Click.on(Devices.WINDOWS),
                Click.on(Devices.VERSION),
                Click.on(Devices.TEN),
                Click.on(Devices.LANGUAGE),
                Click.on(Devices.ENGLISH),
                Click.on(Devices.MOBILE),
                Click.on(Devices.APPLE),
                Click.on(Devices.MODEL),
                Click.on(Devices.IPHONE),
                Click.on(Devices.OPSYSTEMMOVILE),
                Click.on(Devices.IOS),
                Click.on(Devices.NEXTLASTSTEP),
                SendKeys.of("asdfGac12300*").into(Complete.PASSWORD),
                SendKeys.of("asdfGac12300*").into(Complete.CONFIRMPASSWORD),
                Click.on(Complete.CHECKMARCKONE),
                Click.on(Complete.CHECKMARCKTWO),
                Click.on(Complete.CHECKMARCKTHREE),
                Click.on(Complete.BUTTONCOMPLETE)
        );
    }
        public static UserRegisterReto makeinformation(){
            return instrumented(UserRegisterReto.class);
        }
}

