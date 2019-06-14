package com.example.sharding.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 不分库不分表，不能包含分库字段
 * </p>
 *
 * @author fahomelee
 * @since 2019-06-14
 */
@Data
@Accessors(chain = true)
public class TUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;
    
    @TableField(value = "t_user_id")
    private String userId;
}
