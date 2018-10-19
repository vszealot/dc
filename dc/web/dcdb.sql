select * from tab;

create table LogInfo(
userId varchar2(30) primary key,
userPassword varchar2(30) not null
);

insert into LOGINFO values('user11','1234');
select * from LOGINFO;
delete loginfo where userid='vszealot';
drop table loginfo;




create table userInfo(	-- jsp에서 js로 not null거르자
nickname varchar2(30) primary key,
userId varchar2(30),
userEmail varchar2(30),
userAddress varchar2(1000),
userPhone varchar2(30),
CONSTRAINT fkuserid FOREIGN KEY(userId) references LogInfo ON DELETE CASCADE	-- LofInfo에서 userId를 지우면 같이 지워짐
);
drop table userinfo;

insert into userInfo values('유저11','user11','user11@gmail.com','경기도 고양시 덕양구','010-1111-2222');
select * from userInfo;
select * from userInfo join loginfo using(userId);




create table boardInfo(
boardName varchar2(30) primary key,
nickname varchar2(30),
userId varchar2(30),
boardTag1 varchar2(30),
boardTag2 varchar2(30),
boardTag3 varchar2(30),
boardTag4 varchar2(30),
boardTag5 varchar2(30),
CONSTRAINT fknickname FOREIGN KEY(nickname) references userInfo -- ON DELETE CASCADE id를 삭제하면 게시판도 날릴것인가?
);
insert into boardInfo values('IT짜증','유저11','태그1','태그2');
select * from boardInfo;
delete boardinfo;
drop table boardContent_vszealot;
select * from tab;




create sequence vszealot_postNo;	-- 생각해보니 포스트별로 시퀀스가 필요한듯?
drop sequence vszealot_postNo;

create table boardContent_userId(
postNo number primary key,
boardName varchar2(30),
postWriter varchar2(30),
postPassword varchar2(30),
postTitle varchar2(30),
postContent varchar2(1000),
postTime varchar2(30),
postClick number,
CONSTRAINT fkboardName FOREIGN KEY(boardName) references boardInfo ON DELETE CASCADE
);
insert into boardContent values(1,'IT짜증','제목','내용내용내용내용내용내용',23);
select * from boardContent;



create table postComment(
postNo number,
commentContent varchar2(30),
commentNickname varchar2(30),
boardTag5 varchar2(30),
CONSTRAINT fkpostNo FOREIGN KEY(postNo) references boardContent ON DELETE CASCADE
);



create table postImage(????
postNo number,
imageURL
);



drop table POSTCOMMENT;
drop table boardContent_userId;
drop table BOARDTAG;
drop table BOARDINFO;
drop table USERINFO;
drop table LOGINFO;



