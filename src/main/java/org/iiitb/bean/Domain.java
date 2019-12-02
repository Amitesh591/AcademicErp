package org.iiitb.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Domain {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NotBlank
    private String discipline; //M.Tech, iM.Tech, MS, Ph.D
    
    @NotBlank
    private String branch; // CSE, ECE
    
    @NotBlank
    @Column(unique = true)
    private String code; //MT, IMT
    
    @JsonIgnore
    @OneToMany(mappedBy = "domain")
    private Set<Student> students = new HashSet<>();
    
    public Domain() {
    }
    
    public Domain(Integer id) {
        this.id = id;
    }
    
    public Domain(String discipline, String branch, String code) {
        this.discipline = discipline;
        this.branch = branch;
        this.code = code;
    }
    
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getDiscipline() {
        return discipline;
    }
    
    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
    
    public String getBranch() {
        return branch;
    }
    
    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public Set<Student> getStudents() {
        return students;
    }
    
    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}