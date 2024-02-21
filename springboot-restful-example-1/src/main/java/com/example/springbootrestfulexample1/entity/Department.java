package com.example.springbootrestfulexample1.entity;

import javax.persistence.*;

/*
 * DBMS   - catalog  - schema   - table
 * Mysql  - <no>     - database - table
 * Oracle - database - <no>     - table
 */
@Entity
@Table(name="department", schema ="scott")
public class Department {

    @Id @Column(name = "id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Basic @Column(name = "name")
    private String name;

    @Basic @Column(name = "location")
    private String location;

    public Department() {
    }

    public Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Department(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
