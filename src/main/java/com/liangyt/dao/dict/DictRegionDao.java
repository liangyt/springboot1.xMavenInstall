package com.liangyt.dao.dict;



import com.liangyt.entity.dict.DictRegion;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <dl> 专区列表
 * <dd>Description: </dd>
 * <dd>Company: 大城若谷信息技术有限公司</dd>
 * <dd>@date：2018/3/14 21:35</dd>
 * <dd>@author：shawn</dd>
 * </dl>
 */
@Mapper
public interface DictRegionDao {
    /**
     * 返回所有的状态为可用的专区
     * @return
     */
    List<DictRegion> findAllWithOpen();
}