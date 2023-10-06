package com.example.sd18102.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "hoa_don_chi_tiet")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class HoaDonChiTiet {
    @EmbeddedId
    private IdHoaDonChiTiet id;

    private Integer soLuong;

    private Double donGia;

    @Override
    public String toString() {
        return "HoaDonChiTiet{" +
                "id ctsp=" + id.getIdChiTietSp().getId() +
                "id hoa don"+ id.getIdHoaDon().getId()+
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }
}
