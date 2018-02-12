/*
 * 
 * 
利用正则提取字符串内特殊字段内容
http://zhidao.baidu.com/link?url=52UXyapBfxus2zHh3LlM4SVY4yUwQYYFIapyDDDbztJtJH3Fdjaa-yTlufaPUBxEggz9lfkjLKrPkkmKwOMTX_
 * 最近在做网站的第三方客户端，遇到个小问题。
晋江文学城的论坛上，每层楼末尾有一行这样的文字”№2 ☆☆☆白菜蜀黍于2012-03-08 16:30:36留言☆☆☆　“

我想从这段文字中提取出来2-3个内容：
1.“2 ”，楼层编号，可能为1-3位数
2.“白菜蜀黍”，作者名
3.“2012-03-08 16:30:36”，
 * 
 */


package main.java.usefulRegex;

public class RegString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "№2 ☆☆☆白菜蜀黍于2012-03-08 16:30:36留言☆☆☆";
		regStr(str);
		
	}

	private static void regStr(String str) {
		String reg = "[№,☆,于,留言]+";
		String[]s = str.split(reg);
		String row = s[1];
		String userName = s[2];
		String createTime = s[3];
		System.out.println("楼层号：" + row + "\n" +
							"作者名：" + userName + "\n" +
							"时间：" + createTime );

	}

}
