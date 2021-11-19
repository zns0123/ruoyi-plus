package net.ptnetwork.court.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 【请填写功能名称】对象 ct_signature
 * 
 * @author cyh
 * @date 2021-11-10
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("ct_signature")
public class Signature implements Serializable {

private static final long serialVersionUID=1L;


    /** 签章id */
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

    /** 文书名称 */
    private String docName;

    /** 文书来源 */
    private String docSource;

    /** 文书类型 */
    private String docType;

    /** 关联协同 */
    private String linkedTogether;

    /** 申请时间 */
    private Date applicationTime;

    /** 申请人 */
    private String proposer;

    /** 状态 */
    private String status;

    /** 签章文件份数 */
    private String signatureDocNum;

    /** 备用字段1 */
    private String field1;

    /** 备用字段2 */
    private String field2;

}
