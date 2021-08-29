/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static DAO.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.HoaDon;
import model.TKMonAn;


/**
 *
 * @author Admin
 */
public class HoaDonDAO extends DAO{

    public HoaDonDAO() {
        super();
    }
    public ArrayList<HoaDon> LayHoaDon(int id, Date bd, Date kt){
        ArrayList<HoaDon> result = new ArrayList<HoaDon>();
        String sql = "select hd.ID,\n" +
        "kh.Ten,\n" +
        "hd.Ngay,\n" +
        "hd.LoaiTT,\n" +
        "(\n" +
        "select COUNT(gm.ID_MonAn) \n" +
        "from tblDatBan db, tblGoiMon gm\n" +
        "where db.ID = gm.ID_DatBan AND gm.ID_MonAn = mn.ID AND db.ID_Khach = kh.ID AND db.Ngay < ? AND db.Ngay > ?\n" +
        ") as Tong_So_Mon_Goi,\n" +
        "hd.TongGia\n" +
        "from tblHoaDon hd, tblDatBan db, tblKhachHang kh, tblGoiMon gm, tblMonAn mn\n" +
        "where hd.ID_DatBan = db.ID \n" +
        "AND db.ID_Khach = kh.ID \n" +
        "AND gm.ID_DatBan = db.ID\n" +
        "AND gm.ID_MonAn = mn.ID\n" +
        "AND mn.ID = ?\n" +
        "AND db.Ngay < ?\n" +
        "AND db.Ngay > ?";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sdf.format(kt));
            ps.setString(2, sdf.format(bd));
            ps.setInt(3, id);
            ps.setString(4, sdf.format(kt));
            ps.setString(5, sdf.format(bd));
            ResultSet rs = ps.executeQuery();
             
            while(rs.next()) {
                HoaDon r = new HoaDon();
                r.setId(rs.getInt("id"));
                r.setTen(rs.getString("Ten"));
                r.setLoaiTT(rs.getString("LoaiTT"));
                r.setTongMonGoi(rs.getInt("Tong_So_Mon_Goi"));
                r.setTongGia(rs.getFloat("TongGia"));
                r.setNgay(rs.getDate("Ngay"));
                result.add(r);
            }           
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        
        
        return result;
    }
}
