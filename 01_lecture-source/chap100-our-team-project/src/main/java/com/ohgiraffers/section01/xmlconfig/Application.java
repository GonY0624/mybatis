package com.ohgiraffers.section01.xmlconfig;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        /* 수업목표.
        *   1. 전체 조회하기
        *   2. 수정하기 _ update
        *  */

        System.out.println("================하이미디어==================");
        System.out.println("1. 전체 직원 조회하기");
//        System.out.println("2. 직원 정보 삭제하기");

        EmpController empController = new EmpController();

        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        switch (no){
            case 1 : empController.selectEmployee(); break;
//            case 2 : empController.deleteEmployee(); break;

            default :
                System.out.println("잘못 입력하셨습니다. "); break;
        }

    }

}
