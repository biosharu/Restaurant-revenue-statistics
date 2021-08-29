/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class TKMonAn implements Serializable{
    private int id;
    private String Ten;
    private float Gia;
    private int SLKhachDung;
    private float DoanhThu;

    public TKMonAn() {
    }

    public TKMonAn(int id, String Ten, float Gia, int SLKhachDung, float DoanhThu) {
        this.id = id;
        this.Ten = Ten;
        this.Gia = Gia;
        this.SLKhachDung = SLKhachDung;
        this.DoanhThu = DoanhThu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }

    public int getSLKhachDung() {
        return SLKhachDung;
    }

    public void setSLKhachDung(int SLKhachDung) {
        this.SLKhachDung = SLKhachDung;
    }

    public float getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(float DoanhThu) {
        this.DoanhThu = DoanhThu;
    }
    public Object[] toObject(){
        return new Object[]{
            id, Ten, Gia, SLKhachDung, DoanhThu
        };
    }
    
}
