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
public class DatBan implements Serializable{
    private int id;
    private Date Ngay;
    private String GhiChu;

    public DatBan() {
        super();
    }

    public DatBan(int id, Date Ngay, String GhiChu) {
        this.id = id;
        this.Ngay = Ngay;
        this.GhiChu = GhiChu;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgay() {
        return Ngay;
    }

    public void setNgay(Date Ngay) {
        this.Ngay = Ngay;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
}

