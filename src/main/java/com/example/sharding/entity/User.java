package com.example.sharding.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 只分表不分库实体，可以有与分库列名相同字段
 * </p>
 *
 * @author fahomelee
 * @since 2019-06-14
 */
@Data
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;

    private Long userId;
}
