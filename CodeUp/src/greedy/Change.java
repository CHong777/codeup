package greedy;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) { 
        
        int cnt = 0;
        int n = 0;
        int money = 50000;
        int check = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        n = scanner.nextInt();
        
        while(true){
            if(n == 0)
                break;
            
            if(n/money > 0){
                cnt+= n/money;
                n %= money;
            }
            
            if(check % 2 == 0)
                money/=5;
            else
                money/=2;
            check++;
        }
        System.out.println(cnt);
    } 
}
