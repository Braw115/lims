package cn.xueliang.pojo;

public class Material {
    private String matNum;

    private String matName;

    private String matAttribute;

    private Double matRemain;

    public String getMatNum() {
        return matNum;
    }

    public void setMatNum(String matNum) {
        this.matNum = matNum == null ? null : matNum.trim();
    }

    public String getMatName() {
        return matName;
    }

    public void setMatName(String matName) {
        this.matName = matName == null ? null : matName.trim();
    }

    public String getMatAttribute() {
        return matAttribute;
    }

    public void setMatAttribute(String matAttribute) {
        this.matAttribute = matAttribute == null ? null : matAttribute.trim();
    }

    public Double getMatRemain() {
        return matRemain;
    }

    public void setMatRemain(Double matRemain) {
        this.matRemain = matRemain;
    }
}