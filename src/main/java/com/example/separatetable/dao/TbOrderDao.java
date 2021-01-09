package com.example.separatetable.dao;

import com.example.separatetable.entity.TbOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author WuWei
 * desc
 * 2021/1/9
 */
@Repository
public interface TbOrderDao extends JpaRepository<TbOrder, Long> {

}
