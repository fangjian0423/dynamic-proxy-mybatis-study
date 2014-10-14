package org.format.dynamicproxy;

import org.format.dynamicproxy.mybatis.bean.Robot;
import org.format.dynamicproxy.mybatis.dao.RobotDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:beans.xml")
public class TestRobot {

    @Autowired
    private RobotDao robotDao;

    @Test
    public void testGet() {
        Robot robot = new Robot();
        robot.setAge(11);
        robot.setName("format");
        robot.setStatus(Robot.Status.DISABLE);
        robotDao.add(robot);
    }


}
