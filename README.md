# Spring Boot 공부 내용을 정리하는 레포입니다.

## content

- Exception
- Rest-Api
- Validation
- SQL
- CRUD (MemoryDB, MySQL)
- JPA

# RestAPI

### RestAPI란?

REST를 기반으로 만들어진 API를 의미합니다.

### Rest란?

REST(Representational State Transfer)의 약자로 자원을 이름으로 구분하여 해당 자원의 상태를 주고받는 모든 것을 의미합니다. 즉 REST란 `HTTP URI(Uniform Resource Identifier)를 통해 자원(Resource)을 명시하고, HTTP Method(POST, GET, PUT, DELETE, PATCH 등)를 통해 해당 자원(URI)에 대한 CRUD Operation을 적용`하는 것을 의미합니다.

### REST API 설계 규칙

- 1. URI는 동사보다는 명사를, 대문자보다는 소문자를 사용하여야 한다.

```
Bad Example http://khj93.com/Running/
Good Example  http://khj93.com/run/
```

- 2. 마지막에 슬래시 (/)를 포함하지 않는다.

```
Bad Example http://khj93.com/test/
Good Example  http://khj93.com/test
```

- 3. 언더바 대신 하이폰을 사용한다.

```
Bad Example http://khj93.com/test_blog
Good Example  http://khj93.com/test-blog
```

- 4. 파일확장자는 URI에 포함하지 않는다.

```
Bad Example http://khj93.com/photo.jpg
Good Example  http://khj93.com/photo
```

- 5. 행위를 포함하지 않는다.

```
Bad Example http://khj93.com/delete-post/1
Good Example  http://khj93.com/post/1
```

### RestFul이란?

REST의 원리를 따르는 시스템을 의미합니다. 하지만 REST를 사용했다 하여 모두가 RESTful 한 것은 아닙니다. `REST API의 설계 규칙을 올바르게 지킨 시스템을 RESTful하다` 말할 수 있으며 `모든 CRUD 기능을 POST로 처리 하는 API` 혹은 `URI 규칙을 올바르게 지키지 않은 API는 REST API의 설계 규칙`을 올바르게 지키지 못한 시스템은 REST API를 사용하였지만 RESTful 하지 못한 시스템이라고 할 수 있습니다.

### REST 구성 요소

- 자원(Resource) : HTTP URI
- 자원에 대한 행위(Verb) : HTTP Method
- 자원에 대한 행위의 내용 (Representations) : HTTP Message Pay Load

### REST의 특징

- Server-Client(서버-클라이언트 구조)
- Stateless(무상태)
- Cacheable(캐시 처리 가능)
- Layered System(계층화)
- Uniform Interface(인터페이스 일관성)

# Exception

### 우선순위 : RestException > GlobalException

