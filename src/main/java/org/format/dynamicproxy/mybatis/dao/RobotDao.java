package org.format.dynamicproxy.mybatis.dao;

import org.format.dynamicproxy.mybatis.bean.Robot;
import org.springframework.stereotype.Repository;

@Repository
public interface RobotDao {

    public Robot getById(int id);

    public int add(Robot robot);

}
