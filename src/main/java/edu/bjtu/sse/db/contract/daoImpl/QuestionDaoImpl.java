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
    public String getResult(int id) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT result FROM q_and_a where id=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1,id);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("result");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String getQuestion2(String answer1) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q2 FROM q_and_a where a1=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            System.out.println(pst);
            System.out.println(answer1);
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
        String sql = "SELECT DISTINCT q4 FROM q_and_a where a1=? and a2=? and a3=?";

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
        String sql = "SELECT DISTINCT q5 FROM q_and_a where a1=? and a2=? and a3=? and a4=?";

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
    @Override
    public String getQuestion6(String answer1, String answer2, String answer3, String answer4,String answer5) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q6 FROM q_and_a where a1=? and a2=? and a3=? and a4=? and a5=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("q6");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    @Override
    public String getQuestion7(String answer1, String answer2, String answer3, String answer4,String answer5,String answer6) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q7 FROM q_and_a where a1=? and a2=? and a3=? and a4=? and a5=? and a6=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("q7");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    @Override
    public String getQuestion8(String answer1, String answer2, String answer3, String answer4,String answer5,String answer6,String answer7) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q8 FROM q_and_a where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("q8");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    @Override
    public String getQuestion9(String answer1, String answer2, String answer3, String answer4,String answer5,String answer6,String answer7,String answer8) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q9 FROM q_and_a where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=? and a8=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            pst.setString(8,answer8);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("q9");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String getQuestion10(String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, String answer9) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q10 FROM q_and_a where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=? and a8=? and a9=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            pst.setString(8,answer8);
            pst.setString(9,answer9);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("q10");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public String getQuestion11(String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, String answer9, String answer10) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q11 FROM q_and_a where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=? and a8=? and a9=? and a10=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            pst.setString(8,answer8);
            pst.setString(9,answer9);
            pst.setString(10,answer10);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("q11");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String getQuestion12(String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, String answer9, String answer10, String answer11) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q12 FROM q_and_a where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=? and a8=? and a9=? and a10=? and a11=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            pst.setString(8,answer8);
            pst.setString(9,answer9);
            pst.setString(10,answer10);
            pst.setString(11,answer11);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("q12");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int getQuestionid4(String answer1, String answer2, String answer3) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT id FROM q_and_a where a1=? and a2=? and a3=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public int getQuestionid5(String answer1, String answer2, String answer3, String answer4) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT id FROM q_and_a where a1=? and a2=? and a3=? and a4=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
    @Override
    public int getQuestionid6(String answer1, String answer2, String answer3, String answer4,String answer5) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT id FROM q_and_a where a1=? and a2=? and a3=? and a4=? and a5=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
    @Override
    public int getQuestionid7(String answer1, String answer2, String answer3, String answer4,String answer5,String answer6) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT id FROM q_and_a where a1=? and a2=? and a3=? and a4=? and a5=? and a6=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
    @Override
    public int getQuestionid8(String answer1, String answer2, String answer3, String answer4,String answer5,String answer6,String answer7) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT id FROM q_and_a where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
    @Override
    public int getQuestionid9(String answer1, String answer2, String answer3, String answer4,String answer5,String answer6,String answer7,String answer8) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT id FROM q_and_a where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=? and a8=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            pst.setString(8,answer8);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public int getQuestionid10(String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, String answer9) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT id FROM q_and_a where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=? and a8=? and a9=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            pst.setString(8,answer8);
            pst.setString(9,answer9);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public int getQuestionid11(String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, String answer9, String answer10) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT id FROM q_and_a where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=? and a8=? and a9=? and a10=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            pst.setString(8,answer8);
            pst.setString(9,answer9);
            pst.setString(10,answer10);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public int getQuestionid12(String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, String answer9, String answer10, String answer11) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT id FROM q_and_a where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=? and a8=? and a9=? and a10=? and a11=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            pst.setString(8,answer8);
            pst.setString(9,answer9);
            pst.setString(10,answer10);
            pst.setString(11,answer11);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public String getqResult(String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, String answer9, String answer10, String answer11,String answer12) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT result FROM q_and_a where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=? and a8=? and a9=? and a10=? and a11=? and a12=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            pst.setString(8,answer8);
            pst.setString(9,answer9);
            pst.setString(10,answer10);
            pst.setString(11,answer11);
            pst.setString(12,answer12);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("result");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    @Override
    public String getResultman(int id) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT result FROM q_and_aman where id=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1,id);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("result");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String getQuestionman2(String answer1) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q2 FROM q_and_aman where a1=?";

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
    public String getQuestionman3(String answer1, String answer2) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q3 FROM q_and_aman where a1=? and a2=?";

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
    public String getQuestionman4(String answer1, String answer2, String answer3) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q4 FROM q_and_aman where a1=? and a2=? and a3=?";

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
    public String getQuestionman5(String answer1, String answer2, String answer3, String answer4) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q5 FROM q_and_aman where a1=? and a2=? and a3=? and a4=?";

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
    @Override
    public String getQuestionman6(String answer1, String answer2, String answer3, String answer4,String answer5) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q6 FROM q_and_aman where a1=? and a2=? and a3=? and a4=? and a5=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("q6");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    @Override
    public String getQuestionman7(String answer1, String answer2, String answer3, String answer4,String answer5,String answer6) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q7 FROM q_and_aman where a1=? and a2=? and a3=? and a4=? and a5=? and a6=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("q7");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    @Override
    public String getQuestionman8(String answer1, String answer2, String answer3, String answer4,String answer5,String answer6,String answer7) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q8 FROM q_and_aman where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("q8");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    @Override
    public String getQuestionman9(String answer1, String answer2, String answer3, String answer4,String answer5,String answer6,String answer7,String answer8) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q9 FROM q_and_aman where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=? and a8=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            pst.setString(8,answer8);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("q9");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String getQuestionman10(String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, String answer9) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q10 FROM q_and_aman where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=? and a8=? and a9=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            pst.setString(8,answer8);
            pst.setString(9,answer9);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("q10");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public String getQuestionman11(String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, String answer9, String answer10) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q11 FROM q_and_aman where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=? and a8=? and a9=? and a10=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            pst.setString(8,answer8);
            pst.setString(9,answer9);
            pst.setString(10,answer10);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("q11");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String getQuestionman12(String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, String answer9, String answer10, String answer11) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT q12 FROM q_and_aman where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=? and a8=? and a9=? and a10=? and a11=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            pst.setString(8,answer8);
            pst.setString(9,answer9);
            pst.setString(10,answer10);
            pst.setString(11,answer11);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("q12");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int getQuestionidman4(String answer1, String answer2, String answer3) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT id FROM q_and_aman where a1=? and a2=? and a3=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public int getQuestionidman5(String answer1, String answer2, String answer3, String answer4) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT id FROM q_and_aman where a1=? and a2=? and a3=? and a4=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
    @Override
    public int getQuestionidman6(String answer1, String answer2, String answer3, String answer4,String answer5) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT id FROM q_and_aman where a1=? and a2=? and a3=? and a4=? and a5=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
    @Override
    public int getQuestionidman7(String answer1, String answer2, String answer3, String answer4,String answer5,String answer6) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT id FROM q_and_aman where a1=? and a2=? and a3=? and a4=? and a5=? and a6=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
    @Override
    public int getQuestionidman8(String answer1, String answer2, String answer3, String answer4,String answer5,String answer6,String answer7) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT id FROM q_and_aman where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }
    @Override
    public int getQuestionidman9(String answer1, String answer2, String answer3, String answer4,String answer5,String answer6,String answer7,String answer8) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT id FROM q_and_aman where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=? and a8=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            pst.setString(8,answer8);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public int getQuestionidman10(String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, String answer9) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT id FROM q_and_aman where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=? and a8=? and a9=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            pst.setString(8,answer8);
            pst.setString(9,answer9);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public int getQuestionidman11(String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, String answer9, String answer10) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT id FROM q_and_aman where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=? and a8=? and a9=? and a10=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            pst.setString(8,answer8);
            pst.setString(9,answer9);
            pst.setString(10,answer10);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public int getQuestionidman12(String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, String answer9, String answer10, String answer11) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT id FROM q_and_aman where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=? and a8=? and a9=? and a10=? and a11=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            pst.setString(8,answer8);
            pst.setString(9,answer9);
            pst.setString(10,answer10);
            pst.setString(11,answer11);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getInt("id");

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
    }

    @Override
    public String getqResultman(String answer1, String answer2, String answer3, String answer4, String answer5, String answer6, String answer7, String answer8, String answer9, String answer10, String answer11) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT DISTINCT result FROM q_and_a where a1=? and a2=? and a3=? and a4=? and a5=? and a6=? and a7=? and a8=? and a9=? and a10=? and a11=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,answer1);
            pst.setString(2,answer2);
            pst.setString(3,answer3);
            pst.setString(4,answer4);
            pst.setString(5,answer5);
            pst.setString(6,answer6);
            pst.setString(7,answer7);
            pst.setString(8,answer8);
            pst.setString(9,answer9);
            pst.setString(10,answer10);
            pst.setString(11,answer11);
            ResultSet resultSet = pst.executeQuery();
            resultSet.next();
            return resultSet.getString("result");

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        QuestionDaoImpl questiondaoimpl=new QuestionDaoImpl();
        System.out.println(questiondaoimpl.getQuestion2("头痛"));
    }
}
