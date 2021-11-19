package net.ptnetwork.court.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * 【请填写功能名称】对象 ct_law_case
 * 
 * @author cyh
 * @date 2021-11-10
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
@TableName("ct_law_case")
public class LawCase implements Serializable {

private static final long serialVersionUID=1L;


    /** 案件id */
    @TableId(value = "id")
    private Long id;

    /** 创建时间 */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    /** 修改时间 */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    /** 期限 */
    private String deadline;

    /** 案件状态:0预立案，1诉前送达，2诉前调查，3调解，4待立案，5已立案待送达，6庭前送达，7审理中，8冻结，9结案，10不予受理，11诉前销案 */
    private String state;

    /** 系列案 */
    private String series;

    /** 案号 */
    private String caseNo;

    /** 执行主体 */
    private String executiveBody;

    /** 案由 */
    private String reason;

    /** 承包部门 */
    private String takingDepartment;

    /** 承办人 */
    private String judge;

    /** 审判长 */
    private String presidingJudge;

    /** 法官助理 */
    private String assistantJudge;

    /** 书记员 */
    private String clerk;

    /** 合议庭成员 */
    private String fullcourtMember;

    /** 案件涉及 */
    private String caseInvolve;

    /** 收案日期 */
    private Date receiveDate;

    /** 立案日期 */
    private Date filingDate;

    /** 立案人 */
    private String filingPeople;

    /** 申请执行标的 */
    private String objectApplication;

    /** 预估执行费 */
    private String estImpCosts;

    /** 分案时间 */
    private Date pointsTime;

    /** 听证日期 */
    private Date hearingDate;

    /** 应结案日期 */
    private Date closeDueDate;

    /** 结案日期 */
    private Date closeDate;

    /** 归档日期 */
    private Date fillingDate;

    /** 结案方式 */
    private String closeType;

    /** 结案事由 */
    private String closeFor;

    /** 结案方式说明 */
    private String desCloseMethod;

    /** 执行天数 */
    private String executeDay;

    /** 自然执行天数 */
    private String naturalExecutionDay;

    /** 结案标的 */
    private String finalMark;

    /** 执行到位金额 */
    private String amountPlace;

    /** 案件来源 */
    private String caseSource;

    /** 立案部门 */
    private String registerDepartment;

    /** 法定期限 */
    private Date legalTime;

    /** 超法定期限天数 */
    private String excLegalDay;

    /** 原案法院 */
    private String originalCourt;

    /** 原案（执行）案号 */
    private String originalCaseNo;

    /** 执行依据文号 */
    private String executionDependDocNo;

    /** 执行依据生效日期 */
    private Date executionDependEffDate;

    /** 执行依据种类 */
    private String executionDependKind;

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

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    public String getExecutiveBody() {
        return executiveBody;
    }

