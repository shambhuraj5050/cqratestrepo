package propertiesutils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesutils {

    static Properties properties= new Properties();
    static FileInputStream fis ;

    public static Properties getapplicationproperties() throws IOException {
        fis = new FileInputStream("src/test/resources/application.properties");
        properties.load(fis);
        return properties;
    }
    public static Properties getuserproperties() throws IOException {
        fis=new FileInputStream("src/test/resources/framework.properties");
        properties.load(fis);
        return properties;
    }

}
