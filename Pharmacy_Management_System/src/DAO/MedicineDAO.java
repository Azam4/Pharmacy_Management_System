package DAO;

import Com.modelpackage.AgentsModel;
import Com.modelpackage.MedicineModel;
import Interface.ICommon;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utill.Dataconection;

/**
 *
 * @author A
 */
public class MedicineDAO implements ICommon<MedicineModel> {

    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    @Override
    public int save(MedicineModel t) {
        try {
            String qur = "insert into medicine (m_id, m_name, m_price, m_qty, m_fabd, m_expd, m_comp) values (?,?,?,?,?,?,?)";
            con = Dataconection.getconnection1();
            ps = con.prepareStatement(qur);
            ps.setString(1, t.getM_id());
            ps.setString(2, t.getM_name());
            ps.setInt(3, t.getM_price());
            ps.setInt(4, t.getM_qty());
            ps.setString(5, t.getM_fabdate());
            ps.setString(6, t.getM_expdate());
            ps.setString(7, t.getM_comp());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    @Override
    public MedicineModel search(MedicineModel t) {
        try {

            String quer = "select * from medicine where m_id = ?";
            con = Dataconection.getconnection1();
            ps = con.prepareStatement(quer);
            ps.setString(1, t.getM_id());
            rs = ps.executeQuery();
            MedicineModel sel = new MedicineModel();

            while (rs.next()) {
                //System.out.println("helo serch");
                //m_id, m_name, m_price, m_qty, m_fabd, m_expd, m_comp
                sel.setM_id(rs.getString("m_id"));
                sel.setM_name(rs.getString("m_name"));
                sel.setM_price(rs.getInt("m_price"));
                //System.out.println(sel.getM_price());
                sel.setM_qty(rs.getInt("m_qty"));
                sel.setM_comp(rs.getString("m_comp"));

            }
            return sel;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }

    @Override
    public int update(MedicineModel t) {
        try {
            String qur = "update medicine set m_name = ?, m_price = ?,m_qty = ?,m_comp = ? where m_id = ?";
            con = Dataconection.getconnection1();
            ps = con.prepareStatement(qur);
            //System.out.println("helo uddate dao");
            ps.setString(1, t.getM_name());
            ps.setInt(2, t.getM_price());
            ps.setInt(3, t.getM_qty());
            //ps.setString(4, t.getM_fabdate());
            //ps.setString(5, t.getM_expdate());
            ps.setString(4, t.getM_comp());
            ps.setString(5, t.getM_id());

            return ps.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex);
            return 0;
        }

    }

    @Override
    public int delete(MedicineModel t) {
        try {
            String qur = "delete from medicine where m_id = ?";
            con = Dataconection.getconnection1();
            ps = con.prepareStatement(qur);
            ps.setString(1, t.getM_id());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();

        }
        return 0;
    }

    @Override
    public List<MedicineModel> getAll(MedicineModel t) {
      
        try {
            String quer = "select * from medicine";
            con = Dataconection.getconnection1();
            ps = con.prepareStatement(quer);
            rs = ps.executeQuery();
            List<MedicineModel> l = new ArrayList<MedicineModel>();
            while (rs.next()) {
                MedicineModel me = new MedicineModel();
                // m_id, m_name, m_price, m_qty, m_fabd, m_expd, m_comp

                me.setM_id(rs.getString("m_id"));
                me.setM_name(rs.getString("m_name"));
                me.setM_price(rs.getInt("m_price"));
                me.setM_qty(rs.getInt("m_qty"));
                me.setM_fabdate(rs.getString("m_fabd"));
                me.setM_expdate(rs.getString("m_expd"));
                me.setM_comp(rs.getString("m_comp"));
                l.add(me);
                
           
            }
            return l;
        } catch (SQLException ex) {
            Logger.getLogger(MedicineDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
