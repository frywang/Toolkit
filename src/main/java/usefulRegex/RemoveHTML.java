/*
 * java 过滤html标签的办法
 * 本代码来源于http://jingyan.baidu.com/article/e4d08ffdaf706d0fd2f60da9.html
 * 
 */


package main.java.usefulRegex;

public class RemoveHTML {
	
	public static String guoHtml(String s){
		if(!s.equals("")||s!=null){
		String str=s.replaceAll("<[.[^<]]*>","");
		return str;
		}else{
		return s;
		}
		}

	public static void main(String[] args) {
		RemoveHTML t = new RemoveHTML();
		String s="<p>我是html标签</p>";
		System.out.println(t.guoHtml(s));
		}
		// TODO Auto-generated method stub

	}

