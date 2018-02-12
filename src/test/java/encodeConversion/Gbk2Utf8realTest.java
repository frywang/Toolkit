package test.java.encodeConversion;

import main.java.encodeConversion.Gbk2Utf8;

/**
 * @author fry 2017.12.19
 * main函数下面的strings数组的参数,前一个是gbk格式文本所在文件夹,后一个是将gbk格式的文件转换成utf8后的地址
 *
 */
public class Gbk2Utf8realTest {
	public static void main(String[] args) throws Exception {
		String[] strings = { "/home/fry/workspace/JenaTutorial", "/home/fry/workspace/JenaTutorial"};
		Gbk2Utf8.main(strings);
	}

}
