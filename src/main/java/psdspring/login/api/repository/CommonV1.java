package psdspring.login.api.repository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class CommonV1<T> {
    private String result;  //success, fail 구분
    private String code;    //api 고유 상태코드
    private String msg;     //반환 메세지
    private T data;         //반환 데이터

}