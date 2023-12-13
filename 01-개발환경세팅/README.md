# 개발환경 세팅
# 1. IntelliJ 설치
- New Project

![image](https://github.com/YUNA-AHN/SpringBoot-Board/assets/106044849/a4c52536-1901-4b44-88f6-e7709d9feec7)

- SRC파일에 Java Class 추가하여 실행
- 실행은 초록버튼

![image](https://github.com/YUNA-AHN/SpringBoot-Board/assets/106044849/364cfb38-1c51-4a35-bf64-e19e5506cbd1)

# 2. MariaDB 설치
- 환경 변수 설정해주어야 함
- 내 PC > 속성 > 고급 시스템 설정 > 환경 변수
  - path에 mariadb bin 파일 경로 추가하여 편집

![image](https://github.com/YUNA-AHN/SpringBoot-Board/assets/106044849/1c0b611f-7312-47a4-85cf-2b47efe5d729)

- 설치 후 CMD 창으로 확인

- 버전 확인
```bash
mysql -V
```

- 실행 결과
```
mysql from 11.2.2-MariaDB, client 15.2 for Win64 (AMD64), source revision 929532a9426d085111c24c63de9c23cc54382259
```

- DB에 접근
- 비밀번호 입력해주면 접근 가능
```bash
mysql -u root -p
```

# MySql Workbench 설치
- MySql GUI 툴 중 하나
- connection 생성
![image](https://github.com/YUNA-AHN/SpringBoot-Board/assets/106044849/fa0e673e-c56a-46a0-87a3-ead7e0e9c69f)

- Store in Vault... 선택
![image](https://github.com/YUNA-AHN/SpringBoot-Board/assets/106044849/ddba082f-7a22-4040-96cb-f48e136663a2)

- 비밀번호 미리 입력해줌
![image](https://github.com/YUNA-AHN/SpringBoot-Board/assets/106044849/75dff854-8cce-4c11-bdfd-56d1707c2317)

- DB 모양을 클릭해 새로운 DB 생성 : borad로 이름 지정해준 후 apply 해서 생성해줌
![image](https://github.com/YUNA-AHN/SpringBoot-Board/assets/106044849/766c8390-909d-472d-afd2-d45bd70abecf)

- 생성된 DB 확인 가능 !!
![image](https://github.com/YUNA-AHN/SpringBoot-Board/assets/106044849/e476d0b0-89c6-4c4b-bffe-f3dccbde8ef5)
