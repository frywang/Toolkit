package main.java.timeTool;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * http://blog.csdn.net/r664128143r/article/details/49070059
 * 时间格式转字符串处理工具类
 *
 * Created by ryh on 15-9-15.
 */
public class DateUtility {

    /**
     * 记录日志信息
     */
    private static Logger logger = LogManager.getLogger(DateUtility.class);

    /**
     * 将当前时间格式化,格式化的格式yyyy-MM-dd HH:mm:ss
     *
     * @return 一个格式化的字符串time
     */
    public static String getTime() throws Exception{
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = formatter.format(date);
        logger.debug("当前时间格式化的调试日志-->>" + time);
        return time;
    }

    /**
     * 将当前时间格式化,格式化的格式yyyy-MM-dd
     *
     * @return 一个格式化的字符串time
     */
    public static String getDate() throws Exception {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String time = formatter.format(date);
        logger.debug("当前时间格式化的调试日志-->>" + time);
        return time;
    }

    /**
     * 将输入时间格式化,格式化的格式yyyy-MM-dd HH:mm:ss
     *
     * @return 一个格式化的字符串time
     */
    public static String timeToString(Date date) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = formatter.format(date);
        logger.debug("输入时间格式化的调试日志-->>" + time);
        return time;
    }

    /**
     * 将输入时间格式化,格式化的格式yyyy-MM-dd
     *
     * @return 一个格式化的字符串time
     */
    public static String dateToString(Date date) throws Exception {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String time = formatter.format(date);
        logger.debug("输入时间格式化的调试日志-->>" + time);
        return time;
    }

    /**
     * 把标准时区转化成当前时区
     *
     * @param date 时间
     * @return 当前时区的时间
     * @throws Exception
     */
    public static Date dateOfDate(Date date) throws Exception{
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, +8);
        Date date1=calendar.getTime();
        return date1;
    }

}