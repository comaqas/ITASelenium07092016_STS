package Helpers;

import java.util.Date;
import java.util.UUID;

/**
 * Created by user on 28.08.2016.
 */
public class RandomClass {
    public static String getRandomString() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(10);
    }

    public static String getSubject() {
        return getRandomString().substring(7).concat(new Date().toString());
    }

    public static String getMailText(){
        return getRandomString().substring(9);
    }
}
