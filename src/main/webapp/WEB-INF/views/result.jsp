<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    </head>
    <body>
        <table border=1>
            <tr>
                <td>시작지</td>
                <td>도착지</td>
                <td>안마기</td>
                <td>냉장고</td>
                <td>TV</td>
                <td>세탁기</td>
                <td>김치냉장고</td>
                <td>오디오</td>
                <td>청소기</td>
                <td>전자렌지</td>
                <td>가스렌지</td>
                <td>스팀다리미</td>
                <td>TOT</td>
            </tr>
            <c:forEach items="${names}" var="list">
             <tr>
                      <td> ${list.NM} </td>
                      <td> ${list.REGION_AREA} </td>
                      <td> ${list.p0} </td>
                      <td> ${list.p1} </td>
                      <td> ${list.p2} </td>
                      <td> ${list.p3} </td>
                      <td> ${list.p4} </td>
                      <td> ${list.p5} </td>
                      <td> ${list.p6} </td>
                      <td> ${list.p7} </td>
                      <td> ${list.p8} </td>
                      <td> ${list.p9} </td>
                      <td> ${list.TOT} </td>
                  </tr>
              </c:forEach>
    </body>