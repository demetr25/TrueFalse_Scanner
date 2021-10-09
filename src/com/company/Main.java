package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start");
        System.out.print("Input a number ->    ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 15;
        System.out.println(a>b ? "a больше чем b" : "a меньше чем b");
        }
    }
