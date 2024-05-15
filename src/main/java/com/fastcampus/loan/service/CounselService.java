package com.fastcampus.loan.service;

import com.fastcampus.loan.dto.CounselDTO.Response;
import com.fastcampus.loan.dto.CounselDTO.Request;


public interface CounselService {

    //상담에 대한 등록기능을 담당할 create 메소드가 제공될 예정
    Response create(Request request);

    //상담 조회 기능
    Response get(Long couselId);

    Response update(Long counselId, Request request);

    void delete(Long counselId);
}
