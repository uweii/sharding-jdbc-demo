package com.example.separatetable;

import com.example.separatetable.dao.TbConfigDao;
import com.example.separatetable.dao.TbOrderDao;
import com.example.separatetable.dao.TbOrderItemDao;
import com.example.separatetable.entity.TbOrder;
import com.example.separatetable.entity.TbOrderItem;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MyTest{

    @Resource
    private TbOrderDao tbOrderDao;
    @Resource
    private TbOrderItemDao tbOrderItemDao;
    @Resource
    private TbConfigDao tbConfigDao;

    @Test
    void test() {
        for (int i = 0; i < 5; i++) {
            TbOrder tbOrder = TbOrder.builder()
                    .orderNo("A000" + i)
                    .createName("订单 " + i )
                    .price(new BigDecimal("" + i))
                    .build();
            tbOrderDao.save(tbOrder);

            TbOrderItem tbOrderItem = TbOrderItem.builder().id(tbOrder.getId())
                    .orderNo(tbOrder.getOrderNo())
                    .itemName("服务项目 " + i)
                    .price(tbOrder.getPrice())
                    .build();
            tbOrderItemDao.save(tbOrderItem);

        }
    }

}
