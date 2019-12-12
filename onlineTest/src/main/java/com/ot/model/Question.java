package com.ot.model;

import java.util.Date;

public class Question {
    private Integer id;
    private String questionName;
    private Integer status;
    private String questionDesc;
    private Integer questionLevel;
    private Date createTime;
    private Date updateTime;
    private Integer isDelete;
    private Integer questionCorrectAnswer;
    private Integer konwledgeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getQuestionDesc() {
        return questionDesc;
    }

    public void setQuestionDesc(String questionDesc) {
        this.questionDesc = questionDesc;
    }

    public Integer getQuestionLevel() {
        return questionLevel;
    }

    public void setQuestionLevel(Integer questionLevel) {
        this.questionLevel = questionLevel;
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

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getQuestionCorrectAnswer() {
        return questionCorrectAnswer;
    }

    public void setQuestionCorrectAnswer(Integer questionCorrectAnswer) {
        this.questionCorrectAnswer = questionCorrectAnswer;
    }

    public Integer getKonwledgeId() {
        return konwledgeId;
    }

    public void setKonwledgeId(Integer konwledgeId) {
        this.konwledgeId = konwledgeId;
    }
}
