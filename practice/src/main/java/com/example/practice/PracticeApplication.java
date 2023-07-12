package com.ktds.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) // 해당 exclude를 넣어야만 data source 설정 없이 실행 가능
public class HelloworldApplication {

    @GetMapping("/hello") // 퍼블릭주소:8080/hello로 접속 시 Hello world! 출력.
    public ResponseEntity<String> helloworld() {
        return new ResponseEntity<>("Hello world!", HttpStatus.OK);
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }

}
