package xyz.txk.mybatis.test.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import xyz.txk.mybatis.test.pojo.User;
import xyz.txk.mybatis.test.util.mybatis_util;

import java.util.HashMap;
import java.util.List;

public class UserMapperTest {
    @Test
    public void test() {
        try (SqlSession sqlSession = mybatis_util.getSqlSession()) {
            //List<User> userList = sqlSession.selectList("xyz.txk.mybatis.test.dao.UserMapper.getUserList");
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test1(){
        try (SqlSession sqlSession = mybatis_util.getSqlSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUserByID(1);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test2(){
        try (SqlSession sqlSession = mybatis_util.getSqlSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.addUser(new User(4,"txk","123456")));
            sqlSession.commit();
            List<User> userList = userMapper.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test3(){
        try (SqlSession sqlSession = mybatis_util.getSqlSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.changeUser(new User(4,"txkkkk","987654321")));
            sqlSession.commit();
            List<User> userList = userMapper.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test4(){
        try (SqlSession sqlSession = mybatis_util.getSqlSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.delUser(2));
            sqlSession.commit();
            List<User> userList = userMapper.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test5(){
        try (SqlSession sqlSession = mybatis_util.getSqlSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            HashMap map = new HashMap<String,Object>();
            map.put("userid",6);
            map.put("username","tx789746854");
            map.put("userpwd","456789");
            System.out.println(userMapper.addUser2(map));
            sqlSession.commit();
            List<User> userList = userMapper.getUserList();
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void test6(){
        try (SqlSession sqlSession = mybatis_util.getSqlSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            HashMap map = new HashMap<String,Object>();
            map.put("userid",1);
            User user = (User) userMapper.getUserByID2(map);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test7(){
        try (SqlSession sqlSession = mybatis_util.getSqlSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserInList(new int[]{2, 3, 4, 5});
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
