package com.springMVC.pojo;

public class TreeInfo {
   String catgoryId;
   String classifyName;
   String createTime;
   String province;
   String provinceId;
   String cataLevel;
   String parentId;
   String createPerson;
   String remark;

    public TreeInfo() {
    }

    public TreeInfo(String catgoryId, String classifyName, String createTime, String province, String provinceId, String cataLevel, String parentId, String createPerson, String remark) {
        this.catgoryId = catgoryId;
        this.classifyName = classifyName;
        this.createTime = createTime;
        this.province = province;
        this.provinceId = provinceId;
        this.cataLevel = cataLevel;
        this.parentId = parentId;
        this.createPerson = createPerson;
        this.remark = remark;
    }

    public String getCatgoryId() {
        return catgoryId;
    }

    public void setCatgoryId(String catgoryId) {
        this.catgoryId = catgoryId;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }

    public String getCataLevel() {
        return cataLevel;
    }

    public void setCataLevel(String cataLevel) {
        this.cataLevel = cataLevel;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getCreatePerson() {
        return createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = createPerson;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
