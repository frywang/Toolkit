package main.java.operateTxt;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class OperationString {
	
	
	/*将两个list里的数据两两组合，确保最长一列的数据在组合中只出现一次
	 将长度相同的list按照下标一一组合*/
    public static <T> List<String> jointListString(List<List<String>> lists,List<String> stockSentenlist) {
    	List<String> NameSenten= new ArrayList<String>();
/*    	多余出来的list单独处理。*/
    	List<T> strNamespitLast = (List<T>) lists.get(lists.size()-1);
    	for (int i = 0; i < strNamespitLast.size(); i++) {
    		String Senten = strNamespitLast.get(i).toString()+"###"+stockSentenlist.get(i);
    		NameSenten .add(Senten);
    	}
/*    	长度相等的list两两组合*/
        for (int i = 0; i < lists.size()-1; i++) {
        	List<T> strNamespit = (List<T>) lists.get(i);
        	for (int j = 0; j < stockSentenlist.size(); j++) {
        		String Senten = strNamespit.get(j).toString()+"###"+stockSentenlist.get(j);
        			NameSenten.add(Senten);
        	}
        }
        return NameSenten;
    }
    
    
    /**
     * 将一个list分成以n为单位的多个list,如果不能整除，则多出一个list
     */
     public static <T> List<List<T>> averageAssignList(List<T> source,int n){
     List<List<T>> result=new ArrayList<List<T>>();
     List<T> addvalue=null;
     int remaider=source.size()%n; //(先计算出余数)
     int number=source.size()/n; //然后是商
     System.out.println(number);
     for(int i=0;i<number;i++){
      List<T> value=null;
      value=source.subList(i*n, i*n+n);
      result.add(value);
     }
     //如果不能整除，则把余数里的数值设置成单独的list。
     if(remaider>0){
     addvalue=source.subList(number*n, source.size());
     result.add(addvalue);
     }
     return result;
     }
     
     /*比较两个list是否含有相同的元素,如果含有相同的元素,则把相同的元素生成一个新的list
      * */
     public static List<String> findRepeatStringInTwoLists(List<String> list1,List<String> list2,List<String> newList,File file) throws Exception{
    	   for ( int i = 0 ; i < list1.size(); i ++ ) {  
  	    	String newString1 =list1.get(i).substring(list1.get(i).indexOf("##&&&##")+7);
   	     for ( int j = list2.size()-1; j>=0; j -- ) { 
   	    	String newString2=list2.get(j).substring(list2.get(j).indexOf("##&&&##")+7);
   	    	System.out.println(newString2+"indexOf"+newString1);
   	       if (newString2.indexOf(newString1)>=0) {  
   	    	 newList.add(list2.get(j));
   	       }   
   	      }   
   	    }   
  	   System.out.println(newList.size());
         //将新的list内容写入文件
    	   return newList;

      }
     
     
     
     public static List<String> deleteDoubleStringList(List<String> list) throws Exception{
     	List<String> newList = new ArrayList<String>();
     	List<String> newDoubleList = new ArrayList<String>();
     	for(String str : list){
     		if(!newList.contains(str.indexOf(str.substring(str.indexOf("##&&&##")+7)))){
     			newList.add(str);
     		}else{
     			System.out.println(str);
     		}
     	}
     	return newList;
     }

}
