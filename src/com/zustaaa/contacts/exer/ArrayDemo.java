package com.zustaaa.contacts.exer;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("请输入学生人数：");
         int number = scanner.nextInt();
         int[] scores = new int[number];
         System.out.println("请输入"+number+"个学生成绩：");
         int maxscore=0;
         for(int i=0;i<scores.length;i++) {
        	 scores[i]=scanner.nextInt();
        	 if(maxscore<scores[i]) {
        		 maxscore=scores[i];
        	 }
         }         
         char level;
         for(int i=0;i<scores.length;i++) {
        	 if(maxscore-scores[i]<=10) {
        		 level='A';
        	 }else if(maxscore-scores[i]<=20) {
        		 level='B';
        	 }else if(maxscore-scores[i]<=30) {
        		 level='C';
        	 }else {
        		 level='D';
        	 }
        	 System.out.println("student "+i+
        			 " score is "+scores[i]+",grade is "+level);
        	 
         }
	}
}
