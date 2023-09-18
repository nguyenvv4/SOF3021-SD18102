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

    @Override
    public Boolean add(SinhVien sinhVien) {
        return listSinhVien.add(sinhVien);
    }

    @Override
    public Boolean delete(String id) {
        for (SinhVien sinhVien : listSinhVien) {
            if (sinhVien.getId().equals(id)) {
                listSinhVien.remove(sinhVien);
                break;
            }
        }
        return true;
    }

    @Override
    public SinhVien detail(String id) {
        SinhVien sinhVienDetail = new SinhVien();
        for (SinhVien sinhVien: listSinhVien){
            if (sinhVien.getId().equals(id)){
                sinhVienDetail = sinhVien;
            }
        }
        return sinhVienDetail;
    }

    @Override
    public Boolean update(String id, SinhVien sinhVien) {
        for (SinhVien sv : listSinhVien){
            if (sv.getId().equals(id)){
                sv.setDiaChi(sinhVien.getDiaChi());
                sv.setUsername(sinhVien.getUsername());
                sv.setGioiTinh(sinhVien.getGioiTinh());
            }
            break;
        }
        return true;
    }
}
