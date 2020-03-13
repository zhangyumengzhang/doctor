package edu.bjtu.sse.db.contract.daoImpl;

import edu.bjtu.sse.db.contract.dao.QuestionDao;
import edu.bjtu.sse.db.contract.model.Question;
import edu.bjtu.sse.db.contract.model.User;
import edu.bjtu.sse.db.contract.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QuestionDaoImpl implements QuestionDao {
    @Override
    public String getQuestion2(String answer1) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q2 FROM q_and_a where a1=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
          return resultSet.getString("q2");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String getQuestion3(String answer1, String answer2) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q3 FROM q_and_a where a1=? and a2=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("q3");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String getQuestion4(String answer1, String answer2, String answer3) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q3 FROM q_and_a where a1=? and a2=? and a3=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("q4");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String getQuestion5(String answer1, String answer2, String answer3, String answer4) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q3 FROM q_and_a where a1=? and a2=? and a3=? and a4=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("q5");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
