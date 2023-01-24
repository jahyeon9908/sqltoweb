package com.example.co.kr.sqltoweb.service;

import com.example.co.kr.sqltoweb.dao.DblinkDao;
import com.example.co.kr.sqltoweb.model.ParameterDTO;
import com.example.co.kr.sqltoweb.model.ResultDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DblinkService {
    @Autowired
    DblinkDao dblinkDao;

    public List<ResultDTO> dblinksv(ParameterDTO parameterDTO){
        return dblinkDao.DblinkMapper(parameterDTO);
    }
}
