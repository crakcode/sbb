package com.mysite.sbb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

//  sbb와 매핑되는것을 찾아서 리턴, 도메인명과 포트(ex localhost:8080)는 변경되기에 적지 않는다.
    @GetMapping("/sbb")
// ReponseBody는 URL요청에 대한 응답으로 문자열을 리턴
    @ResponseBody
    public String index(){
        return "Hello world";
    }


}
