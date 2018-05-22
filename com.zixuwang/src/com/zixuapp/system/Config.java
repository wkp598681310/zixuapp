package com.zixuapp.system;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {
    private Properties prop = null;

    public Properties conn() {
        if (prop != null) {
            return prop;
        }
        Properties prop = new Properties();
        InputStream is = Config.class.getClassLoader().getResourceAsStream("system.config.properties");
        try {
            prop.load(is);
            is.close();
        } catch (IOException e) {
            return null;
        }
        this.prop = prop;
        return prop;
    }

    public String get(String k) {
        Properties prop = conn();
        if (prop == null) {
            return null;
        }
        String getProperty = prop.getProperty(k);
        return getProperty;
//        return getProperty == null ? getDb(k) : getProperty;
    }
}
