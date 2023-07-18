package com.ktds.duhyeon.controller;

import com.ktds.duhyeon.dto.request.NameRequest;
import com.ktds.duhyeon.dto.response.NameResponse;
import com.ktds.duhyeon.service.MainService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/main")
@RestController
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;

    @PostMapping("/hello")
    public ResponseEntity<?> getName(@RequestBody NameRequest nameRequest) {
        try {
            String memberNm = mainService.getName(nameRequest.getMemberId());
            NameResponse nameResponse = new NameResponse();
            nameResponse.setMemberNm(memberNm);
            return new ResponseEntity<>(nameResponse, HttpStatus.OK);
//            return new ResponseEntity<>(new NameResponse(memberNm), HttpStatus.OK);
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("에러");
            return new ResponseEntity<>("Failed getting member name.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
