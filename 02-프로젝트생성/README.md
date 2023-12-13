# 프로젝트 생성
## 인텔리제이에서 스프링 부트 프로젝트 생성
### 스프링 부트 프로젝트 생성해주는 페이지 : https://start.spring.io/
- 기본 세팅
![image](https://github.com/YUNA-AHN/SpringBoot-Board/assets/130244216/22d99db8-1505-438b-8818-f79ba1b31930)

- ADD Dependencies
![image](https://github.com/YUNA-AHN/SpringBoot-Board/assets/130244216/9cf2d56f-553f-4232-996a-fdb128a9b59f)

### In IntelliJ
- Generate 하여 zip 다운로드
- 압축 풀어 원하는 폴더로 이동 후 인텔리제이에서 open

![image](https://github.com/YUNA-AHN/SpringBoot-Board/assets/130244216/de1c330f-a454-4b9d-9603-55fcaab6f314)

- src > main > java > com.study.board (start.io에서 생성해준 패키지) > BoardApplication(클래스)
- 실행 시 에러 발생
  - settings에서 gradle 검색 후 인텔리제이에서 실행으로 변경
  - ![image](https://github.com/YUNA-AHN/SpringBoot-Board/assets/130244216/e2578f29-a3dc-43d3-b82c-95e2235aa50e)
 
- DB와의 연결 오류
  - JPA를 사용하기 위해서는 DB와 연결이 되어 있어야 한다 !
  - ![image](https://github.com/YUNA-AHN/SpringBoot-Board/assets/130244216/effaa2fc-983f-4e8d-9c6e-6a8b6cb9c7dd)
  - resources > application.properties 에서 DB 관련 설정
  - driver와 생성해줬던 board 데이터베이스 url, 계정명과 비밀번호 작성
  - ![image](https://github.com/YUNA-AHN/SpringBoot-Board/assets/130244216/b7513911-5c62-4cb9-a836-c8b636a653c5)


### 로컬환경 실행 : http://localhost:8080/

![image](https://github.com/YUNA-AHN/SpringBoot-Board/assets/130244216/a20181d1-c663-478b-b828-6ed5e7870090)

- 페이지에 Hello World 출력하기
- com.study.board 하에 controller 패키지 생성, BoardController 클래스 생성
- 아래 코드 작성 후 BoardApplication 재실행

```java
package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 해당 클래스가 Controller인지 열려준다,
@Controller
public class BoardController {
    // 주소에 역슬래시를 붙이면 실행하도록 함(자동으로 붙음)
    @GetMapping("/")
    // 응답 본문
    @ResponseBody
    public String main() {
        return "Hello World";
    }
}
```

- 실행결과

![image](https://github.com/YUNA-AHN/SpringBoot-Board/assets/130244216/75593c9e-edb9-4bc7-9821-9711e66b6370)


+) Annotation
- 코드 사이에 주석처럼 쓰이며 **특별한 의미, 기능을 수행하도록 하는 기술**
- 프로그램에게 추가적인 정보를 제공해주는 메타데이터
