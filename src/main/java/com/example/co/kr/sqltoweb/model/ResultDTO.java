package com.example.co.kr.sqltoweb.model;

import lombok.Data;

@Data
public class ResultDTO {

    //여기 있는 이름으로 화면에 띄워진다
    //XML에 있는 SELECT문에서 출력될 이름과 같아야 한다
    private String NM;
    private String REGION_AREA;
    private String p0;
    private String p1;
    private String p2;
    private String p3;
    private String p4;
    private String p5;
    private String p6;
    private String p7;
    private String p8;
    private String p9;
    private String	TOT;

}
