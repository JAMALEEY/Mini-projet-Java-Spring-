package com.example.minipcrud.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cases")
public class Case {

    // defining db fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Id du case
    @Column(name = "caseId")
    private Long caseId;

    // Date de création du case
    @CreationTimestamp
    @Column(name = "creationDate")
    private Date creationDate;

    //Date de modification du case
    @UpdateTimestamp
    @Column(name = "lastUpdateDate")
    private Date lastUpdateDate;

    //Titre du case
    @Column(name = "title")
    private String title;

    //Description  du case
    @Column(name = "description")
    private String description;

    // defining constructors


    public Case(Long caseId, Date creationDate, Date lastUpdateDate, String title, String description) {
        this.caseId = caseId;
        this.creationDate = creationDate;
        this.lastUpdateDate = lastUpdateDate;
        this.title = title;
        this.description = description;
    }

    public Case() {
    }

    // defining getters and setters


    public Long getCaseId() {
        return caseId;
    }

    public void setCaseId(Long caseId) {
        this.caseId = caseId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // debuging using to string


    @Override
    public String toString() {
        return "Case{" +
                "caseId=" + caseId +
                ", creationDate=" + creationDate +
                ", lastUpdateDate=" + lastUpdateDate +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
