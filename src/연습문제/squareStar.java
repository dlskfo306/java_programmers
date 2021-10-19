package 연습문제;

import java.util.Scanner;

//직사각형 별찍기
public class squareStar {

    public static void main(String[] args) {
        //5 3
        //*****
        //*****
        //*****
        
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        for(int i=0; i<b; i++) {
            for(int j=0; j<a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
