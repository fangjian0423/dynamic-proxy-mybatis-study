package org.format.dynamicproxy.mybatis.dao;

import org.format.dynamicproxy.mybatis.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    public User getById(int id);

    public int add(User user);

    public int update(User user);

    public int delete(User user);

    public List<User> getAll();

}