![Exception](https://github.com/user-attachments/assets/4d6ddfeb-823e-4497-9454-bcf7864606ea)

# Validation

![Validation](https://github.com/user-attachments/assets/770bab4f-f199-463c-95d0-aa6bb4aa28ff)
![Validation-content](https://github.com/user-attachments/assets/c2041d1a-8e60-4037-b240-b1c615e43944)
![Spring_Boot_Validation-2](https://github.com/user-attachments/assets/68b2eba1-8e4c-44dc-ac95-7667b2d4bddb)
![Spring_Boot_Validation-1](https://github.com/user-attachments/assets/cefbde21-924a-4568-ae49-a54d5c65a93c)

- 핸드폰 번호 정규식 "^\d{2,3}-\d{3,4}-\d{4}$"

# Override

### Override (오버라이드) 란?

사전적 의미로, 위에 덮여쓰다라는 뜻을 갖는다.
즉 상위 클래스에서 정의된 변수와 메소드의 내용을 하위 클래스에서 변경하여 재정의하는 것 입니다.
결국 새롭게 재정의하여 상위 클래스 수행 기능과는 다른 기능을 수행하게 하는 것 이라고 보면 됩니다.

- 변수나 메소드의 내용을 변경할 수 있음
- 즉, 동일한 메소드 호출에도 각 객체 마다 다른 행동이 가능
- 또한, 자식 클래스는 새로운 클래스 역할도 가능

### 오버로딩, 오버라이딩 비교

- 오버라이딩 (Overriding) : 상속 관계에서 만 가능
- 오버로딩 (Overloading) : 동일 클래스 내 또는 상속 관계 둘 다 가능

# Static

![Static](https://github.com/user-attachments/assets/d759e0b3-b06c-4145-9f76-b96fa334c82a)

일반적으로 우리가 만든 Class는 `Static 영역`에 생성되고, new 연산을 통해 생성한 객체는 `Heap영역`에 생성됩니다. 객체의 생성시에 할당된 Heap영역의 메모리는 `Garbage Collector`를 통해 수시로 관리를 받습니다. 하지만 Static 키워드를 통해 Static 영역에 할당된 메모리는 모든 객체가 공유하는 메모리라는 장점을 지니지만, Garbage Collector의 관리 영역 밖에 존재하므로 Static을 자주 사용하면 프로그램의 종료시까지 메모리가 할당된 채로 존재하므로 자주 사용하게 되면 시스템의 퍼포먼스에 악영향을 주게 됩니다.

### 특징

- Static 변수는 클래스 변수이다.
- 객체를 생성하지 않고도 Static 자원에 접근이 가능하다.

#### Static 변수와 static 메소드는 Static 메모리 영역에 존재하므로 객체가 생성되기 이전에 이미 할당이 되어 있습니다. 그렇기 때문에 객체의 생성없이 바로 접근(사용)할 수 있습니다. 

# abstract

### 1. 추상클래스와 추상메소드란?

추상클래스란 말 그대로 추상적으로 밖에 그려지지 않은 클래스라고 합니다. 즉 클래스가 전체적인 구성을 다 가지지 못한 채 설계만 되어있는 클래스입니다. 미완성인 설계도로 완성된 작품을 만들 수 없듯이 추상클래스로 인스턴스를 생성할 수 는 없습니다. 그래서 상속 (Extends)를 통해서 자식클래스에 의해 완성이 됩니다.
즉 추상클래스 자체로는 제 기능을 못하지만, 새로운 기능을 정의하는데 있어서 바탕(틀)이 될 수 있습니다.

### 특징

- 추상 메소드가 하나 이상되면 포함되면 반드시 추상 클래스로 선언이 되어야한다.
- 추상클래스에서 추상 메소드가 아닌 일반 메소드를 선언 할 수 있다.
- 추상클래스를 상속하는 자식 클래스에서 부모가 가진 메소드를 모두 오버라이딩 해야한다.
- 추상 메소드는 몸체가 없고 선언부만 존재 한다.

# interface

### 인터페이스 클래스란?

인터페이스는 추상클래스처럼 추상 메소드를 갖지만, `추상클래스보다 추상화 정도가 높아서 추상클래스와 달리 몸통을 갖춘 일반 메소드 또는 일반 변수를 구성원으로 가질 수 없다.` 오직 추상 메소드와 상수만을 멤버로 가질 수 있으므로 그 외 다른 어떠한 요소도 허용하지 않는다. 추상클래스를 부분적으로 미완성된 설계도라고 한다면, `인터페이스 클래스는 아무것도 없고 밑그림만 그려져 있는 상태이다.`

### 특징

- 모든 멤버 변수는 public static final 이어야 하며, 이를 생략 할 수 있다.
- 모든 메소드는 public abstract 이어야 하며, 이를 생략 할 수 있다.
- 인터페이스는 인터페이스로만 상속이 가능하며, 클래스와 달리 다중 상속이 가능하다.

# extends & implements & abstract 차이점

1. extends : 부모에서 선언하며 부모는 정의를 모두해 자식은 메소드 변수를 그대로 사용할 수 있다.
2. implements : 부모 객체는 선언만 하며 정의(내용)은 자식에서 오버라이딩 (재정의) 해서 사용 해야 한다.
3. abstract : extends와 interface 혼합이며, extends하되 몇 개는 추상 메소드로 구현되어 있다.
