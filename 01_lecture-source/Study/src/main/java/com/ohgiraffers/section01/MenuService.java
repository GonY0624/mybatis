package com.ohgiraffers.section01;

import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.ohgiraffers.common.Template.getSqlSession;

public class MenuService {

    private DynamicMapper mapper;

    public void selectMenuByPrice(int price){

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(DynamicMapper.class);

        // 필기. 기본 자료형으로는 조건문의 값을 비교할 수 잆으며 해쉬맵의 키 또는 디티오의 게터를 이용하여 값을 확인할 수 있음
        Map<String, Integer> map = new HashMap<>();
        map.put("price", price);

        List<MenuDTO> menuList = mapper.selectMenuByPrice(map);


    }

}
