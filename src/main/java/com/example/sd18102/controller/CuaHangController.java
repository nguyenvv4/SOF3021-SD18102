package com.example.sd18102.controller;

import com.example.sd18102.model.CuaHang;
import com.example.sd18102.service.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cua-hang")
public class CuaHangController {

    @Autowired
    CuaHangService cuaHangService;
    @GetMapping("/hien-thi")
    public String getAllCuaHang() {
        List<CuaHang> list = cuaHangService.getAll();
        list.forEach(x -> System.out.println(x.toString()));

        return null;
    }
}
