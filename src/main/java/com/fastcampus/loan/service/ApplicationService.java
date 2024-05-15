package com.fastcampus.loan.service;

import com.fastcampus.loan.dto.ApplicationDTO;

public interface ApplicationService {

    ApplicationDTO.Response create(ApplicationDTO.Request request);

    ApplicationDTO.Response get(Long applicationId);

    ApplicationDTO.Response update(Long applicationId, ApplicationDTO.Request request);

    void delete(Long applicationId);

    Boolean acceptTerms(Long applicationId, ApplicationDTO.AcceptTerms request);
}
