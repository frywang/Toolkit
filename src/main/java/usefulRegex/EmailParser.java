/*
 * 
 * Java 使用正则表达式从文件中解析出所有email地址
 * http://rogerfederer.iteye.com/blog/1958820
 */




package main.java.usefulRegex;


import java.io.IOException;  
import java.util.regex.Matcher;  
import java.util.regex.Pattern;  
  
  
/** 
 * 本代码用来提取邮件地址 
 * @author Roger Federer 
 * @date 2013-10-16 下午13:27:00 
 */  
public class EmailParser {  
      
    private final static Pattern emailer = Pattern.compile("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+");  
      
    /** 
     * @param args 
     * @throws IOException  
     */  
    public static void main(String[] args) throws IOException {  
        //String txt = FileUtils.readFileToString(new File(args[0]));  
        String txt = "test@sina.comtest@sina.com test@sina.com test1@sina.com test@sina.com xxxx@sina.com,test@sina.com";  
        //System.out.println(txt);  
        Matcher matchr = emailer.matcher(txt);  
        while (matchr.find()) {  
            String email = matchr.group();  
            System.out.println(email);  
        }  
          
        Matcher matcher = emailer.matcher(txt);  
        String matchecText = null;  
        int matchedFrom = 0;  
        int matchedTo = 0;  
        while (matcher.find()) {  
            matchecText = matcher.group();  
            matchedFrom = matcher.start();  
            matchedTo = matcher.end();  
            System.out.println("matched [" + matchecText + "] from [" + matchedFrom + "] to [" + matchedTo + "]" );  
        }  
    }  
  
}  
