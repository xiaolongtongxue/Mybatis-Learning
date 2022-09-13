package xyz.txk.mybatis.test.dao;

import xyz.txk.mybatis.test.pojo.injection;

import java.util.List;

public interface InjectionMapper {
    List<injection> getTestByID(String id);
    List<injection> getTestLikeName(String name);
}
