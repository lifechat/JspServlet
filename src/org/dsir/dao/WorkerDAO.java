package org.dsir.dao;

import org.dsir.pojo.WorkerPOJO;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author xiaqi
 * 职工接口
 *
 * */
public interface WorkerDAO {
    public List<WorkerPOJO> findAll(String workerName,int isDelete,int pageSize,int pageCurrent);

    public WorkerPOJO findByWorkerId(BigDecimal workerId);

    public boolean doUpd(WorkerPOJO pojo);

    public boolean doIns(WorkerPOJO pojo);

    public boolean doDel(BigDecimal workerId);

    public int findCountByNameState(String workerName,int isDelete);
}
