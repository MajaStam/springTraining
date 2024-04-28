package com.cydeo.config;

import com.cydeo.casefactory.Case;
import com.cydeo.casefactory.DellCase;
import com.cydeo.casefactory.Dimension;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PcConfig {

    @Bean
    public Dimension dimension(){
        return new Dimension(50,10,10);
    }


    @Bean
    public Case caseDell(Dimension dimension){
        return new DellCase("220B","Dell","240",dimension);
    }
}
