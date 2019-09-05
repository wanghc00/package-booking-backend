package tws.entity;

import java.io.Serializable;

public class PackageStorage implements Serializable {
    private static final long serialVersionUID = 1L;
    private String billNo;
    private String receivePerson;
    private String telephone;
    private String packageWeight;
    
    public PackageStorage() {
        
    }

    public PackageStorage(String billNo, String receivePerson, String telephone, String packageWeight) {
        this.billNo = billNo;
        this.receivePerson = receivePerson;
        this.telephone = telephone;
        this.packageWeight = packageWeight;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getReceivePerson() {
        return receivePerson;
    }

    public void setReceivePerson(String receivePerson) {
        this.receivePerson = receivePerson;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(String packageWeight) {
        this.packageWeight = packageWeight;
    }
  
}
