package com.example.sharding.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 分库分表实体
 * </p>
 *
 * @author fahomelee
 * @since 2019-06-14
 */
@Data
@Accessors(chain = true)
public class TOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long orderId;

    private Long userId;

}
