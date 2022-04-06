# JPA

# JPA : Java 어플리케이션에서 관계형 데이터베이스를 사용하는 방식을 정의한 인터페이스
	라이브러리가 아니라 인터페이스임!
	ORM을 사용하기 위해 만든 인터페이스임


# Hibernate : JPA의 구현체의 한 종류


# JPA VS Hibernate
		JPA는 관계형DB와 자바 객체를 매핑하기 위한 인터페이스(API)를 제공하고
		Hibernate는 인터페이스를 구현한 것
		JPA와 Hibernate의 관계는 interface와 해당 interface를 구현한 class와 같은 관계



# Spring Data JPA 
		Spring 프레임워크에서 제공하는 모듈 중 하나로, 개발자가 JPA를 더 쉽고 편하게
		사용할 수 있도록 도와준다.

		1. 구현체 교체의 용이성
		2. 저장소 교체의 용이성	(Spring Data MongoDB, Spring Data Redis 등)
			Spring Data의 하위 프로젝트들은 findAll(), save()등을 동일한 인터페이스로
			가지고 있기 때문에 저장소를 교체해도 기본적인 기능이 변하지 않음.


# H2란?
자바 기반 오픈소스 RDBMS
주로 인 메모리 데이터베이스로 사용되며 기능 테스트 할 때 유용하다.
인 메모리란 휘발성 데이터베이스이기 때문에 컴퓨터를 종료하면 모든 데이터가 삭제.
