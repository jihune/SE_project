## 소프트웨어공학 스터디 관리 프로젝트

#### 2022-11-30 소프트웨어공학 과제 최종 제출 이후
#### 배포 유지보수용 포크

#### 소스코드 작업환경은 VScode + Java + Gradle + SpringBoot + Oracle Cloud DB 입니다.
#### jre, jdk 버전은 1.8.0_261 이지만 그 이상의 버전이면 정상적으로 실행됩니다.
#### Oracle Cloud DB를 활용하기 때문에 전자지갑 형태로 연결되어 있습니다.

#### 소스코드를 localhost 환경에서 실행방법 [SpringBoot]
1. SE_project.zip 파일 -> '여기에 풀기' 로 압축해제 (SE_project 폴더가 이중구조가 안되도록)
2. VScode에서 '폴더열기' -> SE_project 폴더 선택
3. VScode 마켓플레이스에서 확장 플러그인 설치
 - extension pack for java
 - gradle for java
 - spring boot extension pack
 - lombok
4. SE_project/src/main/java/com/se/kmbss/SeProjectApplication.java 파일에서 Ctrl+F5 로 실행
5. 브라우저에서 localhost:8080 입력시 테스트 가능 (Oracle Cloud DB 상시연결)
