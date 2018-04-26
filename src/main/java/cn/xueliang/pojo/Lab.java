package cn.xueliang.pojo;

public class Lab {
    private String labNum;

    private String labName;

    private String labCatagroy;

    private Integer labStatus;

    public String getLabNum() {
        return labNum;
    }

    public void setLabNum(String labNum) {
        this.labNum = labNum == null ? null : labNum.trim();
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName == null ? null : labName.trim();
    }

    public String getLabCatagroy() {
        return labCatagroy;
    }

    public void setLabCatagroy(String labCatagroy) {
        this.labCatagroy = labCatagroy == null ? null : labCatagroy.trim();
    }

    public Integer getLabStatus() {
        return labStatus;
    }

    public void setLabStatus(Integer labStatus) {
        this.labStatus = labStatus;
    }
}