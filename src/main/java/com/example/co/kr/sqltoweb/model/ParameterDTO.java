package com.example.co.kr.sqltoweb.model;

import lombok.Data;
import org.springframework.lang.Nullable;


public class ParameterDTO {

    private String area;
    private String GGR;
    private String v_10;
    private String v_20;
    private String v_30;
    private String v_40;
    private String v_50;
    private String v_60;
    private String v_70;
    private String v_80;
    private String v_90;
    private String arg_dir;

    private String RN;

    public String getArea() {
        return area;
    }
    @Nullable
    public void setArea(String area) {
        if("".equals(area)){
            area = null;
        }
        this.area = area;
    }

    public String getGGR() {
        return GGR;
    }
    @Nullable
    public void setGGR(String GGR) {
        if("".equals(GGR)){
            GGR=null;
        }
        this.GGR = GGR;
    }

    public String getV_10() {
        return v_10;
    }

    public void setV_10(String v_10) {
        this.v_10 = v_10;
    }

    public String getV_20() {
        return v_20;
    }

    public void setV_20(String v_20) {
        this.v_20 = v_20;
    }

    public String getV_30() {
        return v_30;
    }

    public void setV_30(String v_30) {
        this.v_30 = v_30;
    }

    public String getV_40() {
        return v_40;
    }

    public void setV_40(String v_40) {
        this.v_40 = v_40;
    }

    public String getV_50() {
        return v_50;
    }

    public void setV_50(String v_50) {
        this.v_50 = v_50;
    }

    public String getV_60() {
        return v_60;
    }

    public void setV_60(String v_60) {
        this.v_60 = v_60;
    }

    public String getV_70() {
        return v_70;
    }

    public void setV_70(String v_70) {
        this.v_70 = v_70;
    }

    public String getV_80() {
        return v_80;
    }

    public void setV_80(String v_80) {
        this.v_80 = v_80;
    }

    public String getV_90() {
        return v_90;
    }

    public void setV_90(String v_90) {
        this.v_90 = v_90;
    }

    public String getArg_dir() {
        return arg_dir;
    }
    @Nullable
    public void setArg_dir(String arg_dir) {

        if("".equals(arg_dir)){
            arg_dir=null;
        }
        this.arg_dir = arg_dir;
    }

    public String getRN() {
        return RN;
    }

    @Nullable
    public void setRN( String RN) {
        this.RN = RN;
    }
}
