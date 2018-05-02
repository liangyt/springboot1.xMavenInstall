package com.liangyt.controller;

import com.liangyt.service.DictRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述：
 * 创建时间 2018-04-27 09:53
 * 作者 liangyongtong
 */
@RestController
@RequestMapping(value = "/api")
public class DictRegionController {
    @Autowired
    private DictRegionService service;

    @GetMapping
    public Object allWithOpen() {
        return service.allWithOpen();
    }
}
