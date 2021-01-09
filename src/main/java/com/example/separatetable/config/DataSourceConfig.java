package com.example.separatetable.config;

import com.example.separatetable.dao.TbConfigDao;
import com.example.separatetable.dao.TbOrderDao;
import com.example.separatetable.dao.TbOrderItemDao;
import com.example.separatetable.entity.TbOrder;
import com.example.separatetable.entity.TbOrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;

/**
 * @author WuWei
 * desc
 * 2021/1/9
 */
@Configuration
public class DataSourceConfig {

    @Autowired
    private TbOrderDao tbOrderDao;
    @Autowired
    private TbOrderItemDao tbOrderItemDao;
    @Autowired
    private TbConfigDao tbConfigDao;

    @PostConstruct
    public void test() {
        for (int i = 0; i < 5; i++) {
            TbOrder tbOrder = TbOrder.builder()
                    .orderNo("A000" + i)
                    .createName("订单 " + i )
                    .price(new BigDecimal("" + i))
                    .build();
            tbOrderDao.save(tbOrder);

            System.out.println(tbOrder.getId());
            TbOrderItem tbOrderItem = TbOrderItem.builder()
                    .orderId(tbOrder.getId())
                    .orderNo(tbOrder.getOrderNo())
                    .itemName("服务项目 " + i)
                    .price(tbOrder.getPrice())
                    .build();
            tbOrderItemDao.save(tbOrderItem);

        }
    }


}
