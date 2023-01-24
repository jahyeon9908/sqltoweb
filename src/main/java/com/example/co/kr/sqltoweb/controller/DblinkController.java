package com.example.co.kr.sqltoweb.controller;

import com.example.co.kr.sqltoweb.model.ParameterDTO;
import com.example.co.kr.sqltoweb.model.ResultDTO;
import com.example.co.kr.sqltoweb.service.DblinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.beans.JavaBean;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DblinkController {

    @Autowired
    DblinkService dblinkService;

    //jsp 연결
    @PostMapping("/sqltowebjsp")
    public ModelAndView sqltowebjsptest(ModelAndView mv, @ModelAttribute ParameterDTO parameterDTO){

        List<ResultDTO> list =  dblinkService.dblinksv(parameterDTO);

        ResultDTO resultDTO = new ResultDTO();
        System.out.println(resultDTO.toString());

        mv.setViewName("result");
        mv.addObject("names", list);
        //mv.addAttribute("names", list);
        return mv;
    }


    //1. form에서 값을 입력해서 그 값으로 파라미터변수를 채우는 경우
    @PostMapping("/sqltoweb")
    public List<ResultDTO> dblinkcr(@ModelAttribute ParameterDTO parameterDTO){

        return dblinkService.dblinksv(parameterDTO);
    }
   /* @PostMapping("/sqltoweb" )
    public List<ResultDTO> dblinkcr(@RequestParam ParameterDTO parameterDTO){

        return dblinkService.dblinksv(parameterDTO);
    }
*/
    //2. 여기서 값을 미리 넣고 폼에서는 값 안 넣고 버튼을 눌러서 해당 페이지로 가게 하는 방법
    //폼은 꼭 거쳐야 돼 왜냐하면 우리가 주소를 쳐서 들어가는 건 전부 get 방식이라서
    //폼 주소로 간 다음 폼이 그 주소로 넘어갈 수 있게 해주는 역할
    @PostMapping("/aa")
    public List<ResultDTO> dblinkcr2(@ModelAttribute ParameterDTO parameterDTO){

        parameterDTO.setV_10("1");
        parameterDTO.setV_20("2");
        parameterDTO.setV_30("3");
        parameterDTO.setV_40("4");
        parameterDTO.setV_50("5");
        parameterDTO.setV_60("6");
        parameterDTO.setV_70("7");
        parameterDTO.setV_80("8");
        parameterDTO.setV_90("9");
        return dblinkService.dblinksv(parameterDTO);
    }

    //3. get방식
    @GetMapping("/get/{v_10}/{v_20}/{v_30}/{v_40}/{v_50}/{v_60}/{v_70}/{v_80}/{v_90}")
    public List<ResultDTO> dblinkcr3(@PathVariable String v_10,@PathVariable String v_20,@PathVariable String v_30,@PathVariable String v_40,@PathVariable String v_50,@PathVariable String v_60,@PathVariable String v_70,@PathVariable String v_80,@PathVariable String v_90){

        ParameterDTO parameterDTO = new ParameterDTO();
        parameterDTO.setV_10(v_10);
        parameterDTO.setV_20(v_20);
        parameterDTO.setV_30(v_30);
        parameterDTO.setV_40(v_40);
        parameterDTO.setV_50(v_50);
        parameterDTO.setV_60(v_60);
        parameterDTO.setV_70(v_70);
        parameterDTO.setV_80(v_80);
        parameterDTO.setV_90(v_90);

        return dblinkService.dblinksv(parameterDTO);
    }

    //4.get에서 @ModelAttribute


}
