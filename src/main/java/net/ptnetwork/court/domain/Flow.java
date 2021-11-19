package net.ptnetwork.court.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 【请填写功能名称】对象 ct_flow
 * 
 * @author cyh
 * @date 2021-11-10
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("ct_flow")
public class Flow implements Serializable {

private static final long serialVersionUID=1L;


    /** 流程id */
    @TableId(value = "id")
    private Long id;

    /** 创建时间 */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /** 修改时间 */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /** 操作者 */
    private String handler;

    /** 操作时间 */
    private Date operationTime;

    /** 操作描述 */
    private String operationDescription;

    /** 备用字段1 */
    private String field1;

    /** 备用字段2 */
    private String field2;

}
