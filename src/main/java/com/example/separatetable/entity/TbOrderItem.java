package com.example.separatetable.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @author WuWei
 * desc
 * 2021/1/9
 */
@Entity(name = "t_order_item")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TbOrderItem {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "order_no")
    private String orderNo;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "price")
    private BigDecimal price;


}
