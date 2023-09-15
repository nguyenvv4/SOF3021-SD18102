package com.example.sd18102.service.impl;

import com.example.sd18102.model.SinhVien;
import com.example.sd18102.service.SinhVienService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class SinhVienServiceImpl implements SinhVienService {

    ArrayList<SinhVien> listSinhVien = new ArrayList<>();

    public SinhVienServiceImpl() {
        listSinhVien.add(new SinhVien("PH12345", "Nguyen Van A", "Nam", "Nam Tu Liem"));
    }


    @Override
    public ArrayList<SinhVien> getAll() {
        return listSinhVien;
    }
}
