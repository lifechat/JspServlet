package org.dsir.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class CustomerPOJO implements Serializable {
    private BigDecimal customerId;//客户id
    private String customerName;//客户名称�
    private int customerSex;//性别
    private String customerTel;//客户电话
    private String customerAdress;//客户地址
    private int customerAge;//公司年限
    private String cacount;//公司人数组成
    private String company;//公司
    private int isDelete;
    private int roleMark;//角色标志
    public BigDecimal getCustomerId() {
        return customerId;
    }
    public void setCustomerId(BigDecimal customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public int getCustomerSex() {
        return customerSex;
    }
    public void setCustomerSex(int customerSex) {
        this.customerSex = customerSex;
    }
    public String getCustomerTel() {
        return customerTel;
    }
    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }
    public String getCustomerAdress() {
        return customerAdress;
    }
    public void setCustomerAdress(String customerAdress) {
        this.customerAdress = customerAdress;
    }
    public int getCustomerAge() {
        return customerAge;
    }
    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }
    public String getCacount() {
        return cacount;
    }
    public void setCacount(String cacount) {
        this.cacount = cacount;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public int getIsDelete() {
        return isDelete;
    }
    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }
    public int getRoleMark() {
        return roleMark;
    }
    public void setRoleMark(int roleMark) {
        this.roleMark = roleMark;
    }

    public CustomerPOJO(BigDecimal customerId, String customerName, int customerSex, String customerTel,
                        String customerAdress, int customerAge, String cacount,
                        String company, int isDelete, int roleMark) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerSex = customerSex;
        this.customerTel = customerTel;
        this.customerAdress = customerAdress;
        this.customerAge = customerAge;
        this.cacount = cacount;
        this.company = company;
        this.isDelete = isDelete;
        this.roleMark = roleMark;
    }
    public CustomerPOJO(String customerName, int customerSex, String customerTel,
                        String customerAdress, int customerAge, String cacount,
                        String company, int isDelete, int roleMark) {
        this.customerName = customerName;
        this.customerSex = customerSex;
        this.customerTel = customerTel;
        this.customerAdress = customerAdress;
        this.customerAge = customerAge;
        this.cacount = cacount;
        this.company = company;
        this.isDelete = isDelete;
        this.roleMark = roleMark;
    }
    public CustomerPOJO() {
        super();
        // TODO Auto-generated constructor stub
    }
    public CustomerPOJO(String customerName, int customerSex, String customerTel,
                        String customerAdress, int customerAge, String cacount,
                        String company) {
        this.customerName = customerName;
        this.customerSex = customerSex;
        this.customerTel = customerTel;
        this.customerAdress = customerAdress;
        this.customerAge = customerAge;
        this.cacount = cacount;
        this.company = company;
    }

    @Override
    public String toString() {
        return "CustomerPOJO [customerId=" + customerId + ", customerName="
                + customerName + ", customerSex="
                + customerSex + ", customerTel=" + customerTel
                + ", customerAdress=" + customerAdress + ", customerAge="
                + customerAge + ", cacount=" + cacount + ", company=" + company
                + ", isDelete=" + isDelete + ", roleMark=" + roleMark + "]";
    }
    public CustomerPOJO(BigDecimal customerId, String customerName,
                        int customerSex, String customerTel, String customerAdress,
                        int customerAge, String company) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerSex = customerSex;
        this.customerTel = customerTel;
        this.customerAdress = customerAdress;
        this.customerAge = customerAge;
        this.company = company;
    }

}
