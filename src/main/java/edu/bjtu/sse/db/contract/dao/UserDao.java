package edu.bjtu.sse.db.contract.dao;
import edu.bjtu.sse.db.contract.model.User;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

public interface UserDao {
    ArrayList<User> getAllUser();
    int getUserBiggestId();
    User getUserByName(String name);
    User getUserById(int uId);
    boolean insertUser(String name, String password,String gender,String age);
    boolean deleteUser(int uId);
    boolean updateUserName(int uId, String newName);

    boolean updateUserPassword(String name, String newPassword);

    boolean login(String username, String password);
}
