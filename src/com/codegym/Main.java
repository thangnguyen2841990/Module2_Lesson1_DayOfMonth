package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Tính số ngày trong 1 tháng");
        byte month;
        byte day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Tháng: ");
        month = scanner.nextByte();
        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7:
            case 8 :
            case 10:
            case 12:
                day = 31;
                System.out.println("Tháng "+ month + " có "+ day+" ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                System.out.println("Tháng "+ month + " có "+ day+" ngày");
                break;
            case 2 : {
                System.out.println("Tháng "+ month + " có 28 hoặc 29 ngày");

            }
        }


    }
}
