package com.nowcoder.community.service;

import com.nowcoder.community.dao.UserMapper;
import com.nowcoder.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author Gpower
 * @date 2022/5/19 12:50
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User findUserById(int id){
        return userMapper.selectById(id);
    }
}
