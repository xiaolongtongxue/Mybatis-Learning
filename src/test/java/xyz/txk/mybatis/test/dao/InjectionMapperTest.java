package xyz.txk.mybatis.test.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import xyz.txk.mybatis.test.pojo.injection;
import xyz.txk.mybatis.test.util.mybatis_util;

import java.util.List;

public class InjectionMapperTest {
    @Test
    public void getTestByID_Test() {
        try (SqlSession sqlSession = mybatis_util.getSqlSession()) {
            InjectionMapper injectionMapper = sqlSession.getMapper(InjectionMapper.class);
            List<injection> injections = injectionMapper.getTestByID("001' or 1=1#");
//            for (injection injection : injections) {
//                System.out.println(injection);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getTestLikeName() {
        try (SqlSession sqlSession = mybatis_util.getSqlSession()) {
            InjectionMapper injectionMapper = sqlSession.getMapper(InjectionMapper.class);
            List<injection> injections = injectionMapper.getTestLikeName("lisi' or 1=1#");
            for (injection injection : injections) {
                System.out.println(injection);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
