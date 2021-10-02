package DAO;

import Com.modelpackage.AgentsModel;
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
public class AgentsDAO implements ICommon<AgentsModel> {

    Connection con;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    @Override
    public int save(AgentsModel t) {
        try {
            String qur = "insert into agents (aId, aname, aage, aphone, apassword, agender) values (?,?,?,?,?,?)";
            con = Dataconection.getconnection1();
            ps = con.prepareStatement(qur);
            ps.setString(1, t.getaId());
            ps.setString(2, t.getaName());
            ps.setInt(3, t.getAge());
            ps.setString(4, t.getPhone());
            ps.setString(5, t.getApassword());
            ps.setString(6, t.getGender());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AgentsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public AgentsModel search(AgentsModel t) {

        try {
            String qur = "select * from agents where aId = ?";
            con = Dataconection.getconnection1();
            ps = con.prepareStatement(qur);
            ps.setString(1, t.getaId());
            rs = ps.executeQuery();
            AgentsModel se = new AgentsModel();
            while (rs.next()) {
                se.setaId(rs.getString("aId"));
                se.setaName(rs.getString("aname"));
                se.setAge(rs.getInt("aage"));
                se.setPhone(rs.getString("aphone"));
                se.setApassword(rs.getString("apassword"));
                se.setGender(rs.getString("agender"));
            }
            return se;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }

    @Override
    public int update(AgentsModel t) {
        try {
            //aId, aname, aage, aphone, apassword, agender

            String qur = "update agents set aname = ?,aage = ?,aphone = ?,apassword = ?,agender = ? where aId = ?";
            con = Dataconection.getconnection1();
            ps = con.prepareStatement(qur);
            ps.setString(1, t.getaName());
            ps.setInt(2, t.getAge());
            ps.setString(3, t.getPhone());
            ps.setString(4, t.getApassword());
            ps.setString(5, t.getGender());
            ps.setString(6, t.getaId());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;

    }

    @Override
    public int delete(AgentsModel t) {
        try {
            String qur = "delete from agents where aId = ?";
            con = Dataconection.getconnection1();
            ps = con.prepareStatement(qur);
            ps.setString(1, t.getaId());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AgentsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    @Override
    public List<AgentsModel> getAll(AgentsModel t) {
           String qur = "select * from agents";
            con = Dataconection.getconnection1();
        try {
            ps = con.prepareStatement(qur);
             rs = ps.executeQuery();
            List<AgentsModel> l = new ArrayList<AgentsModel>();
            while (rs.next()) {
                AgentsModel se = new AgentsModel();
                se.setaId(rs.getString("aId"));
                se.setaName(rs.getString("aname"));
                se.setAge(rs.getInt("aage"));
                se.setPhone(rs.getString("aphone"));
                se.setApassword(rs.getString("apassword"));
                se.setGender(rs.getString("agender"));
                l.add(se);
            }
            return l;
        } catch (SQLException ex) {
            return null;
        }
        
        
    }

}
