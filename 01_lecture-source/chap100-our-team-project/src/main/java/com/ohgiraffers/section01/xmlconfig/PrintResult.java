package com.ohgiraffers.section01.xmlconfig;

public class PrintResult {
    public void printErrorMessage(String selectList) {


        String errorMessage = "";
        switch (selectList) {
            case "selectList" : errorMessage = "메뉴조회를 실패했습니다..."; break;
            case "selectOne" : errorMessage = "메뉴 코드로 메뉴 조회를 실패했습니다."; break;
            case "insert" : errorMessage = "신규 메뉴 등록에 실패했습니다..."; break;
        }

        System.out.println(errorMessage);


    }
}
