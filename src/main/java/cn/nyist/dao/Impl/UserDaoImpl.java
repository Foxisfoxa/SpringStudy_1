package cn.nyist.dao.Impl;

import cn.nyist.beans.Account;
import cn.nyist.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Fox
 * @date 2021/12/05 15:50
 */
@Repository
public class UserDaoImpl implements UserDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add() {
        String sql = "insert into account(id,name,money) values(?,?,?)";
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{null,"haha",999.9});
        list.add(new Object[]{null,"fox",999.9});
        list.add(new Object[]{null,"acv",999.9});
        list.add(new Object[]{null,"lkjhg",999.9});
        jdbcTemplate.batchUpdate(sql, list);
    }

    @Override
    public Account selectOne(int id) {
        String sql = "select * from account where id = ?";

        Account account = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Account.class), id);
        return account;
    }


}
