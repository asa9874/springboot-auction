## 경매장을 한번 만들어보자... (with spring-boot)
    SpringBoot를 사용한 텀프로젝트입니다.
    2024.09.28시작입니다


### ✅ [구상,프로젝트 생성](https://asa9874.tistory.com/446)
### ✅ [엔티티 설계,생성](https://asa9874.tistory.com/463)


### ❌ 페이지 매핑(RESTAPI 로 변경함으로 제거)
- ✅ [메인페이지](https://asa9874.tistory.com/468) 
- ✅ [로그인](https://asa9874.tistory.com/468)
- ✅ [회원가입](https://asa9874.tistory.com/468)




### RESTAPI
#### Auction(auction)
- ✅전체불러오기(/)
- ✅개별불러오기(/{id})
- ❌정렬
- ❌검색
- ❌구입
- ❌페이징

#### user(/user)
- ❌회원가입
- ❌로그인
- ❌유저정보
- ✅정보불러오기(/info/{id})
- ❌가지고있는 아이템
- ❌경매장에 올린아이템
- ❌개인정보 변경
- ❌돈충전
- ❌로그아웃
- ❌아이템올리기
- ❌아이템내리기


#### item(/item)
- ✅개별 아이템 정보(/{id})
- ❌아이템 생성
- ❌아이템 제거
- ❌아이템 정보수정