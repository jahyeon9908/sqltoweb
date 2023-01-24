package com.example.co.kr.sqltoweb.controller;

import com.example.co.kr.sqltoweb.model.ParameterDTO;
import com.example.co.kr.sqltoweb.model.ResultDTO;
import com.example.co.kr.sqltoweb.service.DblinkService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@ExtendWith(SpringExtension.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
class DblinkControllerTest {

    @Autowired
    DblinkController dblinkController;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void dblinkcrtest() throws Exception {

        this.mockMvc.perform(post("/sqltoweb").param("v_10","9")
                .param("v_20","8").param("v_30","7")
                .param("v_40","6").param("v_50","5")
                .param("v_60","4").param("v_70","3")
                .param("v_80","2").param("v_90","1"));


        /*    ParameterDTO parameterDTO = new ParameterDTO();
        parameterDTO.setV_10("9");
        parameterDTO.setV_20("8");
        parameterDTO.setV_30("7");
        parameterDTO.setV_40("6");
        parameterDTO.setV_50("5");
        parameterDTO.setV_60("4");
        parameterDTO.setV_70("3");
        parameterDTO.setV_80("2");
        parameterDTO.setV_90("1");

        List<ResultDTO> list = dblinkController.dblinkcr(parameterDTO);
*/        }

    @Test
    public void dblinktest2() throws Exception{
        this.mockMvc.perform(post("/aa")).andDo(print());
    }

    /*@Test
    public void dblinktest3() throws Exception{
        this.mockMvc.perform(post("/sqltoweb")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"area\":\"10\"}").content("{\"GGR\":\"R\"}")
                        .content("{\"V_10\":\"1\"}").content("{\"V_20\":\"2\"}")
                        .content("{\"V_30\":\"3\"}").content("{\"V_40\":\"4\"}")
                        .content("{\"V_50\":\"5\"}").content("{\"V_60\":\"6\"}")
                        .content("{\"V_70\":\"7\"}").content("{\"V_80\":\"8\"}")
                        .content("{\"V_90\":\"9\"}").content("{\"arg_dir\":\"f\"}"))
                .andDo(print());*//*
    }*/

    }

