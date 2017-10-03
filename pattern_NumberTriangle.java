package com.prp.structure;

import java.util.Scanner;

import java.util.*;
import java.util.*;
import java.util.*;
class pattern_NumberTriangle{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String ar[][]=new String[n][n+n];
        int k=1;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		if(j>=i) {
        			ar[i][j]=(k++)+"";
        		}else {
        			ar[i][j]="-";
        		}
        	}
        }
        int c=0;
        for(int i=n-1;i>=0;i--) {
        	for(int j=n;j<2*n;j++) {
        		if(j-n<=c) {
        			ar[i][j]=(k++)+"";
        		}else {
        			ar[i][j]="-";
        		}
        	}
        	c++;
        }
        for(int i=0;i<n;i++) {
        	for(int j=0;j<2*n;j++) {
        		System.out.print(ar[i][j]+" ");
        	}
        	System.out.println();
        }
       
    }
}