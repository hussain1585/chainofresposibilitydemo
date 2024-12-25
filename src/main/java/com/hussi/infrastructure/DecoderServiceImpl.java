package com.hussi.infrastructure;

import com.hussi.domain.DecoderService;
import org.springframework.stereotype.Service;

@Service
public class DecoderServiceImpl implements DecoderService {
    @Override
    public String decode(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}