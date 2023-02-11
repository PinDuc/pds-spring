#api 패키지 만들기

#### api를 작성하기 위해 각 패키지를 만들어 패키지에 맞게 작동하도록 그리고 테스트 코드도 추가하여 작업할 수 있게 구조를 만드려고 한다.

![img.png](img.png "이미지 설명(title)")

#### 우선 내가 지금 당장 필요하다고 생각되는 패키지들을 정의해놨다. 각각 패키지는
> controller api 호출시 client의 요청과 parameter를 받아오는 곳
>> service 실제 서비스 로직이 실행되어지는 곳
>>> repository 서비스 로직 중 db와 작업이 필요한 곳에서 db의 데이터를 가져오거나 넣어주는 곳
>>>> domain db테이블에 컬럼을 정의하거나 내가 사용할 모델을 사용하는 곳
>>>> exception exception을 정의하는 곳
>>>>> advice exception처리를 하기 위한 곳

# 공통 처리 만들기

api를 사용하면서 공통적으로 response하는 형태나 공토으로 반환되는 exception을 처리해야할 경우가 있다.
또한 이 공통 response 나 exeception를 상속받아 다른 response 나 exception을 추가하면 되므로 기본
뼈대가 되는 공통 처리가 모델들이다.

# 공통  response

<pre>
<code>
@Getter
@Builder
@AllArgsConstructor
public class CommonV1(T) { //
    private String result;  //success, fail 구분
    private String code;    //api 고유 상태코드
    private String msg;     //반환 메세지
    private T data;         //반환 데이터

}
</code></pre>


* 먼저 공통 response를 만들었다. response할 데이터를 정의하였는데 
* result   api 통신이 성공했는지 실패했는지 결과 값
* code api 고유 상태코드  
* msg 필요하다면 메세지 전달
* data 반환되는 데이터
* 로 정의 하였고 lombok 어노테이션의 경우



* @Getter 변수들의 
* getter생성  
* @Builder 빌더 패턴 생성 
* @AllArgsConstructor 모든 변수들을 포함한 생성자 생성이다.

