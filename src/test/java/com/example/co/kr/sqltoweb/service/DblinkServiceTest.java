package com.example.co.kr.sqltoweb.service;

import com.example.co.kr.sqltoweb.model.ParameterDTO;
import com.example.co.kr.sqltoweb.model.ResultDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DblinkServiceTest {

    @Autowired
    DblinkService dblinkService;

    @Test
    public void dblinkservicetest(){
        ParameterDTO parameterDTO = new ParameterDTO();
        parameterDTO.setV_10("9");
        parameterDTO.setV_20("8");
        parameterDTO.setV_30("7");
        parameterDTO.setV_40("6");
        parameterDTO.setV_50("5");
        parameterDTO.setV_60("4");
        parameterDTO.setV_70("3");
        parameterDTO.setV_80("2");
        parameterDTO.setV_90("1");

        List<ResultDTO> resultDTO = dblinkService.dblinkDao.DblinkMapper(parameterDTO);
    }
}