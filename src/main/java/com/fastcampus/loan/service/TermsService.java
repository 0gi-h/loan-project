package com.fastcampus.loan.service;

import com.fastcampus.loan.dto.TermsDTO;

import java.util.List;

public interface TermsService {
    TermsDTO.Response create(TermsDTO.Request request);

    List<TermsDTO.Response> getAll();
}
