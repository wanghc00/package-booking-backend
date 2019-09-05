package tws.entity;

import java.io.Serializable;

public class SubscribePackage implements Serializable{
    private static final long serialVersionUID = 1L;
    private String billNo;
    private String subscribeTime;
    
    public SubscribePackage() {
        
    }

    public SubscribePackage(String billNo, String subscribeTime) {
        this.billNo = billNo;
        this.subscribeTime = subscribeTime;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(String subscribeTime) {
        this.subscribeTime = subscribeTime;
    }
    
    
    
}
