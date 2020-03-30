package edu.bjtu.sse.db.contract.dao;

import edu.bjtu.sse.db.contract.model.bingli;

import java.sql.Time;
import java.util.ArrayList;

public interface bingliDao {
    ArrayList<bingli> getAllbingli(String name);
    boolean insertbingli(String name, String time, String result);
}
