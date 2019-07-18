package com.example.demo.modle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CaseDetail {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false,length = 255)
    private String subjectiveDetail;

    @Column(nullable = false,length = 255)
    private String objectiveDetail;

    public CaseDetail() {
    }

    public CaseDetail(String subjectiveDetail, String objectiveDetail) {
        this.subjectiveDetail = subjectiveDetail;
        this.objectiveDetail = objectiveDetail;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSubjectiveDetail(String subjectiveDetail) {
        this.subjectiveDetail = subjectiveDetail;
    }

    public void setObjectiveDetail(String objectiveDetail) {
        this.objectiveDetail = objectiveDetail;
    }

    public Long getId() {
        return id;
    }

    public String getSubjectiveDetail() {
        return subjectiveDetail;
    }

    public String getObjectiveDetail() {
        return objectiveDetail;
    }
}
