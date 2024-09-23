package com.bcone.agcs.ciem.service;

import com.bcone.agcs.ciem.model.CiemModel;
import com.bcone.agcs.ciem.utils.FetchTypeEnum;
import com.bcone.agcs.ciem.utils.TargetEnum;

public interface CiemService {
    CiemModel getDataByUserName(TargetEnum targetName, FetchTypeEnum fetchType, String userName);
}
