package com.example.sd18102.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/sinh-vien")
public class AppController {

    @GetMapping("/hien-thi")
    @RequestMapping(value = "/hien-thi", method = RequestMethod.GET)
    public String hienThi(){
        return "index";
    }

    @GetMapping("/chi-tiet")
    public String chiTiet(
            @RequestParam("id") String ma

    ){
        System.out.println("id la: "+ma);
        return "index";
    }
}
