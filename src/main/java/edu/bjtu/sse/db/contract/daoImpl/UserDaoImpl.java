package edu.bjtu.sse.db.contract.daoImpl;

import edu.bjtu.sse.db.contract.dao.UserDao;
import edu.bjtu.sse.db.contract.model.User;
import edu.bjtu.sse.db.contract.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDaoImpl implements UserDao {
    public ArrayList<User> getAllUser() {
        ArrayList<User> list = new ArrayList<>();
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT * FROM user";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();

            while (resultSet.next()) {
                User user = new User(resultSet.getInt("uid"), resultSet.getString("name"), resultSet.getString("password"),resultSet.getString("gender"),resultSet.getString("age"));
                list.add(user);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public int getUserBiggestId() {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT uId FROM user ORDER BY uId DESC LIMIT 1";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            ResultSet resultSet = pst.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt("uId");
            } else {
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public User getUserByName(String name) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT * FROM user WHERE name = ?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, name);
            ResultSet resultSet = pst.executeQuery();
            while (resultSet.next()) {
                return new User(resultSet.getInt("uId"), resultSet.getString("name"), resultSet.getString("password"),resultSet.getString("gender"),resultSet.getString("age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User getUserById(int uId) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT * FROM user WHERE uId = ?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, uId);
            ResultSet resultSet = pst.executeQuery();

            while (resultSet.next()) {
                return new User(resultSet.getInt("uId"), resultSet.getString("name"), resultSet.getString("password"),resultSet.getString("gender"),resultSet.getString("age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public boolean insertUser(String name, String password,String gender,String age) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "INSERT INTO user (uid, name, password,gender,age) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, User.idCount++);

            pst.setString(2, name);

            pst.setString(3, password);
            pst.setString(4, gender);
            pst.setString(5, age);
            pst.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteUser(int uId) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "delete from user where uId=?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, uId);
            pst.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateUserName(int uId, String newName) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "update user set name =? WHERE uId=?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, newName);
            pst.setInt(2, uId);

            pst.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateUserPassword(String name, String newPassword) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "update user set password =? WHERE name=?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, newPassword);
            pst.setString(2, name);

            pst.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean login(String username, String password) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "SELECT * FROM user WHERE name = ? and password=?";

        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet resultSet = pst.executeQuery();

            while (resultSet.next()) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        if (userDaoImpl.insertUser("梦梦", "12345678","女","20"))
            System.out.println("插入新user成功！！！");
        else
            System.out.println("插入新user失败...");

        ArrayList<User> list = userDaoImpl.getAllUser();
        if (list == null)
            System.out.println("查找失败");
        else {
            System.out.println("/***************user*****************/");
            int count = 1;
            for (User d : list) {
                System.out.println(count++ + ": " + d.getUid() + d.getName() + d.getPassword());
            }
        }
        User list1 = userDaoImpl.getUserByName("梦梦");
        if (list1 == null)
            System.out.println("查找失败");
        else {
            System.out.println("/***************user*****************/");

            System.out.println("mingcheng" + list1.getUid() + list1.getName() + list1.getPassword());
        }
        boolean b = userDaoImpl.login("123", "12345678");
        if (b == true) {
            System.out.println("dengluchenggong");
        } else {
            System.out.println("denglushibai");
        }
    }
}
