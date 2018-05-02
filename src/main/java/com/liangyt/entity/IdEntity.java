package com.liangyt.entity;

import com.fasterxml.jackson.annotation.JsonFormat;


import java.io.Serializable;
import java.util.Date;

/**
 * <dl>
 * <dd>Description: </dd>
 * <dd>Company: 大城若谷信息技术有限公司</dd>
 * <dd>@date：2017/3/8 下午5:10</dd>
 * <dd>@author：George</dd>
 * </dl>git
 */
public class IdEntity implements Serializable {

    private static final long serialVersionUID = -2716222356509348153L;
    public static final String ID_FIELD_NAME = "id";

    /**
     * 主键
     */
    protected Long id;


    /**
     * 创建时间
     */
    protected Date createTime;

    /**
     * 最后更新时间
     */
    protected Date updateTime;

    public Long getId() {
        return id;
    }

    public IdEntity setId(Long id) {
        this.id = id;
        return this;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public IdEntity setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }
    public Date getUpdateTime() {
        return updateTime;
    }

    public IdEntity setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
        return this;
    }
}
