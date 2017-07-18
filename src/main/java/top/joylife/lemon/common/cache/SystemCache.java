package top.joylife.lemon.common.cache;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.util.ResourceUtils;

import java.io.*;
import java.net.URL;
import java.util.Properties;

/**
 * Created by WuHaiming on 2017/7/18 0018.
 */
public class SystemCache {

    private static Properties properties;


    private static Logger logger = Logger.getLogger(SystemCache.class);

    static {
        properties = new Properties();
        try {
            File file = ResourceUtils.getFile("classpath:system.properties");
            InputStream in = new FileInputStream(file);
            properties.load(in);
        } catch (FileNotFoundException e) {
            logger.error("",e);
        } catch (IOException e) {
            logger.error("",e);
        }
    }

    public static String get(String name){
        return properties.getProperty(name);
    }

}
