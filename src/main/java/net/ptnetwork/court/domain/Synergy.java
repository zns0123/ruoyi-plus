package net.ptnetwork.court.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 【请填写功能名称】对象 ct_synergy
 * 
 * @author cyh
 * @date 2021-11-10
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("ct_synergy")
public class Synergy implements Serializable {

private static final long serialVersionUID=1L;


    /** 协同id */
    @TableId(value = "id")
    private Long id;

    /** 创建时间 */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /** 修改时间 */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /** 案号 */
    private String caseNo;

    /** 协同类型 */
    private String synergyType;

    /** 协同单位 */
    private String synergyUnit;

    /** 发起时间 */
    private Date startingTime;

    /** 发起人 */
    private String initiator;

    /** 发起单位 */
    private String sponsoredUnit;

    /** 状态 */
    private String state;

    /** 剩余期限 */
    private String residualMaturity;

    /** 备用字段1 */
    private String field1;

    /** 备用字段2 */
    private String field2;

}
