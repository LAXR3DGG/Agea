package com.agea.app.domain.dtos;

import com.agea.app.domain.dtos.validations.ValidClassroom;
import com.agea.app.domain.dtos.validations.ValidDeviceId;
import com.agea.app.domain.dtos.validations.ValidUserId;

public class BorrowRequestDTO {
    @ValidUserId
    private String userId;
    @ValidDeviceId
    private Long deviceId;
    @ValidClassroom
    private String classroom;
}
