package com.board.test.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.is;



//일단 src\main에서 만들었던 패키지와 같은 이름의 패키지를 test에도 생성한후 Test 클래스를 추가해 줘야함!@!
//이 클래스에 테스트 코드를 추가해 본 것임!!! 아직은 처음이라 매우 복잡해 보이지만 하나하나 뜯어보면 다 아는 내용들임

@RunWith(SpringRunner.class)
@WebMvcTest
public class HelloControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void hello가_리턴되다() throws Exception{
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())
                .andExpect(content().string(hello));
    }
    @Test
    public void helloDto가_리턴된다() throws Exception {
        String name = "hello";
        int amount = 1000;

        mvc.perform(
                get("/hello/dto").param("name", name).param("amount",String.valueOf(amount)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.amount",is(amount)));

    }
}
/*
param
-api테스트할 때 사용될 요청 파라미터를 설정함
-단, 값은 string만 가능
-따라서 숫자, 날짜 같은 데이터 등록시에는 문자열로 변환하야함 String.valueof()

jsonPath
-JSON응답값을 필드별로 검증할 수 있는 메소드임
-$를 기준으로 필드명을 명시함
-여기서는 name과 amount를 검증하니까 $.name %.amount로 검증함
*/
