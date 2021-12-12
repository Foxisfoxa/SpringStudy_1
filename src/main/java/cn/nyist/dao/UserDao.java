package cn.nyist.dao;

import cn.nyist.beans.Account;



/**
 * @author Fox
 * @date 2021/12/05 15:49
 */
public interface UserDao {
    public void add();
    public Account selectOne(int id);
}
