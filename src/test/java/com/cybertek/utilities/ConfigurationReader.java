package com.cybertek.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties= new Properties();

    static {

        try{ FileInputStream fis = new FileInputStream("configuration.properties");

            properties.load(fis);

            fis.close();
        }catch(Exception e){

            e.printStackTrace();
            System.out.println("Error occureed while reading configuration file");
        }

    }


    public static String getProperty(String key){

        return properties.getProperty(key);

    }

}
