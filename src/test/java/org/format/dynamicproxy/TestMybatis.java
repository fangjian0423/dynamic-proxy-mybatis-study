package org.format.dynamicproxy;

import org.format.dynamicproxy.mybatis.bean.User;
import org.format.dynamicproxy.mybatis.dao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")
public class TestMybatis {

    @Autowired
    private UserDao userDao;

    @Test
    public void testGet() {
        int id = 1;
        System.out.println(userDao.getById(id));
    }

    @Test
    public void testGetAll() {
        List<User> users = userDao.getAll();
        for(User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testAdd() {
        User user = new User();
        user.setAge(100);
        user.setName("gogo");
        user.setBirthday(new Date());
        Assert.assertEquals(1, userDao.add(user));
    }

    @Test
    public void testUpdate() {
        User user = new User();
        user.setId(1);
        user.setBirthday(new Date());
        Assert.assertEquals(1, userDao.update(user));
    }


    @Test
    public void testDelete() {
        User user = new User();
        user.setId(3);
        Assert.assertEquals(1, userDao.delete(user));
    }


}
