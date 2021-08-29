/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDon implements Serializable{
    private int id;
    private String Ten;
    private String LoaiTT;
    private int TongMonGoi;
    private float TongGia;
    private Date Ngay;

    public HoaDon() {
        super();
    }

    public HoaDon(int id, String Ten, String LoaiTT, int TongMonGoi, float TongGia, Date Ngay) {
        this.id = id;
        this.Ten = Ten;
        this.LoaiTT = LoaiTT;
        this.TongMonGoi = TongMonGoi;
        this.TongGia = TongGia;
        this.Ngay = Ngay;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getTongMonGoi() {
        return TongMonGoi;
    }

    public void setTongMonGoi(int TongMonGoi) {
        this.TongMonGoi = TongMonGoi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoaiTT() {
        return LoaiTT;
    }

    public void setLoaiTT(String LoaiTT) {
        this.LoaiTT = LoaiTT;
    }

    public float getTongGia() {
        return TongGia;
    }

    public void setTongGia(float TongGia) {
        this.TongGia = TongGia;
    }

    public Date getNgay() {
        return Ngay;
    }

    public void setNgay(Date Ngay) {
        this.Ngay = Ngay;
    }
    public Object[] toObject(){
        return new Object[]{
            id, Ten, LoaiTT, TongMonGoi, TongGia,  Ngay
        };
    }
}
