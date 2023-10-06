package com.example.sd18102.controller;

import com.example.sd18102.model.HoaDonChiTiet;
import com.example.sd18102.repository.HoaDonChiTietRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/")
public class HoaDonChiTietController {

    @Autowired
    private HoaDonChiTietRepository hoaDonChiTietRepository;
    @GetMapping()
    private String test(){
        hoaDonChiTietRepository.findAll().forEach(x -> System.out.println(x.toString()));
        return null;
    }
}
