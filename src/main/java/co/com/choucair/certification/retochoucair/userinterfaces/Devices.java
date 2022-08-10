package co.com.choucair.certification.retochoucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Devices {

    public static final Target SYSTEM = Target.the("system").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]");

    public static final Target WINDOWS = Target.the("windows").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[2]");

    public static final Target VERSION = Target.the("version").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]");

    public static final Target TEN = Target.the("ten").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[17]");

    public static final Target LANGUAGE = Target.the("language").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]");

    public static final Target ENGLISH = Target.the("english").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[11]");

    public static final Target MOBILE = Target.the("mobile").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[4]");

    public static final Target APPLE = Target.the("apple").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[3]");

    public static final Target MODEL = Target.the("model").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[5]");

    public static final Target IPHONE = Target.the("iphone").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[1]");

    public static final Target OPSYSTEMMOVILE = Target.the("opsistemmobile").
            locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[6]");

    public static final Target IOS = Target.the("ios12").
            locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[25]");

    public static final Target NEXTLASTSTEP = Target.the("button nextlaststep").
            locatedBy("//a[@class=\"btn btn-blue pull-right\"]");

}
