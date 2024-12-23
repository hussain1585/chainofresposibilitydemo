package com.hussi.domain.pojo;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Builder
public class DecoderPojo {
    private int id;
    private String name;
    private String email;
}
