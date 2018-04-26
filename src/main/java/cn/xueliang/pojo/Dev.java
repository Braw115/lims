package cn.xueliang.pojo;

public class Dev {
    private String devNum;

    private String devName;

    private String devAttribute;

    private Integer devStatus;

    public String getDevNum() {
        return devNum;
    }

    public void setDevNum(String devNum) {
        this.devNum = devNum == null ? null : devNum.trim();
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName == null ? null : devName.trim();
    }

    public String getDevAttribute() {
        return devAttribute;
    }

    public void setDevAttribute(String devAttribute) {
        this.devAttribute = devAttribute == null ? null : devAttribute.trim();
    }

    public Integer getDevStatus() {
        return devStatus;
    }

    public void setDevStatus(Integer devStatus) {
        this.devStatus = devStatus;
    }
}