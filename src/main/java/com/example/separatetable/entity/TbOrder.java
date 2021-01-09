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
@Entity(name = "t_order")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TbOrder {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @Column(name = "order_no")
    private String orderNo;

    @Column(name = "create_name")
    private String createName;

    @Column(name = "price")
    private BigDecimal price;


}
