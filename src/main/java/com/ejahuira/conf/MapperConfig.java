package com.ejahuira.conf;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean("tuitionMapper")
    public ModelMapper tuitionMapper(){
        return new ModelMapper();
    }
    
    @Bean("studentMapper")
    public ModelMapper studentMapper(){
        return new ModelMapper();
    }
    
    @Bean("courseMapper")
    public ModelMapper courseMapper(){
        return new ModelMapper();
    }
    

   /* @Bean("productMapper")
    public ModelMapper modelMapper(){
        ModelMapper mapper = new ModelMapper();
        TypeMap<ProductDTO, Product> typeMap = mapper.createTypeMap(ProductDTO.class, Product.class);
        //typeMap.addMapping(ProductDTO::getIdCategoria, (dest, v) -> dest.getCategory().setIdCategory((Integer) v));
        //typeMap.addMapping(ProductDTO::getIdCategory, (dest, v) -> dest.getCategory().setIdCategory((Integer) v));
        return mapper;
    }*/


   


}
