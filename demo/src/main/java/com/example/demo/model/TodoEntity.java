package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Builder    //Builder 패턴을 사용해 오브젝트를 생성할 수 있음
@NoArgsConstructor  // 매개변수가 없는 생성자를 구현해 줌
@AllArgsConstructor // 클래스의 모든 멤버 변수를 매개변수로 받는 생성자를 구현해 줌
@Data   // 클래스 멤버 변수의 Getter/Setter 메서드를 구현해 줌
@Entity
@Table(name = "Todo")
public class TodoEntity {

    @Id
    @GeneratedValue(generator = "system-uuid")  // ID 자동생성
    @GenericGenerator(name = "system-uuid", strategy = "uuid")  // Hibernate가 제공하는 기능 말고 커스텀 Generator 이용
    private String id;
    private String userId;
    private String title;
    private boolean done;   // true - todo를 완료한 경우(checked)
}
