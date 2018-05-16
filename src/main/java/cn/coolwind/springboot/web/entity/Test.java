package cn.coolwind.springboot.web.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "test")
public class Test implements Serializable {

    private static final long serialVersionUID = 8706988399625132045L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Test(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Test() {
    }
}
