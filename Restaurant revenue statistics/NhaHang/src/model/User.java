/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
 
public class User implements Serializable{
    private int id;
    private String TaiKhoan;
    private String MatKhau;
    private String Ten;
    private String ChucVu;
     
    public User() {
        super();
    }

    public User(int id, String TaiKhoan, String MatKhau, String Ten, String ChucVu) {
        this.id = id;
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
        this.Ten = Ten;
        this.ChucVu = ChucVu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }
    
}