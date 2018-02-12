package main.java.operateTxt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class ReadandWriteTxt {
	
	
	//读取原始语料，生成list列表。
	public static List<String> readTxtToList(String filepath) throws IOException{
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filepath),"utf-8"));
			List<String> strlist = new ArrayList<String>();
			String s;
			//s = br.readLine();
			while ((s = br.readLine())!=null){
				strlist.add(s);
			}
			br.close();
			return strlist;
		} catch (Exception e) {
            System.out.println("读取文件内容出错");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
    /**
     * 读取txt文件的内容
     * @param file 想要读取的文件对象
     * @return 返回文件内容
     */
    public static String readTxt2String(File file){
        String result = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while((s = br.readLine())!=null){//使用readLine方法，一次读一行
                result = result + "\n" +s;
            }
            br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
	
	
	
	//读取原始语料，写入list列表。
	public static void writeListToTxt(List<String> list,String filepath) throws IOException{
		
        FileOutputStream fos =new FileOutputStream(filepath);
        //获得输出流
        OutputStreamWriter bos =new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(bos);
        //遍历输出
        String a = "";
        for (int i=0;i<list.size();i++) {
            a =list.get(i);
            bw.write(a.toString()+"\r\n");
        }
        bw.flush();
        bw.close();
	}
	
	
    
	
	
	
	 /**
     * 向文本文件中写入内容或追加新内容,如果append为true则直接追加新内容,<br>
     * 如果append为false则覆盖原来的内容<br>
     *
     * @param path
     * @param content
     * @param append
     */
    public void writeStringToTxt(String path, String content, boolean append) {
        File writefile;
        try {
            // 通过这个对象来判断是否向文本文件中追加内容
            // boolean addStr = append;

            writefile = new File(path);

            // 如果文本文件不存在则创建它
            if (writefile.exists() == false) {
                writefile.createNewFile();
                writefile = new File(path); // 重新实例化
            }

            FileOutputStream fw = new FileOutputStream(writefile);
            System.out.println("###content:" + content);
            fw.write(content.getBytes());
            fw.flush();
            fw.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }
    

}
