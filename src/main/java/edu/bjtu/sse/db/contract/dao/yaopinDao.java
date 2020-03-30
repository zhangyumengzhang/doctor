package edu.bjtu.sse.db.contract.dao;

import edu.bjtu.sse.db.contract.model.yaopin;

import java.util.ArrayList;

public interface yaopinDao {
    ArrayList<yaopin> getyaobyresult(String name);
}
