package com.example.sd18102.service.impl;

import com.example.sd18102.model.CuaHang;
import com.example.sd18102.repository.CuaHangRepository;
import com.example.sd18102.service.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuaHangServiceImpl implements CuaHangService {

    @Autowired
    CuaHangRepository cuaHangRepository;

    @Override
    public List<CuaHang> getAll() {

        return cuaHangRepository.findAll();
    }
}
