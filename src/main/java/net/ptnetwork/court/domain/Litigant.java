package net.ptnetwork.court.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 【请填写功能名称】对象 ct_litigant
 * 
 * @author cyh
 * @date 2021-11-10
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("ct_litigant")
public class Litigant implements Serializable {

private static final long serialVersionUID=1L;


    /** 当事人id */
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

    /** 承办人 */
    private String judge;

    /** 姓名 */
    private String name;

    /** 法律地位 */
    private String legalStatus;

    /** 类型 */
    private String type;

    /** 地址 */
    private String address;

    /** 联系电话 */
    private String phone;

    /** 性别 */
    private String sex;

    /** 出生日期 */
    private String birthday;

    /** 国籍/地区 */
    private String area;

    /** 民族 */
    private String nation;

    /** 文化程度 */
    private String education;

    /** 职业 */
    private String job;

    /** 证据类型 */
    private String idCardType;

    /** 证据号码 */
    private String idCard;

    /** 邮政编码 */
    private String postalCode;

    /** 单位机构 */
    private String company;

    /** 单位性质 */
    private String unitProperties;

    /** 法定代表人姓名 */
    private String legalMan;

    /** 法定代表人证件类型 */
    private String legalCardType;

    /** 法定代表人证件号码 */
    private String legalCard;

    /** 政治面貌 */
    private String politicalStatus;

    /** 送达地址 */
    private String sendAddress;

    /** 备用字段1 */
    private String field1;

    /** 备用字段2 */
    private String field2;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getJudge() {
        return judge;
    }

    public void setJudge(String judge) {
        this.judge = judge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLegalStatus() {
        return legalStatus;
    }

    public void setLegalStatus(String legalStatus) {
        this.legalStatus = legalStatus;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getIdCardType() {
        return idCardType;
    }

    public void setIdCardType(String idCardType) {
        this.idCardType = idCardType;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getUnitProperties() {
        return unitProperties;
    }

    public void setUnitProperties(String unitProperties) {
        this.unitProperties = unitProperties;
    }

    public String getLegalMan() {
        return legalMan;
    }

    public void setLegalMan(String legalMan) {
        this.legalMan = legalMan;
    }

    public String getLegalCardType() {
        return legalCardType;
    }

    public void setLegalCardType(String legalCardType) {
        this.legalCardType = legalCardType;
    }

    public String getLegalCard() {
        return legalCard;
    }

    public void setLegalCard(String legalCard) {
        this.legalCard = legalCard;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getSendAddress() {
        return sendAddress;
    }

    public void setSendAddress(String sendAddress) {
        this.sendAddress = sendAddress;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }
}
