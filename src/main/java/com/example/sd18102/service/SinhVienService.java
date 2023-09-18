package com.example.sd18102.service;

import com.example.sd18102.model.SinhVien;

import java.util.ArrayList;

public interface SinhVienService {

    ArrayList<SinhVien> getAll();

    Boolean add(SinhVien sinhVien);

    Boolean delete(String id);

    SinhVien detail(String id);
}
