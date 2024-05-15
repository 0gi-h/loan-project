package com.fastcampus.loan.dto;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class FileDTO implements Serializable {

    private String name;

    private String url;
}
