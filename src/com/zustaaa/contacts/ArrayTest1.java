package com.zustaaa.contacts;

public class ArrayTest1 {
    public static void main(String[] args) {
		int[] arr = new int[] {1,2,3};//一维数组
		//静态初始化
		int[][] arr1 = new int[][] {{1,2,3},{4},{5,6}};
		//动态初始化1
		String[][] arr2 = new String[3][2];
		//动态初始化2
		String[][] arr3 = new String[3][];
		//调用指定位置的元素
		System.out.println(arr1[0][1]);//2
		System.out.println(arr2[1][1]);//null
		arr3[1] = new String[4];
		System.out.println(arr3[1][0]);//null
		//获取数组的长度
		System.out.println(arr1.length);//3
		System.out.println(arr1[1].length);//1
		//遍历二维数组
		for(int i = 0;i < arr1.length;i++) {
			for(int j = 0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		int[][] arr4 = new int [4][3];
		System.out.println(arr4[0]);//[I@5b163006
		//[:一维 I：int型 @:在哪个位置
		System.out.println(arr4);//[[I@63ab557c
		System.out.println(arr4[0][0]);//0
		
		double[][] arr5 = new double[4][];
		System.out.println(arr5[1]);//null
		//每个都是一维数组，数组属于引用类型，引用类型默认值是null
		
	}
}
