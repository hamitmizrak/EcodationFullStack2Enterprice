package com.hamitmizrak.jsf.producesinject;


import lombok.*;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;


@Named("produces")
@ApplicationScoped

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProducesInject {

    @Produces
    public String getUreten( @New ProductDto productDto){
        productDto=ProductDto.builder().productName("ürün adı").build();
        return productDto.getProductName();
    }

    @Inject
    @Getter
    String getTuketen;

}
