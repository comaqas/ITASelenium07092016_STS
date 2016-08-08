import java.util.*;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.lang.String;

//import static com.google.gson.internal.bind.TypeAdapters.UUID;

/**
 * Created by user on 07.08.2016.
 */
public class HelperRandomClass {
    public static String getRandomString() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(10);
    }

    public static String getUserName() {
        return getRandomString().substring(10);
    }

    public static String getRandomEmail() {
        return getRandomString().concat("@mail.ru");
    }

    public static String getPassword() {
        return "P".concat(getRandomString().substring(15));
    }

    public static String getFirstName() {
        return getRandomString().substring(5);
    }

    public static String getLastName() {
        return getRandomString().substring(7);
    }

    public static String getPosition(){
        return getFirstName().substring(9);
    }

    public static java.lang.String getRandomCompany(List<java.lang.String> list) {
        Random randomizer = new Random();
        return list.get(randomizer.nextInt(list.size()));
    }

}
