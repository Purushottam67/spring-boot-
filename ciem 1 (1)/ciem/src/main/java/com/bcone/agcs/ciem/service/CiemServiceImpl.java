package com.bcone.agcs.ciem.service;

import com.bcone.agcs.ciem.component.CiemComponent;
import com.bcone.agcs.ciem.model.CiemModel;
import com.bcone.agcs.ciem.utils.FetchTypeEnum;
import com.bcone.agcs.ciem.utils.TargetEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CiemServiceImpl implements CiemService {

    @Autowired
    private CiemComponent ciemComponent;

    public CiemModel getDataByUserName(TargetEnum targetName, FetchTypeEnum fetchType, String userName) {
        return ciemComponent.getDataByUserName(targetName, fetchType, userName);
    }
}
