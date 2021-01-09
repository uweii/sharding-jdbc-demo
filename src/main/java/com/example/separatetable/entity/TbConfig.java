package com.example.separatetable.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @author WuWei
 * desc
 * 2021/1/9
 */
@Entity(name = "t_config")
@NoArgsConstructor
@Data
public class TbConfig {
    @Id()
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "remark")
    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "last_modify_time")
    private Date lastModifyTime;


}
