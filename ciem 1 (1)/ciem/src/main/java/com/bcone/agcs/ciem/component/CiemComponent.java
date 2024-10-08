package com.bcone.agcs.ciem.component;

import com.bcone.agcs.ciem.component.targetSpecific.aws.AWSComponent;
import com.bcone.agcs.ciem.component.targetSpecific.azure.AzureComponent;
import com.bcone.agcs.ciem.model.CiemModel;
import com.bcone.agcs.ciem.utils.FetchTypeEnum;
import com.bcone.agcs.ciem.utils.TargetEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CiemComponent {
    @Autowired
    private AWSComponent awsComponent;
    @Autowired
    private AzureComponent azureComponent;

    public CiemModel getDataByUserName(TargetEnum targetName, FetchTypeEnum fetchType, String userName) {
        switch (targetName) {
            case AWS -> {
                return awsComponent.provideDataByUserName(userName, fetchType);
            }
            case AZURE -> {
                return azureComponent.provideDataByUserName(userName, fetchType);
            }
            default -> {
                return null;
            }
        }
    }

}