    public void setExecutiveBody(String executiveBody) {
        this.executiveBody = executiveBody;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getTakingDepartment() {
        return takingDepartment;
    }

    public void setTakingDepartment(String takingDepartment) {
        this.takingDepartment = takingDepartment;
    }

    public String getJudge() {
        return judge;
    }

    public void setJudge(String judge) {
        this.judge = judge;
    }

    public String getPresidingJudge() {
        return presidingJudge;
    }

    public void setPresidingJudge(String presidingJudge) {
        this.presidingJudge = presidingJudge;
    }

    public String getAssistantJudge() {
        return assistantJudge;
    }

    public void setAssistantJudge(String assistantJudge) {
        this.assistantJudge = assistantJudge;
    }

    public String getClerk() {
        return clerk;
    }

    public void setClerk(String clerk) {
        this.clerk = clerk;
    }

    public String getFullcourtMember() {
        return fullcourtMember;
    }

    public void setFullcourtMember(String fullcourtMember) {
        this.fullcourtMember = fullcourtMember;
    }

    public String getCaseInvolve() {
        return caseInvolve;
    }

    public void setCaseInvolve(String caseInvolve) {
        this.caseInvolve = caseInvolve;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public Date getFilingDate() {
        return filingDate;
    }

    public void setFilingDate(Date filingDate) {
        this.filingDate = filingDate;
    }

    public String getFilingPeople() {
        return filingPeople;
    }

    public void setFilingPeople(String filingPeople) {
        this.filingPeople = filingPeople;
    }

    public String getObjectApplication() {
        return objectApplication;
    }

    public void setObjectApplication(String objectApplication) {
        this.objectApplication = objectApplication;
    }

    public String getEstImpCosts() {
        return estImpCosts;
    }

    public void setEstImpCosts(String estImpCosts) {
        this.estImpCosts = estImpCosts;
    }

    public Date getPointsTime() {
        return pointsTime;
    }

    public void setPointsTime(Date pointsTime) {
        this.pointsTime = pointsTime;
    }

    public Date getHearingDate() {
        return hearingDate;
    }

    public void setHearingDate(Date hearingDate) {
        this.hearingDate = hearingDate;
    }

    public Date getCloseDueDate() {
        return closeDueDate;
    }

    public void setCloseDueDate(Date closeDueDate) {
        this.closeDueDate = closeDueDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Date closeDate) {
        this.closeDate = closeDate;
    }

    public Date getFillingDate() {
        return fillingDate;
    }

    public void setFillingDate(Date fillingDate) {
        this.fillingDate = fillingDate;
    }

    public String getCloseType() {
        return closeType;
    }

    public void setCloseType(String closeType) {
        this.closeType = closeType;
    }

    public String getCloseFor() {
        return closeFor;
    }

    public void setCloseFor(String closeFor) {
        this.closeFor = closeFor;
    }

    public String getDesCloseMethod() {
        return desCloseMethod;
    }

    public void setDesCloseMethod(String desCloseMethod) {
        this.desCloseMethod = desCloseMethod;
    }

    public String getExecuteDay() {
        return executeDay;
    }

    public void setExecuteDay(String executeDay) {
        this.executeDay = executeDay;
    }

    public String getNaturalExecutionDay() {
        return naturalExecutionDay;
    }

    public void setNaturalExecutionDay(String naturalExecutionDay) {
        this.naturalExecutionDay = naturalExecutionDay;
    }

    public String getFinalMark() {
        return finalMark;
    }

    public void setFinalMark(String finalMark) {
        this.finalMark = finalMark;
    }

    public String getAmountPlace() {
        return amountPlace;
    }

    public void setAmountPlace(String amountPlace) {
        this.amountPlace = amountPlace;
    }

    public String getCaseSource() {
        return caseSource;
    }

    public void setCaseSource(String caseSource) {
        this.caseSource = caseSource;
    }

    public String getRegisterDepartment() {
        return registerDepartment;
    }

    public void setRegisterDepartment(String registerDepartment) {
        this.registerDepartment = registerDepartment;
    }

    public Date getLegalTime() {
        return legalTime;
    }

    public void setLegalTime(Date legalTime) {
        this.legalTime = legalTime;
    }

    public String getExcLegalDay() {
        return excLegalDay;
    }

    public void setExcLegalDay(String excLegalDay) {
        this.excLegalDay = excLegalDay;
    }

    public String getOriginalCourt() {
        return originalCourt;
    }

    public void setOriginalCourt(String originalCourt) {
        this.originalCourt = originalCourt;
    }

    public String getOriginalCaseNo() {
        return originalCaseNo;
    }

    public void setOriginalCaseNo(String originalCaseNo) {
        this.originalCaseNo = originalCaseNo;
    }

    public String getExecutionDependDocNo() {
        return executionDependDocNo;
    }

    public void setExecutionDependDocNo(String executionDependDocNo) {
        this.executionDependDocNo = executionDependDocNo;
    }

    public Date getExecutionDependEffDate() {
        return executionDependEffDate;
    }

    public void setExecutionDependEffDate(Date executionDependEffDate) {
        this.executionDependEffDate = executionDependEffDate;
    }

    public String getExecutionDependKind() {
        return executionDependKind;
    }

    public void setExecutionDependKind(String executionDependKind) {
        this.executionDependKind = executionDependKind;
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
