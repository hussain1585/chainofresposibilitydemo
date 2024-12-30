package com.hussi.infrastructure;

import com.hussi.application.BusinessRule;
import com.hussi.domain.DecodedPan;
import com.hussi.domain.rulesImpl.MandatoryRule1;
import com.hussi.domain.rulesImpl.MandatoryRule2;
import com.hussi.domain.rulesImpl.OptionalRule1;
import com.hussi.domain.rulesImpl.OptionalRule2;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

@Configuration
public class AppConfig {
    @Bean(name = "optional1")
    public Predicate<DecodedPan> getOptional1Predicate() {
        System.out.println("predicate to check if the input string length is equal to eight");
        return decodedPan -> decodedPan.getPan().length() == 8;
    }
}
