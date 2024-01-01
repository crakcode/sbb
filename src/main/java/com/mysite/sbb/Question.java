package com.mysite.sbb;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;


// Entity 어노테이션을 이용한 JPA 엔티티로 인식함

/*엔티티를 생성할 경우에는 롬복의 @Builder 어노테이션을 통한 빌드패턴을 사용하고
데이터를 변경해야 할 경우에는 그에 해당되는 메서드를 엔티티에 추가하여 데이터를 변경하면 된다.
 */

@Entity
@Getter
@Setter
public class Question {


    //  Id는 고유번호 , 중복되면 안되는값을 의미한다.
//  GeneratedValue를 이용하여 1씩 자동 증가하여 저장 된다.
//  Strategy는 고유번호를 생성하는 옵션으로 독립적인 시퀀스를 생성및 번호 증가
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;

}
