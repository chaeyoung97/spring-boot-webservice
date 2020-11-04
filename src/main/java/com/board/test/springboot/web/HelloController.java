package com.board.test.springboot.web;

import com.board.test.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//간단한 API를 만들어 볼 것임
@RestController
public class HelloController {
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }
   @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}


/*
@RestController
1.컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 줌
2.예전에는 @ResponseBody를 각 메소드마다 선언했던 것을 한번에 사용할 수 있게 해준다고 생각하면 됨
*/
/*
@GetMapping
1.http Method인 Get의 요청을 받을 수 있는 API를 만들어 줌
2.예전에는 @RequestMapping(method = RequestMethod.GET)으로 사용되었었음
이제 이 프로젝트는 /hello로 요청이 오면 문자열 hello를 반환하는 기능를 가지게 됨됨
*/

//이제 src\test에다가 테스트 코드를 작성할 클래스(테스트 클래스)를 생성함
//일반적으로 테스트 클래스는 대상 클래스 이름에 Test를 붙임 따라서 HelloControllerTest로 생성하면 됨