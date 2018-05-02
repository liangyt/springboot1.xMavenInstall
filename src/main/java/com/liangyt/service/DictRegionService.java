package com.liangyt.service;

import com.liangyt.dao.dict.DictRegionDao;
import com.liangyt.entity.dict.DictRegion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：
 * 创建时间 2018-04-27 09:52
 * 作者 liangyongtong
 */
@Service
public class DictRegionService {
    @Autowired
    private DictRegionDao dictRegionDao;

    public List<DictRegion> allWithOpen() {
        return dictRegionDao.findAllWithOpen();
    }
}
