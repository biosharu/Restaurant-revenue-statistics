/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.TKMonAn;
/**
 *
 * @author Admin
 */
public class TKMonAnDAO extends DAO{

    public TKMonAnDAO() {
        super();
    }
     public ArrayList<TKMonAn> TKMonAn(Date bd, Date kt){
        ArrayList<TKMonAn> result = new ArrayList<TKMonAn>();
        String sql = "select mn.ID, mn.Ten, mn.Gia,(select COUNT(distinct db.ID_Khach) from tblDatBan db, tblGoiMon gm WHERE db.ID = gm.ID_DatBan AND gm.ID_MonAn = mn.ID AND db.Ngay <= ? AND db.Ngay >= ?) as Tong_Khach_Dung,(select COUNT(gm.ID_MonAn)*mn.Gia from tblDatBan db, tblGoiMon gm WHERE db.ID = gm.ID_DatBan AND gm.ID_MonAn = mn.ID AND db.Ngay <= ? AND db.Ngay >= ?) as Doanh_Thu from tblMonAn mn order by Doanh_Thu DESC";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
         
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sdf.format(kt));
            ps.setString(2, sdf.format(bd));
            ps.setString(3, sdf.format(kt));
            ps.setString(4, sdf.format(bd));
            ResultSet rs = ps.executeQuery();
             
            while(rs.next()) {
                TKMonAn r = new TKMonAn();
                r.setId(rs.getInt("id"));
                r.setTen(rs.getString("Ten"));
                r.setGia(rs.getFloat("Gia"));
                r.setSLKhachDung(rs.getInt("Tong_Khach_Dung"));
                r.setDoanhThu(rs.getFloat("Doanh_Thu"));
                result.add(r);
            }           
        }catch(Exception e) {
            e.printStackTrace();
        }       
        return result;
    }
    
}
