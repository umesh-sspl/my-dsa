package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number from 1 to 100 : ");
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        if(N>=1 && N<=100){
            if(N%2==0){
                if(N>2 && N<5){
                    System.out.println("Not Weird");
                }else if(N>6 && N<20){
                    System.out.println("Weird");
                }else{
                    System.out.println("Not Weird");
                }
            }else{
                System.out.println("Weird");
            }
        }
        
        bufferedReader.close();
    
    }
}
