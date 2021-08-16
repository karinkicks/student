package karinkicks.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String mark;

    public Student(String name, String mark) {
        this.name = name;
        this.mark = mark;
    }

    public Student(Long id, String name, String mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
}
