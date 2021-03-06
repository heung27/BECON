# BECON
<p align="center"><img width="540" alt="KakaoTalk_20210725_230610901" src="https://user-images.githubusercontent.com/77487962/127521182-6079635e-9e63-4bec-bdd0-15dede77638d.png"></p>

> 가상의 같은 공간에서 함께 즐기는, 우리가 같이 만들어나가는 즐거운 공연문화 🎶

BECON은 공연을 즐기는 사람들을 위해 시작된 비대면 공연 플랫폼입니다.
국적과 인종, 성별 등과 상관 없이 음악을 사랑하는 사람들이라면 누구든지 하나가 될 수 있는
다양한 장르의 뮤지션들과 함께 신나는 분위기부터 여유로운 분위기까지 모두 느껴보세요.

음악을 사랑하는 모두와 함께 소통할 수 있는 페스티벌, BECON으로 오세요.

<br>

## 기획 배경
> 코로나 사태가 심화되면서 공연 문화가 죽고있다.
- 코로나 사태 지속
  - 방역 당국은 백신을 통한 통제를 강조하고 있지만, 일부 수급에 차질이 빚어지고 있어, 지금의 감염 확산 속도라면 델타 변이 비중이 70~80%에 이를 거라는 전망이 있다.
- 죽어가는 공연 문화
  - 지난해(2020년) 1~12월 코로나19로 인해 취소된 공연은 1만6199건,취소된 전시 건수는 2750건으로 추정됐다. 이로 인한 매출액 피해는 공연예술 3291억원, 시각예술 1201억원이다.
- 온택트 시대 
  - 차별화된 볼거리와 즐길 거리를 통해 참여자들의 원활한 커뮤니케이션을 유도하고, 더욱 많은 사람들이 공간의 제약 없이 실시간으로 즐길 수 있도록 하는 등 현장에서 느낄 수 있는 체험과 소통을 온라인으로 전달할 수 있다.
- 코로나 블루의 확산
  - 문화활동 위축은 시민의 행복감에도 영향을 미친 것으로 나타났다. 코로나 이후 문화활동 변화로 인한 정서적 경험을 묻는 말에 응답자의 72.8%는 ‘문화시설을 방문하지 못해 답답함을 느꼈다’고 답했다.

<br>

## 과제
> 같은 공간, 가슴뛰는 공연, 함께하는 소통
- 온라인 화상 공연 플랫폼
  - WebRTC, WebSocket 기술을 이용해 아티스트와 팬이 실시간으로 즐기는 콘서트 기회를 제공한다.
- 온택트 공연 환경 제공
  - 코로나 19로 인해 죽어가는 공연 문화 속에서 새로운 공연 문화를 정착시킨다.
- 아티스트와 팬과의 소통의 자리 마련
  - 비대면 환경 속에서도 서로 마주보며 소통 할 수 있는 자리를 마련한다.

<br>

## 주요 기능
- 공연 스트리밍 서비스
  - 아티스트는 자신의 공연를 등록하고 예정된 시간에 공연 진행
  - 채팅 기능을 통해 아티스트와 팬 소통
  - VIP 티켓을 구매한 팬들은 자신의 캠을 통해 더욱 직접적인 소통 가능
  - 실시간으로 공연 상태 관리 (대기, 준비, 진행, 종료) 
- 공연 티켓 서비스
  - VIP 티켓과 STAND 티켓으로 구분하여 공연방 기능 차별화
  - 본인인증 & 티켓 결제
  - 구매 내역 관리
  - 티켓 번호를 통해 공연 입장 가능
  - 공연 시작 1시간전 LMS문자 알림

<br>

## 배포
- URL : OFF
- 배포 여부 : ❌
- HTTPS 적용 : ⭕️

<br>

