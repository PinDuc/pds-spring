package psdspring.login.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import psdspring.login.api.repository.CommonV1;

@RestController
public class TestController {
    @GetMapping("/v1/test")
    public ResponseEntity test(){

        CommonV1.CommonV1Builder<Object> builder = CommonV1.builder();
        builder.result("success");
        builder.code("200");
        builder.data(null);
        builder.msg("성공");

        CommonV1 result = builder.build();
        return new ResponseEntity(result, HttpStatus.OK);
    }
}