package edu.bjtu.sse.db.contract.daoImpl;

import edu.bjtu.sse.db.contract.dao.bingliDao;
import edu.bjtu.sse.db.contract.model.bingli;
import edu.bjtu.sse.db.contract.util.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;

public class bingliDaoImpl implements bingliDao {
    @Override
    public ArrayList<bingli> getAllbingli(String name) {
        ArrayList<bingli> list = new ArrayList<>();
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT * FROM bingli where name=?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, name);
            ResultSet resultSet = pst.executeQuery();

            while (resultSet.next()) {
                bingli bingli = new bingli(resultSet.getString("name"),resultSet.getString("time"),resultSet.getString("result"));
                list.add(bingli);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean insertbingli(String name, String time, String result) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "INSERT INTO bingli (name, time, result) VALUES (?,?,?)";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);

            pst.setString(1, name);
            pst.setString(2, time);
            pst.setString(3, result);
            pst.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
