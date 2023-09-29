package com.example.sd18102.controller;

import com.example.sd18102.model.CuaHang;
import com.example.sd18102.model.SinhVien;
import com.example.sd18102.repository.CuaHangRepository;
import com.example.sd18102.service.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/cua-hang")
public class CuaHangController {

    @Autowired
    CuaHangService cuaHangService;

    @GetMapping("/hien-thi")
    public String getAllCuaHang(Model model) {
        List<CuaHang> list = cuaHangService.getAll();
        model.addAttribute("list", list);
        return "cua-hang";
    }

    @GetMapping("/delete/{id}")
    public String delete(Model model,
                         @PathVariable String id) {
        cuaHangService.delete(UUID.fromString(id));
        return "redirect:/cua-hang/hien-thi";
    }

    @GetMapping("/detail/{id}")
    public String detail(Model model,
                         @PathVariable String id) {
        CuaHang cuaHang = cuaHangService.detail(UUID.fromString(id));
        model.addAttribute("cuaHang", cuaHang);
        return "cua-hang-detail";
    }

    @PostMapping("/update/{id}")
    public String update(Model model,
                         @PathVariable String id,
                         @ModelAttribute("cuaHang") CuaHang cuaHang) {
        cuaHangService.update(UUID.fromString(id), cuaHang);
        return "redirect:/cua-hang/hien-thi";
    }
}
