package com.board.test.springboot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// JUnit을 이용한 테스트 코드를 작성
// 지금 만든 Application 클래스는 앞으로 만들 프로젝트의 메인 클래스가 됨
//@SpringBootApplication으로 인해 스프링 부트의 자동 설정, 스프링 Bean읽기와 생성을 모두 자동으로 설정됩니다.
//@SpringBootApplication이 있는 위치부터 설정을 읽어가기 때문에 이 클래스는 항상 프로젝트 최상단에 위치해야만 함
//SpringApplication.run으로 인해 내장 WAS(web application server)를  실행 함

//여기까지 Application클래스에 대한 내용이었고 이제 테스트를 위한 컨트롤러를 만들것임 이거는 현재 패키지에 하위 패키지 web을 만들어서 진행하겠음!!!
//앞으로 컨트롤러와 관련된 클래스들은 모두 이 web패키지에 담을 것임ㅁ
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
