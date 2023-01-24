package com.example.co.kr.sqltoweb.dao;

import com.example.co.kr.sqltoweb.model.ParameterDTO;
import com.example.co.kr.sqltoweb.model.ResultDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Mapper
public interface DblinkDao {

    public List<ResultDTO> DblinkMapper (@Validated ParameterDTO parameterDTO);
}
