package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * TODO
 *
 * @author Gpower
 * @date 2022/5/19 10:01
 */
@Mapper
public interface UserMapper {
    User selectById(int id);

    User selectByName(String Username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);
}
