# 소프트웨어공학  
### 스터디 관리 웹앱 프로젝트  
  
2022-11-30 소프트웨어공학 과제 최종 제출  
배포 유지보수용 포크  
  
- 소스코드 작업환경은 **VScode + Gradle + SpringBoot** 입니다.  
- **jre, jdk** 버전은 **1.8.0_261** 이지만 그 이상의 버전이면 정상적으로 실행됩니다.  
- **웹서버**는 **GCP (Google Cloud Platform)** 가상 Instance 기반 **Ununtu 20.04** 버전을 사용합니다.  
- **DB**는 **오라클 11g** 버전이며 웹 서버와 통합하여 같은 Instance에서 구동되며 외부 IP로도 접속 가능합니다.  
  
  
배포시 사용한 도메인은 https://www.duckdns.org/domains 에서 생성했습니다.  
GCP 외부 IP가 유동 IP라서 웹 서버에 DuckDNS를 설치해 도메인 연결했습니다.  
GCP는 무료로 사용가능한 트래픽이 제한되어 있기 때문에 도메인은 깃허브에 공개하지 않습니다.  
  
  
오라클 클라우드에서 DB서버와 웹서버를 두고 진행하던 프로젝트였으나, 깃허브를 통해 SSH키가 유출된 후  
트래픽 초과로 프리티어 계정이 정지되어 오라클 클라우드 재가입이 불가하게 되었습니다.  
이후 백업해둔 DB를 기반으로 GCP의 1개 Instance에 웹서버와 DB서버를 통합하여 배포한 뒤 프로젝트를 종료했습니다.  
  
#  
##### 소스코드를 localhost 환경에서 실행방법 [SpringBoot]  
1. SE_project.zip 파일 -> '여기에 풀기' 로 압축해제 (SE_project 폴더가 이중구조가 안되도록)  
2. VScode에서 '폴더열기' -> SE_project 폴더 선택  
3. VScode 마켓플레이스에서 확장 플러그인 설치  
- extension pack for java  
- gradle for java  
- spring boot extension pack  
- lombok  
4. SE_project/src/main/java/com/se/kmbss/SeProjectApplication.java 파일에서 Ctrl+F5 로 실행  
5. 브라우저에서 localhost:8080 입력시 테스트 가능 (오류 발생 시 GCP DB서버 구동 확인)  
  
