package edu.bjtu.sse.db.contract.daoImpl;

import edu.bjtu.sse.db.contract.dao.yaopinDao;
import edu.bjtu.sse.db.contract.model.bingli;
import edu.bjtu.sse.db.contract.model.yaopin;
import edu.bjtu.sse.db.contract.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class yaopinDaoImpl implements yaopinDao {
    @Override
    public ArrayList<yaopin> getyaobyresult(String name) {
        ArrayList<yaopin> list = new ArrayList<>();
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT * FROM drug_instruction where disease=?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, name);
            ResultSet resultSet = pst.executeQuery();

            while (resultSet.next()) {
                yaopin yaopin = new yaopin(resultSet.getString("disease"),resultSet.getString("medicine"),resultSet.getString("link"),resultSet.getString("instruction"),resultSet.getString("function"));
                list.add(yaopin);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
