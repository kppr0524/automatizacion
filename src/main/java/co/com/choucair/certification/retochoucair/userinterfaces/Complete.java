package co.com.choucair.certification.retochoucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Complete {

    public static final Target PASSWORD = Target.the("password").
            locatedBy("//input[@id=\"password\"]");

    public static final Target CONFIRMPASSWORD = Target.the("confirmpassword").
            locatedBy("//input[@id=\"confirmPassword\"]");

    public static final Target CHECKMARCKONE = Target.the("checkmarckone").
            locatedBy("//span[@class=\"checkmark signup-consent__checkbox signup-consent__checkbox--highlight\"]");

    public static final Target CHECKMARCKTWO = Target.the("checkmarcktwo").
            locatedBy("//span[@class=\"checkmark signup-consent__checkbox error\"]");

    public static final Target CHECKMARCKTHREE = Target.the("checkmarckthree").
            locatedBy("//span[@ng-class=\"{error: userForm.privacySetting.$error.required}\"]");

    public static final Target BUTTONCOMPLETE = Target.the("buttoncomplete").
            locatedBy("//a[@class=\"btn btn-blue\"]");


}
