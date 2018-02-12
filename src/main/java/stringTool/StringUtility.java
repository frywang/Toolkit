package main.java.stringTool;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.UUID;

/**
 * http://blog.csdn.net/r664128143r/article/details/49070059
 * 常用工具类
 * <p/>
 * Universally Unique Identifier
 * 1、生成UUID字符串
 * 2、随机生成3位数字符串
 * Created by ryh on 15-4-2.
 */
public class StringUtility {

    /**
     * 记录日志信息
     */
    private static Logger logger = LogManager.getLogger(StringUtility.class);

    /**
     * 生成UUID字符串
     *
     * @return 32位的UUID密钥
     */
    public static String getUUID() throws Exception{
        String uuid = UUID.randomUUID().toString();
        uuid = uuid.substring(0, 8) + uuid.substring(9, 13) + uuid.substring(14, 18) + uuid.substring(19, 23) + uuid.substring(24);
        logger.debug("获取32位的UUID的调试日志-->>" + uuid);
        return uuid;
    }

    /**
     * 随机生成3位数字符串
     *
     * @return 一个三位数的随机码字符串
     */
    public static String getRandom() {
        int number;
        while (true) {
            number = (int) (Math.random() * 1000);
            if (number >= 100 && number < 1000) {
                break;
            }
        }
        String string=String.valueOf(number);
        logger.debug("获取3位的随机码字符串的调试日志-->>" + string);
        return string;
    }

}
