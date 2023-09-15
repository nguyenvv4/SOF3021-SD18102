package com.example.sd18102.controller;

import com.example.sd18102.model.SinhVien;
import com.example.sd18102.service.SinhVienService;
import com.example.sd18102.service.impl.SinhVienServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/sinh-vien")
public class AppController {

    //    SinhVienService sinhVienService = new SinhVienServiceImpl();
    @Autowired
    private SinhVienService sinhVienService;

    @GetMapping("/hien-thi")
//    @RequestMapping(value = "/hien-thi", method = RequestMethod.GET)
    public String hienThi(Model model) {
        ArrayList<SinhVien> listSinhVien = sinhVienService.getAll();
        System.out.println(listSinhVien.size());
        model.addAttribute("list", listSinhVien);
        return "index";
    }

    @GetMapping("/chi-tiet")
    public String chiTiet(
            @RequestParam("id") String ma

    ) {
        System.out.println("id la: " + ma);
        return "index";
    }
}
