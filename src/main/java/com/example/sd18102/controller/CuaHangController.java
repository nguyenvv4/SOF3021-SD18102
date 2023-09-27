package com.example.sd18102.controller;

import com.example.sd18102.model.CuaHang;
import com.example.sd18102.repository.CuaHangRepository;
import com.example.sd18102.service.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cua-hang")
public class CuaHangController {

    @Autowired
    CuaHangService cuaHangService;

    @Autowired
    CuaHangRepository cuaHangRepository;

    @GetMapping("/hien-thi")
    public String getAllCuaHang() {
        List<CuaHang> list = cuaHangRepository.getAll();
        list.forEach(x -> System.out.println(x.toString()));
//        String ten = "Ngan beo";
//        List<CuaHang> list = cuaHangRepository.findByTenAndMaOrderByMaDesc(ten, "CH09");
//        list.forEach(x -> System.out.println(x.toString()));
        CuaHang cuaHang = new CuaHang();
        cuaHang.setMa("CH11");
        cuaHang.setTen("Hang beo");
        cuaHang.setDiaChi("Ha noi");
        cuaHang.setThanhPho("Ha noi");
        cuaHang.setQuocGia("Viet nam");

        CuaHang cuaHang2 = new CuaHang();
        cuaHang2.setMa("CH12");
        cuaHang2.setTen("Hang beo");
        cuaHang2.setDiaChi("Ha noi");
        cuaHang2.setThanhPho("Ha noi");
        cuaHang2.setQuocGia("Viet nam");

        List<CuaHang> listCuaHang = new ArrayList<>();
        listCuaHang.add(cuaHang2);
        listCuaHang.add(cuaHang);
//        cuaHangRepository.save(cuaHang);
        cuaHangRepository.saveAll(listCuaHang);
        return null;
    }
}
