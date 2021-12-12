package cn.nyist.Test;

import cn.nyist.beans.Account;
import cn.nyist.serivice.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Fox
 * @date 2021/12/05 16:08
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bead.xml")
public class test_1 {

    @Autowired
    private UserService userService;

    @Test
    public void Add(){
        userService.add();
    }

    @Test
    public void selectOne(){
        Account account = userService.selectOne(1);
        System.out.println(account);
    }

}
