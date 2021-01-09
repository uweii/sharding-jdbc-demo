package com.example.separatetable.dao;

import com.example.separatetable.entity.TbOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author WuWei
 * desc
 * 2021/1/9
 */
@Repository
public interface TbOrderItemDao extends JpaRepository<TbOrderItem, Long> {

}
