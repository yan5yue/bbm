package com.ecjtu.bbm.orm.mapper;

import com.ecjtu.bbm.orm.domain.User;

import java.util.List;

/**
 * @description:
 * @author: xu_pf@suixingpay.com
 * @date: 2018/1/13
 */
public interface UserMapper {
    /**
     * 查询：根据相应条件查询
     *
     * @param user  User
     * @return      List<User>
     */
    List<User> findList(User user);

    /**
     * 查询：根据UUID查询
     *
     * @param uuid  UUID
     * @return      User
     */
    User findOne(String uuid);

    /**
     * 插入
     *
     * @param user  User
     */
    void save(User user);

    /**
     * 删除：删除单条记录
     *
     * @param uuid  UUID
     */
    void delete(String uuid);

    /**
     * 删除：批量删除
     *
     * @param deleteIds 需删除的记录的UUID的集合
     */
    void deleteByBatch(List<String> deleteIds);
}
