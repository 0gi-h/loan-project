package com.fastcampus.loan.service;

import com.fastcampus.loan.dto.ApplicationDTO;
import com.fastcampus.loan.dto.JudgmentDTO;

public interface JudgmentService {

    JudgmentDTO.Response create(JudgmentDTO.Request request);

    //심사ID를 통한 조회
    JudgmentDTO.Response get(Long judgmentId);

    //신청ID를 통한 조회
    JudgmentDTO.Response getJudgmentOfApplication(Long applicationId);

    JudgmentDTO.Response update(Long judgmentId, JudgmentDTO.Request request);

    void delete(Long judgmentId);

    ApplicationDTO.GrantAmount grant(Long judgmentId);
}
