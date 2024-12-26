package com.hussi.infrastructure;

import com.hussi.application.BusinessRule;
import com.hussi.domain.rulesImpl.MandatoryRule1;
import com.hussi.domain.rulesImpl.MandatoryRule2;
import com.hussi.domain.rulesImpl.OptionalRule1;
import com.hussi.domain.rulesImpl.OptionalRule2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedList;
import java.util.List;

@Configuration
public class AppConfig {

//    @Bean
//    public List<BusinessRule> getRules() {
//        LinkedList<BusinessRule> businessRules = new LinkedList<>();
//        MandatoryRule1 m1 = new MandatoryRule1();
//        MandatoryRule2 m2 = new MandatoryRule2();
//        OptionalRule1 o1 = new OptionalRule1();
//        OptionalRule2 o2 = new OptionalRule2();
//        businessRules.add(m1);
//        businessRules.add(m2);
//        businessRules.add(o1);
//        businessRules.add(o2);
//        businessRules.add(o2);
//        return businessRules;
//    }
}
