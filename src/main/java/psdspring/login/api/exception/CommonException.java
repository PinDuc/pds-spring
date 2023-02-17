package psdspring.login.api.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public class CommonException extends RuntimeException
{

    //Exception은 msg와 status를 전달하기위해 getter를 추가하여 작성했다.
    private String msg;
    private HttpStatus status;
}
