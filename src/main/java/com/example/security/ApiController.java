package com.example.security;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;

@Controller
@ResponseBody
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public Map<String, String> json() {
        var map = new HashMap<String, String>();
        map.put("name", "jason");
        return map;
    }

    @GetMapping("/some_dto")
    public SomeDto dto() {
        var map = new SomeDto();
        map.name = "jason";
        map.age = 26;
        return map;
    }
}

class SomeDto {
    String name;
    Integer age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}