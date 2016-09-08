package Helpers;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Date;
import java.util.UUID;

/**
 * Created by user on 29.08.2016.
 */
public class RandomClass {
    public static String getRandomString() {

        return UUID.randomUUID().toString().replaceAll("-", "").substring(10);
    }

    public static String getSubject() {

        return getRandomString().substring(7).concat(new Date().toString());
    }
    public static String getFirstName(){
        //String symbols = "qwertyuioplkjhgfdsazxcvbnmMNBVCXZASDFGHJKLPOIUYTREWQ";
       // Random r = new Random();
        //return symbols.getChars((int)Math.random()*10,(int)Math.random()*symbols.length());
        //return symbols.substring((int)Math.random()*10,(int)Math.random()*symbols.length());
        //symbols.charAt(symbols.length());

//        char c = (char)(r.nextInt(26)+'a');
//        return c;

       // return getRandomString().substring(6).toString();
        return RandomStringUtils.randomAlphabetic(6);
    }
    public static String getLastName(){

        //return getRandomString().substring(8);
        return RandomStringUtils.randomAlphabetic(6);
    }
    public static String getAddress(){
        return getRandomString().substring(4);
    }
    public static String getCity(){
        return getRandomString().substring(7);
    }
    public static String getAddressAlias(){
        return getRandomString().substring(5);
    }
    public static String getMobilePhone(){
        return RandomStringUtils.randomNumeric(7);
    }
    public static String getZip(){
        return RandomStringUtils.randomNumeric(5);
    }
    public static String getOrderReference(){
        return getRandomString().substring(11);
    }

    public static String getMessage(){
        return getRandomString().substring(10);
    }




}
