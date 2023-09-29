package com.example.sd18102.service;

import com.example.sd18102.model.CuaHang;

import java.util.List;
import java.util.UUID;

public interface CuaHangService {

    List<CuaHang> getAll();

    void delete(UUID id);

    CuaHang detail(UUID id);

    CuaHang update(UUID id, CuaHang cuaHang);
}
