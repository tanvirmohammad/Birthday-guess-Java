package com.modern;
import java.util.Scanner;
import java.lang.String;

public class Main {

    static String set1,set2,set3,set4,set5;

    public static void main(String[] args) {
        int num = 0;
        Scanner in = new Scanner(System.in);


        set1 =
                        "1 3 5 7\n"+
                        "9 11 13 15 \n"+
                        "17 19 21 23\n"+
                        "25 27 29 31";
        set2 =
                        "2 3 6 7\n" +
                        "10 11 14 15\n" +
                        "18 19 22 23\n" +
                        "26 27 30 31";

        set3 =
                        "4 5 6 7\n" +
                        "12 13 14 15\n" +
                        "20 21 22 23\n" +
                        "28 29 30 31";

        set4 =
                        "8 9 10 11\n" +
                        "12 13 14 15\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";

        set5 =
                        "16 17 18 19\n" +
                        "20 21 22 23\n" +
                        "24 25 26 27\n" +
                        "28 29 30 31";



        System.out.println("If your birthday is here\n"+set1 +"\n"+ "then press 1 else press 0");
        int answer = in.nextInt();
        if(answer == 1)
        {
            num += 1;
        }

        System.out.println("If your birthday is here\n"+set2 +"\n"+ "then press 1 else press 0");
         answer = in.nextInt();
        if(answer == 1)
        {
            num += 2;
        }

        System.out.println("If your birthday is here\n"+set3 +"\n"+ "then press 1 else press 0");
         answer = in.nextInt();
        if(answer == 1)
        {
            num += 4;
        }

        System.out.println("If your birthday is here\n"+set4 +"\n"+ "then press 1 else press 0");
         answer = in.nextInt();
        if(answer == 1)
        {
            num += 8;
        }

        System.out.println("If your birthday is here\n"+set5 +"\n"+ "then press 1 else press 0");
         answer = in.nextInt();
        if(answer == 1)
        {
            num += 16;
        }

        System.out.println("Your birthday is "+num);

    }
}
