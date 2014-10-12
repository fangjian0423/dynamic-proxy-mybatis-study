package org.format.dynamicproxy.mybatis.dao;

import org.format.dynamicproxy.mybatis.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface RobotDao {

    public User getById(int id);

    public int add(User user);

}
