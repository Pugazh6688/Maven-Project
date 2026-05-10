package Utility;

import org.junit.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReaderManager {
    private static FileInputStream fileInputStream;
    private static Properties property;

    public static void setupproperty(){
    File file = new File("C:\\Users\\pugaz\\IdeaProjects\\MavenProject\\src\\main\\resources\\TestData.properties");

        try {
            fileInputStream = new FileInputStream(file);
            property = new Properties();
                property.load(fileInputStream);

            } catch (FileNotFoundException  e) {
            Assert.fail("ERROR : OCCURE DURING FILE LOAD");
            }catch(IOException a) {
            Assert.fail("ERROR : OCCURE DURING FILE LOAD");
        }
    }
    public static String getProperty(String value){
        setupproperty();
        String data = property.getProperty(value);
        return data;
    }

    }



