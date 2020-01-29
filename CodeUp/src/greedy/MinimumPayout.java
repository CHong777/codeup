package greedy;

import java.util.Scanner;

public class MinimumPayout {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        
	        int [] pasta = new int[3];
	        int [] juice = new int[2];
	        double money = 0;
	        
	        
	        for(int i = 0; i <pasta.length; i++){
	            pasta[i]=sc.nextInt();
	            while(true) {
	            	if(pasta[i] < 100 || pasta[i] > 2000)
	            		pasta[i]=sc.nextInt();
	            	else
	            		break;
	            }
	        }
	        
	        for(int i = 0; i <juice.length; i++){
	            juice[i]=sc.nextInt();
	            while(true) {
	            	if(juice[i] < 100 || juice[i] > 2000)
	            		juice[i]=sc.nextInt();
	            	else
	            		break;
	            }
	        }
	        
	        int pmin = pasta[0];
	        int jmin = juice[0];
	        
	        for(int i = 0; i< pasta.length; i++){
	           if(pmin > pasta[i]){
	               pmin = pasta[i];
	           } 
	        }
	        
	        for(int i = 0; i< juice.length; i++){
	            if(jmin > juice[i]){
	               jmin = juice[i];
	           } 
	        }
	        
	       money = (pmin + jmin) * 1.1;
	       
	       System.out.format("%.1f%n", money);
	}
}