#  
##### 참고한 자료들  
- [[클라우드] Oracle Cloud, Google Cloud Platform '항상' 무료 VM 비교](https://www.clien.net/service/board/lecture/15394952)  

- [[DB] GCP Ubuntu 인스턴스에서 Oracle 11g 설치](https://co-deok.tistory.com/70)  

- [[배포] SpringBoot 오라클 클라우드 war 배포 1](https://velog.io/@away0419/spring-boot오라클-클라우드-war-배포-1.클라우드-가입-및-인스턴스-생성)  
- [[배포] SpringBoot 오라클 클라우드 war 배포 2](https://uragil-jay.tistory.com/32)  
- [[배포] GCP 방화벽 규칙 생성 (오라클과 톰캣 포트)](https://gusrb.tistory.com/50)  
- [[배포] GCP 방화벽 규칙 '0.0.0.0'과 '0.0.0.0/0' 차이](https://willbesoon.tistory.com/78)  

- [[도메인] GCP 서비스 운영을 위한 무료 도메인 발급받기](https://blog.dalso.org/google-cloud-platform-2/nas-project/8678)  
- [[도메인] 무료 DDNS - 웹서버에 DuckDNS를 설치해보자 (유동 IP 도메인 연결)](https://jimnong.tistory.com/788)  
- [[도메인] Linux에서 Cron 설치하고 사용하는 방법](https://webisfree.com/2020-07-02/linux에서-cron을-사용하는-방법-작업-스케쥴-등록하기)  

- [[VIM] 우분투에 putty 접속, VIM 사용시 마우스 붙여넣기가 안 될 때](https://vlee.kr/1144)  

- [[리드미 작성] Github README.md 작성 방법 및 요령](https://lsh424.tistory.com/37)  

- [[SpringBoot] HttpServletRequest 사용해서 값 받아오기](https://hongku.tistory.com/118)  

- [[깃허브] 깃허브 커밋 삭제](https://0urtrees.tistory.com/44)  
  
#
##### 삽질한 오류들  
1. /tomcat9/conf/server.xml에서 톰캣 포트 80번 포트로 변경  
2. /tomcat9/webapps/ 폴더속에 ROOT.war 파일 올리기 전에 ROOT 폴더 포함 모두 삭제  
3. ROOT.war 업로드 후 >sudo service tomcat9 stop, >sudo service tomcat9 start  
4. localhost 환경에서는 정상인데 배포 환경에서 이미지 깨지거나 링크 이동이 안될 때  
- 이미지 깨짐 -> 파일이름이나 확장자 대소문자 확인. *.PNG -> *.png  
- 링크 이동 안될 때 -> Controller 내부 코드나 html 파일 위치 확인  
5. war 파일 만들기 위해 build.gradle 뿐만 아니라 main.java 일부 코드 수정 필요  
6. Ubuntu 20.04 기준으로 Oracle 버전 11g, 12c 넘어가는 것은 설치 불가  
7. 깃허브 커밋 삭제: Sourcetree에서 원하는 커밋까지 Hard 초기화 -> 터미널에 git push -f origin main
  
#  
##### 부족한 부분 추후 참고할 링크  
- [로그인 처리 - 쿠키, 세션](https://velog.io/@sorzzzzy/Spring-Boot5-6.-로그인-처리1-쿠키-세션)  
- [로그인과 로그아웃](https://wikidocs.net/162255)  
- [SpringBoot와 @PostMapping, @RequestBody 예제](https://memostack.tistory.com/162)  
- [스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술](https://inf.run/Hm59)  
- [앱 8개를 만들면서 배우는 안드로이드 코틀린(Android Kotlin)](https://inf.run/LLn8)  
  
#   
##### Cloud 방화벽 관련 정보  
- [GCP(Google Cloud) 방화벽 설정](https://kibua20.tistory.com/96)  
- [방화벽 설정 (http/https 특정 포트 열기)](https://kibua20.tistory.com/124)  
  
우분투 20.04에서는 iptables 명령어를 실행 후 방화벽을 재실행하거나 재부팅하면 보안 정책이 적용되지 않습니다.  
방화벽 정책을 재 부팅 시에도 유지하기 위해서는 iptables-persistent (또는 netfilter-persisten) 패키지를 설치하고  
**netfilter-persistent save** 명령어로 보안 정책을 저장을 해야 합니다.  
  
- 패키지 설치  
1. sudo apt-get install iptables-persistent  
2. sudo apt-get install netfilter-persistent  
3. sudo apt install ufw  
  
- 리눅스 방화벽 규칙 수정  
1. sudo ufw allow 8080/tcp  
2. sudo ufw allow 80/tcp  
3. sudo ufw allow 1521/tcp  
4. sudo ufw allow 22/tcp  
5. sudo ufw allow 443/tcp  
6. sudo ufw allow 3389/tcp  
7. sudo timedatectl set-timezone Asia/Seoul  
8. sudo netstat -atn  
9. sudo iptables -F  
10. sudo iptables -A INPUT -p tcp --dport 8080 -m state --state NEW,ESTABLISHED -j ACCEPT  
11. sudo iptables -A INPUT -p tcp --dport 80 -m state --state NEW,ESTABLISHED -j ACCEPT  
12. sudo iptables -A INPUT -p tcp --dport 1521 -m state --state NEW,ESTABLISHED -j ACCEPT  
13. sudo iptables -A INPUT -p tcp --dport 22 -m state --state NEW,ESTABLISHED -j ACCEPT  
14. sudo iptables -A INPUT -p tcp --dport 443 -m state --state NEW,ESTABLISHED -j ACCEPT  
15. sudo iptables -A INPUT -p tcp --dport 3389 -m state --state NEW,ESTABLISHED -j ACCEPT  
16. sudo iptables --list
17. sudo netfilter-persistent save  
18. sudo netfilter-persistent start  
  
#  
##### GCP Instance 리눅스 명령어
- 오라클  
1. sudo systemctl stop oracle-xe  
2. sudo systemctl start oracle-xe  
3. sudo systemctl status oracle-xe  
  
- 톰캣     
1. sudo service tomcat9 stop  
2. sudo service tomcat9 start  
3. sudo systemctl status tomcat9  
4. sudo chmod -R 777 /var/lib/tomcat9  
5. cd /var/lib/tomcat9/logs  
6. tail -f catalina.out  
7. Ctrl + C  
  
#  
##### GCP Instance  유지보수 관련  
[rc.local 활성화 해서 재부팅 스크립트 자동실행(우분투)](https://hoing.io/archives/16180)  
[Linux 자동 재부팅 (cron)](https://chilbaek.tistory.com/108)  
[리눅스 서버 다운 원인 5가지](https://blog.naver.com/erm00/220570757883)  
[t2.micro환경 swap메모리 할당으로 Linux 가상 메모리 늘려주기](https://www.zinnunkebi.com/aws-t2-micro-swap-allocate)  
  
최소한으로 잡은 리소스 문제인지, 24시간정도 Instance를 구동하면 접속이 안되는 경우가 잦았다.  
상세원인을 알 수 없어서 임시적으로 새벽 4시에 Linux 재부팅을 하고 오라클과 톰캣 스크립트를  
다시 자동으로 실행하는 것으로 해결했다.  
  
혹시 몰라서 가상 메모리를 추가하는 방법도 사용했다.  
  
#  
[![Hits](https://hits.seeyoufarm.com/api/count/incr/badge.svg?url=https%3A%2F%2Fgithub.com%2Fjihune%2FSE_project&count_bg=%2379C83D&title_bg=%23555555&icon=&icon_color=%23E7E7E7&title=hits&edge_flat=false)](https://hits.seeyoufarm.com)
