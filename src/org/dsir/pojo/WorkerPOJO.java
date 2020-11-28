package org.dsir.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class WorkerPOJO implements Serializable {
    private BigDecimal workerId;// ְ��ID
    private String workerName;// ְ����
    private int workerSex;// �Ա�
    private String workerTel;// �绰
    private String workerAdress;// ��ַ
    private String wAccount;// �˺�
    private int isDelete;

    public BigDecimal getWorkerId() {
        return workerId;
    }

    public void setWorkerId(BigDecimal workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public int getWorkerSex() {
        return workerSex;
    }

    public void setWorkerSex(int workerSex) {
        this.workerSex = workerSex;
    }

    public String getWorkerTel() {
        return workerTel;
    }

    public void setWorkerTel(String workerTel) {
        this.workerTel = workerTel;
    }

    public String getWorkerAdress() {
        return workerAdress;
    }

    public void setWorkerAdress(String workerAdress) {
        this.workerAdress = workerAdress;
    }

    public String getwAccount() {
        return wAccount;
    }

    public void setwAccount(String wAccount) {
        this.wAccount = wAccount;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public WorkerPOJO(BigDecimal workerId) {
        super();
        this.workerId = workerId;
    }

    public WorkerPOJO() {
        super();
    }

    public WorkerPOJO(String workerName, int workerSex, String workerTel, String workerAdress, String wAccount, int isDelete) {
        super();
        this.workerName = workerName;
        this.workerSex = workerSex;
        this.workerTel = workerTel;
        this.workerAdress = workerAdress;
        this.wAccount = wAccount;
        this.isDelete = isDelete;
    }

    public WorkerPOJO(BigDecimal workerId, String workerName, int workerSex, String workerTel, String workerAdress) {
        super();
        this.workerId = workerId;
        this.workerName = workerName;
        this.workerSex = workerSex;
        this.workerTel = workerTel;
        this.workerAdress = workerAdress;
    }
}
