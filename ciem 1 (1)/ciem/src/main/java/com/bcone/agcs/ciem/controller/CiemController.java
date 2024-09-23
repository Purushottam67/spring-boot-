package com.bcone.agcs.ciem.controller;

import com.bcone.agcs.ciem.model.CiemModel;
import com.bcone.agcs.ciem.service.CiemService;
import com.bcone.agcs.ciem.utils.FetchTypeEnum;
import com.bcone.agcs.ciem.utils.TargetEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/ciem")
public class CiemController {
    @Autowired
    private CiemService ciemService;

    @GetMapping("/{targetName}/{fetchType}/{userName}")
    public CiemModel getDataByUserName(@PathVariable TargetEnum targetName, @PathVariable FetchTypeEnum fetchType, @PathVariable String userName) {
        log.info("Fetching data for user: {}, {}, {}", targetName, fetchType, userName);
        return ciemService.getDataByUserName(targetName, fetchType, userName);
    }
}
