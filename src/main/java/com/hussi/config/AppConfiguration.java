package com.hussi.config;

import com.hussi.domain.businessRules.*;
import com.hussi.domain.pojo.DecoderPojo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfiguration {

    @Bean
    public MandatoryBusinessRule mandatoryRule1() {
        return new MandatoryBusinessRule() {
            @Override
            public void apply(DecoderPojo pojo) {
                System.out.println("Mandatory Rule 1 executed");
            }
        };
    }

    @Bean
    public MandatoryBusinessRule mandatoryRule2() {
        return new MandatoryBusinessRule() {
            @Override
            public void apply(DecoderPojo pojo) {
                System.out.println("Mandatory Rule 2 executed");
            }
        };
    }

    @Bean
    public OptionalBusinessRule optionalRule1() {
        return new OptionalBusinessRule() {
            @Override
            public void apply(DecoderPojo pojo) {
                System.out.println("Optional Rule 1 executed");
            }

            @Override
            public boolean shouldApply(DecoderPojo pojo) {
                System.out.println("Optional Rule 1 check executed");
                return true;
            }
        };
    }

    @Bean
    public OptionalBusinessRule optionalRule2() {
        return new OptionalBusinessRule() {
            @Override
            public void apply(DecoderPojo pojo) {
                System.out.println("Optional Rule 2 executed");
            }

            @Override
            public boolean shouldApply(DecoderPojo pojo) {
                System.out.println("Optional Rule 2 check executed");
                return true;
            }
        };
    }

    @Bean
    public OptionalBusinessRule optionalRule3() {
        return new OptionalBusinessRule() {
            @Override
            public void apply(DecoderPojo pojo) {
                System.out.println("Optional Rule 3 executed");
            }

            @Override
            public boolean shouldApply(DecoderPojo pojo) {
                System.out.println("Optional Rule 3 check executed");
                return false;
            }
        };
    }
}
