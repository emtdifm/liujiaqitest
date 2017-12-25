package com.service.service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.pojo.RpcSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CsePojoDemoCodegen", date = "2017-12-25T07:07:20.821Z")

@RpcSchema(schemaId = "service")
public class ServiceImpl implements Service{

    @Autowired
    private ServiceDelegate serviceDelegate;


    public String helloworld(String name) {

        return serviceDelegate.helloworld(name);
    }

}
