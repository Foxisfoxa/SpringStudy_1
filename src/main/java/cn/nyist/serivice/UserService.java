package cn.nyist.serivice;

import cn.nyist.beans.Account;
import cn.nyist.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Fox
 * @date 2021/12/05 15:53
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void add(){
        userDao.add();
    }

    public Account selectOne(int id){

        return userDao.selectOne(id);

    }

}
