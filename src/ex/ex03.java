﻿package ex;import java.util.Scanner;
/*
 * Topic:  寫一程式計算兩個矩陣的乘法，例如 A 是 n1 x m1 的矩陣， B 是 n2 x m2 的矩 陣，C=AB 為 n1 x m2 矩陣
	第一列輸入 n1, m1, n2 及 m2 等 4 個整數，n1, m1 是第一個陣列的列(row)與行 (column)，而 n2, m2 則是第二個陣列的列(row)與行(column)，其中 m1 = n2。接著輸 入兩個陣列的內容。
 * Date: 2016/11/21
 * Author: 105021044 鐘岑哲
 */
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn =new Scanner(System.in);
		 System.out.println("請輸入A矩陣的 行 列 ");
	                   int n1=scn.nextInt();
	                   int m1=scn.nextInt();
	     System.out.println("請輸入B矩陣的 行 列 ");
	                   int n2=scn.nextInt();
	                   int m2=scn.nextInt();
	                   int sum=0;//AB空間
	                   if(m1==n2){
	                	   int data[][]=new int [n1][m1];
	                	   int data1[][]=new int [n2][m2];
	                	   int data2[][]=new int [n1][m2];
	                	   //由此往下
	     System.out.println("請輸入A矩陣的 行 列 內容  ");//A 的數值
	                	   for(int a=0;a<n1;a++){
	                		   for(int b=0;b<m1;b++){
	                			   data[a][b]=scn.nextInt();
	                		   }
	                	   }
	     System.out.println("請輸入B矩陣的 行 列 內容  ");//B 的數值
	                	   for(int a=0;a<n2;a++){
	                		   for(int b=0;b<m2;b++){
	                			   data1[a][b]=scn.nextInt();
	                		   }
	                	   }   
	                	          //AB矩陣的計算流程
	                	   for(int a=0;a<n1;a++){
	                		   for(int b=0;b<m2;b++){	
	                			   sum=0;//一個回傳的空間
	                			   for(int c=0;c<n2;c++){
		                			   sum+=data[a][c]*data1[c][b];
	                			   }data2[a][b]=sum;//跑回sum
	                		   }
	                	   }
	                	   System.out.println("AB矩陣的 行 列 內容  ");
	                	   for(int a=0;a<n1;a++){
	                		   for(int b=0;b<m2;b++){
	                			   System.out.print(data2[a][b]+"\t");  }               			  	               		 
	                		   System.out.println();
	                	   }
	                	
	                	   
	                	   	      //以下為n1不等於m2的情形          	   
	                 }else{
	                		   System.out.println("請重新key八");
	                	   }
          
	}
}