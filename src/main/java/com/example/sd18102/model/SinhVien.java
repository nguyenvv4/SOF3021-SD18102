package com.example.sd18102.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SinhVien {

    @NotBlank(message = "Khong duoc de trong")
    private String id;

    @NotBlank(message = "Ten khong duoc de trong")
    private String username;

    private String gioiTinh;

    private String diaChi;

    public SinhVien(String username, String gioiTinh, String diaChi) {
        this.username = username;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
}