## 개발 환경
> 개발기간 : 2021. 07. 12 ~ 2021. 08. 20 (6 주)
### Frontend 
- VueJs 2.6.12
- vue/cli 4.5.13
- NodeJS 14.17.3
- IDE : VSCode 1.59.0
- 디자인 : [Linoor - Vue Nuxt Digital Agency Services Template](https://themeforest.net/item/linoor-vue-nuxt-digital-agency-services-template/29146481) 활용 (유료) 
- 지원 환경 : Web / Mobile / Web App / Native App
- 담당자 : 권준엽, 황배근

### Backend
- Spring boot 2.4.5
- JDK 1.8.0_192
- Gradle 6.7
- MySQL 5.7
- Redis 6.0.15
- IDE : Eclipse 2020.06
- 담당자 : 강민주, 안진흥

### DevOps
- AWS EC2 : Ubuntu 20.04
- Docker 20.10.7
- Nginx 1.18.0
- Tomcat 9.0.45
- Let’s Encrypt SSL
- 담당자 : 이상민

### 협업
- GitLab
- Jira
- Notion
- Figma

<br>

## 아키텍처
![아키텍처](https://user-images.githubusercontent.com/62068895/132088326-56f7a875-2285-4239-a8d0-a5a713c7e7a4.PNG)

<br>

## 주요 기술
#### WebSocket
   > 웹 서버와 웹 브라우저간 실시간 양방향 통신환경을 제공해주는 실시간 통신 기술. Polling 방식(요청-응답방식)과 다르게 양방향으로 원할때 요청을 보낼 수 있으며 stateless한 HTTP에 비해 오버헤드가 적은 장점이 있다. HTTP 프로토콜에서 HandShaking을 완료한 후 지속적인 양방향 통신을 한다.
#### Stomp
   > 텍스트 기반 메세징 프로토콜. WebSocket 위에서 동작하는 프로토콜로써 클라이언트와 서버가 전송할 메세지의 유형, 형식, 내용들을 정의하는 매커니즘이다. pub/sub 구조로 되어있어 메세지를 전송하고 메세지를 받아 처리하는 부분이 확실히 정해져 있기 때문에 개발자 입장에서 명확하게 인지하고 개발할 수 있는 이점이 있다.
#### SockJS
   > WebSocket과 유사한 객체를 제공하는 브라우저 JavaScript 라이브러리. SockJS는 브라우저와 웹 서버간에 낮은 대기 시간, 전이중, 도메인 간 통신 채널을 생성하는 일관된 크로스 브라우저 Javascript API를 제공합니다. SockJS는 모든 최신 브라우저와 WebSocket 프로토콜을 지원하지 않는 환경에서 작동하도록 고안되었습니다. 
#### kurento
   > WebRTC 미디어 서버 및 클라이언트 API 세트. Kurento Media Server 기능에는 그룹 통신, 트랜스코딩, 녹음, 믹싱, 방송 및 시청각 흐름 라우팅이 포함된다.
#### Redis
   > 메모리 기반의 “키-값” 구조 데이터 관리 시스템. 모든 데이터를 메모리에 저장하고 조회하기에 빠른 Read, Write 속도를 보장하는 비 관계형 데이터베이스이다.
#### Spring Security
   > 스프링 기반의 애플리케이션의 보안(인증과 권한, 인가 등)을 담당하는 스프링 하위 프레임워크.
#### JWT
   > Json 포맷을 이용하여 사용자에 대한 속성을 저장하는 Claim 기반의 Web Token. JWT는 토큰 자체를 정보로 사용하는 Self-Contained 방식으로 정보를 안전하게 전달한다.
#### Spring Scheduler
   > 스프링 3.1버전부터 스프링에서 제공해주는 스케줄러. Quartz보다 스케줄러를 디테일하게 사용하도록 하진 않지만 구현이 매우 간단하다.
#### JPA
   > 자바 ORM 기술에 대한 API 표준 명세. 자바 어플리케이션에서 관계형 관계형 데이터베이스를 사용하는 방식을 정의한 인터페이스이다. ORM에 대한 자바 API 규격이며 Hibernate, OpenJPA 등이 JPA를 구현한 구현체이다.

<br>

## 산출물
- [프로젝트 PPT](document/beconPPT.pdf)
- [화면설계](document/screen)
- [DB설계](document/beconERD.PNG)

<br>

## Rules (꼭 지킵시다!!)
> 협업을 위해 개발에 필요한 여러 규칙들을 정의합니다.

### GIT 규칙
- 작업단위로 브랜치 생성하여 작업하기
- 브랜치 구조 : master - develop - 기능별 브랜치 이름(역할 분배 된 대로)
- 브랜치명 규칙 : BE-WebRTC, FE-ConferencePopup
- Merge 규칙 : 명세서 기반, 지라 기준 한개의 작업 또는 한개의 부작업 구현 완료시 Merge
- Commit 규칙 : 수정 시 Modify 기능명, 추가 시 Add 기능명, 삭제시 Delete 기능명 등 앞에 확실히 알 수 있는 단어 붙이기
- **반드시 다른 사람에게 코드 리뷰를 받은 후 merge** 할 것

### JIRA 규칙
- 큰틀은 BE, FE로 구분
- 명세서 기준 스토리는 분류, 작업은 제목, 부작업은 명세의 기능으로 구성한다 
- 작업은 작업을 포함하는 스토리를 이슈에 연결하여 생성
- 부작업은 작업에서 더많은 조치에서 생성
- 담당자와 스토리포인트 설정하기
- 스프린트에서 상태 변경하기

### 파일명 및 변수명 규칙
- vue 관련 파일명 : 소문자로만 구성, 띄어쓰기시 - 로 구분
- Spring 관련 파일 : 파스칼 표기법, 카멜 표기법과 동일하지만 첫 글자를 대문자로 표기 ex) PascalCase
- 메소드의 이름은 대소문자 혼용 가능하지만 반드시 동사를 사용하여 소문자로 시작 ex) checkRange()
- 그 외 일반적인 변수 : 카멜 표기법, 각 단어의 첫글자는 대문자로 하되, 첫 글자만 소문자로 표기 ex) camelCase 
- 엔티티의 멤버 변수 이름은 DB에 있는 변수명을 기본
- is 접두사를 통해 boolean변수를 표기한다 ex) 로그인이 되었는지 체크하는 변수 :  isLogin
- n 접두사를 통해 객체의 개수를 나타내는 변수를 표기한다 ex) nUser
- No 접미사를 통해 엔티티 번호를 나타낸다 ex) userNo, coferenceNo
- 상수의 경우 대문자로 표기한다 ex) 회원의 등급 : USER_GUEST, USER_ADMIN
- 최대한 직관적으로  작성 ex) ~num, ~cnt, 

