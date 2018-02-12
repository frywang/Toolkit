package main.java.usefulRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Compile {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("(?<=<td>).*(?=</td>)");
		String str ="<td>20分钟</td>";
		Matcher m = p.matcher(str);
		while(m.find())
			System.out.println(m.group());
	}
}
