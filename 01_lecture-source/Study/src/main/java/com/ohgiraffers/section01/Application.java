package com.ohgiraffers.section01;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("======================동적 sql 확인하기=========================");
            System.out.println("1. if 확인하기");
            int no = sc.nextInt();
            
            switch (no){
                case 1 : ifSubMenu(); break;
                case 2 :
                    System.out.println("시스템을 종료합니다..."); return;
            }
            
    }while (true);
    
}

    private static void ifSubMenu() {

        Scanner sc = new Scanner(System.in);
        MenuService menuService = new MenuService();

        do{
            System.out.println("========================if 서브 메뉴=======================");
            System.out.println("1. 원하는 금액대의 적합한 추천 메뉴 목록보여주기");
            System.out.println("2. 메뉴 이름 또는 카테고리명으로 검색하여 메뉴 목록 보여주기");
            System.out.println("9. 이전 메뉴로");
            System.out.print("원하는 메뉴를 입력해주세요 : ");
            int no = sc.nextInt();


        }while (true);

    }
    }
