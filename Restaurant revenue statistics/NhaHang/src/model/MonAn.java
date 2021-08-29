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
public class MonAn implements Serializable{
    private int id;
    private String Ten;
    private float Gia;
    private String MoTa;

    public MonAn() {
        super();
    }
    
    public MonAn(int id, String Ten, float Gia, String MoTa) {
        this.id = id;
        this.Ten = Ten;
        this.Gia = Gia;
        this.MoTa = MoTa;
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

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }
}
