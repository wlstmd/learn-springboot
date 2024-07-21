package com.example.rest_api.controller;

import com.example.rest_api.model.BookQueryParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class RestApiController {
    // 기본 라우팅
    @GetMapping("/hello")
    public String hello() {
        var html = "<html> <body> <h1 >Hello Spring Boot </h1> </body> </html>";
        return html;
    }

    // 파라미터 방식
    @GetMapping("/echo/{message}/age/{age}/is-man/{isMan}")
    public String echo(@PathVariable(name = "message") String msg, @PathVariable int age, @PathVariable boolean isMan) {
        System.out.println("echo message : " + msg);
        System.out.println("echo age : " + age);
        System.out.println("echo isMan : " + isMan);


        return msg.toUpperCase();
    }

    // 쿼리 스트링 방식
    @GetMapping("/book")
    public void queryParamDto(
            @RequestParam String category,
            @RequestParam String issuedYear,
            @RequestParam(name = "issued-month") String issuedMonth,
            @RequestParam String issued_day
    ) {
        System.out.println(category);
        System.out.println(issuedYear);
        System.out.println(issuedMonth);
        System.out.println(issued_day);
    }

    @GetMapping("/book2")
    public void queryParamDto(BookQueryParam bookQueryParam) {
        System.out.println(bookQueryParam);
    }

    @DeleteMapping("/user/{userName}/delete")
    public void delete(@PathVariable String userName) {
        log.info("user-name : {}", userName);
    }
}
