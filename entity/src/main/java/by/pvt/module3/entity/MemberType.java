package by.pvt.module3.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "member_type")
public class MemberType implements Serializable, Fact {
    public static final String ID = "id";

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
