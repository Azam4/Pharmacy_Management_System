/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Com.modelpackage.CompanyModel;
import Interface.ICommon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utill.Dataconection;

/**
 *
 * @author A
 */
public class CompanyDAO implements ICommon<CompanyModel> {

    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    @Override
    public int save(CompanyModel t) {
        try {
            String qur = "insert into company (id, name, address, exprience, phone) values (?,?,?,?,?)";
            con = Dataconection.getconnection1();
            ps = con.prepareStatement(qur);
            ps.setString(1, t.getId());
            ps.setString(2, t.getName());
            ps.setString(3, t.getAddress());
            ps.setString(4, t.getExpriece());
            ps.setString(5, t.getPhone());
            return ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CompanyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public CompanyModel search(CompanyModel t) {
        try {
            String qur = "select * from company where id = ?";
            con = Dataconection.getconnection1();
            ps = con.prepareStatement(qur);
            ps.setString(1, t.getId());
            rs = ps.executeQuery();
            while (rs.next()) {
                CompanyModel s = new CompanyModel();
                s.setId(rs.getString("id"));
                s.setName(rs.getString("name"));
                s.setAddress(rs.getString("address"));
                s.setExpriece(rs.getString("exprience"));
                s.setPhone(rs.getString("phone"));
                return s;

            }
        } catch (SQLException ex) {
            Logger.getLogger(CompanyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public int update(CompanyModel t) {
        try {

            String qur = "update company set name = ?, address = ?,exprience = ?, phone = ? where id = ?";
            con = Dataconection.getconnection1();
            ps = con.prepareStatement(qur);
            ps.setString(1, t.getName());
            ps.setString(2, t.getAddress());
            ps.setString(3, t.getExpriece());
            ps.setString(4, t.getPhone());
            ps.setString(5, t.getId());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CompanyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public int delete(CompanyModel t) {
        try {
            String qur = "delete from company where id = ?";
            con = Dataconection.getconnection1();
            ps = con.prepareStatement(qur);
            ps.setString(1, t.getId());
            return ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CompanyDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;

    }

    @Override
    public List<CompanyModel> getAll(CompanyModel t) {
        //id, name, address, exprience, phone

        try {
            String qur = "select * from company";
            con = Dataconection.getconnection1();
            ps = con.prepareStatement(qur);
            rs = ps.executeQuery();
            List<CompanyModel> l = new ArrayList<>();
            while (rs.next()) {
                CompanyModel cm = new CompanyModel();
                cm.setId(rs.getString("id"));
                cm.setName(rs.getString("name"));
                cm.setAddress(rs.getString("address"));
                cm.setExpriece(rs.getString("exprience"));
                cm.setPhone(rs.getString("phone"));
                l.add(cm);
               
            }
             return l;
        } catch (SQLException ex) {
            ex.printStackTrace();
           
        }
         return null;
    }

}
