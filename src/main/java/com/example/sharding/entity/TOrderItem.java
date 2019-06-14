package com.example.sharding.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class TOrderItem implements Serializable {

    private static final long serialVersionUID = 1L;
    private String orderItemId;
    
    private String orderId;

    private String userId;

}
