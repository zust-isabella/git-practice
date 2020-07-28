package com.zustaaa.contacts;

public class ArrayTest {
    public static void main(String[] args) {
		int[] ids;//声明
    	//一位数组静态初始化
    	ids = new int[] {1001,1002};
    	int[] arr4 = {1,2,3};//类型推断
    	//动态初始化(引用数据类型)
    	String[] names = new String[5];//中括号放类型或变量名后都可
    	//角标调用数组
    	names[0]="煞笔";
    	//获取数组长度
    	System.out.println(names.length);//5
    	//遍历数组
    	for(int i = 0;i<names.length;i++) {
    		System.out.println(names[i]);
    	}
	}
}
