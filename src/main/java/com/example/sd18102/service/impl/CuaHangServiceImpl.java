package com.example.sd18102.service.impl;

import com.example.sd18102.model.CuaHang;
import com.example.sd18102.repository.CuaHangRepository;
import com.example.sd18102.service.CuaHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CuaHangServiceImpl implements CuaHangService {

    @Autowired
    CuaHangRepository cuaHangRepository;

    @Override
    public List<CuaHang> getAll() {

        return cuaHangRepository.findAll();
    }

    @Override
    public void delete(UUID id) {
        cuaHangRepository.deleteById(id);
    }

    @Override
    public CuaHang detail(UUID id) {
//       Optional<CuaHang> cuaHang= cuaHangRepository.findById(id);
        CuaHang cuaHang = cuaHangRepository.findById(id).get();
        return cuaHang;
    }

    @Override
    public CuaHang update(UUID id, CuaHang cuaHang) {
        CuaHang cuaHangNew = cuaHangRepository.save(cuaHang);
        return cuaHangNew;
    }
}
