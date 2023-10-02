package com.example.sd18102.model.viewmodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class NhanVienReport {

    @Id
    private String maHoaDon;

    private String ma;

    private String ten;

    private String gioiTinh;

    @Override
    public String toString() {
        return "NhanVienReport{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                '}';
    }
}
