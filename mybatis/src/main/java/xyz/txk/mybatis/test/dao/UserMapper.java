package xyz.txk.mybatis.test.dao;

import xyz.txk.mybatis.test.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 获取全部用户
    List<User> getUserList();
    // 根据 ID 查询用户
    User getUserByID(int id);
    // 新增用户
    int addUser(User user);
    // 修改用户
    int changeUser(User user);
    // 删除用户
    int delUser(int id);

    List<User> getUserInList(int[] ids);

    // 新增用户Plus
    int addUser2(Map<String,Object> map);
    // 根据 ID 查询用户 Plus
    Object getUserByID2(Map<String,Object> map);



}
