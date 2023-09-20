package com.example.sd18102.controller;

import com.example.sd18102.model.SinhVien;
import com.example.sd18102.service.SinhVienService;
import com.example.sd18102.service.impl.SinhVienServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("sinhVien", new SinhVien());
        return "index";
    }

    @GetMapping("/chi-tiet")
    public String chiTiet(
            @RequestParam("id") String ma

    ) {
        System.out.println("id la: " + ma);
        return "index";
    }

//    @PostMapping("/add")
//    public String add(
//            @RequestParam("id") String id,
//            @RequestParam("username") String username,
//            @RequestParam("gioiTinh") String gioiTinh,
//            @RequestParam("diaChi") String diaChi
//    ) {
//        sinhVienService.add(new SinhVien(id, username, gioiTinh, diaChi));
//        return "redirect:/sinh-vien/hien-thi";
//    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id) {
        sinhVienService.delete(id);
        return "redirect:/sinh-vien/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable String id, Model model) {
        SinhVien sinhVien = sinhVienService.detail(id);
        model.addAttribute("sinhVien", sinhVien);
        return "detail";
    }

    @PostMapping("/update/{id}")
    public String update(
            @PathVariable String id,
            @RequestParam("username") String username,
            @RequestParam("gioiTinh") String gioiTinh,
            @RequestParam("diaChi") String diaChi
    ) {
        sinhVienService.update(id, new SinhVien(username, gioiTinh, diaChi));
        return "redirect:/sinh-vien/hien-thi";
    }

    @PostMapping("/add")
    public String add(
            @Valid @ModelAttribute("sinhVien") SinhVien sinhVien,
            BindingResult bindingResult,
            Model model
    ) {
        if(bindingResult.hasErrors()){
            return "index";
        }
        sinhVienService.add(sinhVien);
        return "redirect:/sinh-vien/hien-thi";
    }
}
