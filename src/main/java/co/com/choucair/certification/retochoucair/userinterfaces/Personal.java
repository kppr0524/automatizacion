package co.com.choucair.certification.retochoucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Personal {

    public static final Target FIRSTNAME = Target.the("firstname").
            locatedBy("//input[@id=\"firstName\"]");

    public static final Target LASTNAME = Target.the("lastname").
            locatedBy("//input[@id=\"lastName\"]");

    public static final Target EMAIL = Target.the("email").
            locatedBy("//input[@id=\"email\"]");

    public static final Target BIRTHMONTH = Target.the("birthmonth").
            locatedBy("//select[@id=\"birthMonth\"]");

    public static final Target BIRTHDAY = Target.the("birthday").
            locatedBy("//select[@id=\"birthDay\"]");

    public static final Target BIRTHYEAR = Target.the("birthyear").
            locatedBy("//select[@id=\"birthYear\"]");

    public static final Target NEXTLOCATION = Target.the("buttonextlocation").
            locatedBy("//a[@class=\"btn btn-blue\"]");

}
