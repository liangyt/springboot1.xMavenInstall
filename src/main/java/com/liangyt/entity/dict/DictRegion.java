package com.liangyt.entity.dict;




import com.liangyt.entity.IdEntity;

import java.util.Date;

/**
 * <dl>
 * <dd>Description: </dd>
 * <dd>Company: 大城若谷信息技术有限公司</dd>
 * <dd>@date：2018/3/14 21:35</dd>
 * <dd>@author：shawn</dd>
 * </dl>
 */
public class DictRegion extends IdEntity {

    /**
     * 专区编码
     */
    private String regionCode;

    /**
     * 专区名称
     */
    private String regionName;

    /**
     * 专区说明
     */
    private String regionExplain;

    /**
     * 禁用，启用
     */
    private String regionStatus;


    /**
     * 创建日期
     */
    private Date createDate;


    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getRegionExplain() {
        return regionExplain;
    }

    public void setRegionExplain(String regionExplain) {
        this.regionExplain = regionExplain;
    }

    public String getRegionStatus() {
        return regionStatus;
    }

    public void setRegionStatus(String regionStatus) {
        this.regionStatus = regionStatus;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}