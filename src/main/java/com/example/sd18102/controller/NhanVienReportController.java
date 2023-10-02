package com.example.sd18102.controller;

import com.example.sd18102.model.CuaHang;
import com.example.sd18102.model.viewmodel.NhanVienReport;
import com.example.sd18102.repository.NhanVienReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/report")
public class NhanVienReportController {

    @Autowired
    NhanVienReportRepository nhanVienReportRepository;

    @GetMapping()
    public String getAll(Model model) {
        List<NhanVienReport> list = nhanVienReportRepository.findAll();
        List<String> listStr = list.stream().map(x -> x.getTen().toUpperCase()).collect(Collectors.toList());
        listStr.forEach(x -> System.out.println(x.toString()));
        return null;
    }
}
