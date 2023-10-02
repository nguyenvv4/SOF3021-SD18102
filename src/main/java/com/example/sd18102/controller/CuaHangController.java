package com.example.sd18102.controller;

import com.example.sd18102.model.CuaHang;
import com.example.sd18102.repository.CuaHangRepository;
import com.example.sd18102.service.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/cua-hang")
public class CuaHangController {

    @Autowired
    CuaHangService cuaHangService;

    @Autowired
    CuaHangRepository cuaHangRepository;

//    @GetMapping("/hien-thi")
//    public String getAllCuaHang(Model model) {
//        List<CuaHang> list = cuaHangService.getAll();
//        model.addAttribute("list", list);
//        return "cua-hang";
//    }

    @GetMapping("/hien-thi")
    public ResponseEntity getAllCuaHang(Model model) {
        List<CuaHang> list = cuaHangService.getAll();
//        model.addAttribute("list", list);
        return new ResponseEntity(list,HttpStatus.OK);
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

    @PostMapping("/add")
    public String add(Model model) {

        return "redirect:/cua-hang/hien-thi";
    }


    @PostMapping("/update/{id}")
    public String update(Model model,
                         @PathVariable String id,
                         @ModelAttribute("cuaHang") CuaHang cuaHang) {
        cuaHangService.update(UUID.fromString(id), cuaHang);
        return "redirect:/cua-hang/hien-thi";
    }

    @GetMapping("/page")
    public ResponseEntity page(Model model,
                               Pageable pageable) {
        Page<CuaHang> cuaHangs = cuaHangRepository.findAll(pageable);
       return new ResponseEntity(cuaHangs, HttpStatus.OK);

    }
}
