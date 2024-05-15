package com.fastcampus.loan.service;

import com.fastcampus.loan.domain.Terms;
import com.fastcampus.loan.dto.TermsDTO;
import com.fastcampus.loan.repository.TermsRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class TermsServiceImpl implements TermsService{

    private final TermsRepository termsRepository;

    private final ModelMapper modelMapper;

    @Override
    public TermsDTO.Response create(TermsDTO.Request request) {

        Terms terms = modelMapper.map(request, Terms.class);
        Terms created = termsRepository.save(terms);

        return modelMapper.map(created, TermsDTO.Response.class);
    }

    @Override
    public List<TermsDTO.Response> getAll() {
        List<Terms> termsList = termsRepository.findAll();

        return termsList.stream().map(t -> modelMapper.map(t, TermsDTO.Response.class)).collect(Collectors.toList());
    }
}
