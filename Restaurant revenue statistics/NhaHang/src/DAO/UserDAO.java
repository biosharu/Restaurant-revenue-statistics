/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.User;
 
public class UserDAO extends DAO{
     
    public UserDAO() {
        super();
    }
     
    public boolean checkLogin(User user) {
        boolean result = false;
        String sql = "SELECT ChucVu, Ten FROM tblUser WHERE TaiKhoan = ? AND MatKhau = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getTaiKhoan());
            ps.setString(2, user.getMatKhau());
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                user.setChucVu(rs.getString("ChucVu"));
                user.setTen(rs.getString("Ten"));
                result = true;
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}