# pds-spring
pds 플젝
# 회원 관리 예제 - 백엔드 개발

* 비지니스 요구사항 정리
* 회원 도메인과 리포지토리 만들기
* 회원 리포지토리 테스트 케이스 작성
* 회원 서비스 개발
* 회원 서비스 테스트

### 비지니스 요구사항 정리
* 데이터ID : 회원 ID , 이름 , 나이 
* 기능    :  회원등록 , 조회 , 수정 , 삭제 
* 아직 데이터 저장소가 선정되지 않음(가상의 시나리오)

# 일방적인 웹 애플리케이션 계층 구조 

 ![](/Users/pyeonghwajeong/Downloads/image.png)
 
* 컨트롤러: 웹 MVC의 컨트롤러 역할 
* 서비스: 핵심 비즈니스 로직 구현
* 리포지토리: 데이터베이스에 접근, 도메인 객체를 DB에 저장하고 관리
* 도메인: 비즈니스 도메인 객체, 예) 회원 , 주문, 쿠폰 등등 주로 데이터베이스에 저장하고 관리됨

## 클래스 의존 관계 설정
![](/Users/pyeonghwajeong/Downloads/_2021-01-24__7.36.46.png)

* 아직 DB가 정해지지 않았으므로 우선 이너터페이스로 구현 클래스를 변경할 수 있도록 설계한다.
* DB는 RDB , NoSQL 등 다양한 저장소를 고민중인 상황으로 가정한다.
* 개발을 진행하기 위해 초기 개발 단ㄱ뎨에서는 가벼운 메모리 기반의 데이터 저장소를 사용한다.

<pre>
<code>
public class BootSpringBootApplication {
  public static void main(String[] args) {
    System.out.println("Hello, Honeymon");
  }

}
</code>
</pre>