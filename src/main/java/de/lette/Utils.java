package de.lette;

import java.io.File;

public class Utils {

    private static Utils instance;

    public static Utils getInstance()
    {
        return (instance == null) ? (instance = new Utils()) : instance;
    }

    public
    File getFile(String fileName) {

        ClassLoader classLoader = getClass().getClassLoader();
        return new File(classLoader.getResource(fileName).getFile());
    }

}
