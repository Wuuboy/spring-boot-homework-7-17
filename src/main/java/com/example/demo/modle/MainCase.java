package com.example.demo.modle;


import javax.persistence.*;

@Entity
public class MainCase {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false,length = 128)
    private String caseName;

    @Column(nullable = false)
    private long caseTime;

    @OneToOne(cascade = CascadeType.ALL)
    private CaseDetail caseDetail;

    @OneToOne(cascade = CascadeType.ALL ,fetch = FetchType.EAGER)
    private Procuratorate procuratorate;

    public void setProcuratorate(Procuratorate procuratorate) {
        this.procuratorate = procuratorate;
    }

    public Procuratorate getProcuratorate() {
        return procuratorate;
    }

    public MainCase(String caseName, long caseTime, CaseDetail caseDetail, Procuratorate procuratorate) {
        this.caseName = caseName;
        this.caseTime = caseTime;
        this.caseDetail = caseDetail;
        this.procuratorate = procuratorate;
    }

    public void setCaseDetail(CaseDetail caseDetail) {
        this.caseDetail = caseDetail;
    }

    public CaseDetail getCaseDetail() {
        return caseDetail;
    }

    public MainCase(String caseName, long caseTime, CaseDetail caseDetail) {
        this.caseName = caseName;
        this.caseTime = caseTime;
        this.caseDetail = caseDetail;
    }

    public MainCase() {
    }

    public MainCase(String caseName, long caseTime) {
        this.caseName = caseName;
        this.caseTime = caseTime;
    }

    //    @OneToOne(cascade= CascadeType.ALL)
//    @JoinColumn(referencedColumnName = "id")
//    private CaseDetail caseDetail;

//    @OneToOne(cascade= CascadeType.ALL)
//    @JoinColumn(referencedColumnName = "id")
//    private Procuratorate procuratorate;
//
//    public MainCase(String caseName, long caseTime, Procuratorate procuratorate) {
//        this.caseName = caseName;
//        this.caseTime = caseTime;
//        this.procuratorate = procuratorate;
//    }
//
//    public void setProcuratorate(Procuratorate procuratorate) {
//        this.procuratorate = procuratorate;
//    }
//
//    public Procuratorate getProcuratorate() {
//        return procuratorate;
//    }
//
//    public MainCase(String caseName, long caseTime, CaseDetail caseDetail, Procuratorate procuratorate) {
//        this.caseName = caseName;
//        this.caseTime = caseTime;
//        this.caseDetail = caseDetail;
//        this.procuratorate = procuratorate;
//    }
//
//    public void setCaseDetail(CaseDetail caseDetail) {
//        this.caseDetail = caseDetail;
//    }
//
//    public CaseDetail getCaseDetail() {
//        return caseDetail;
//    }
//
//    public MainCase(String caseName, long caseTime, CaseDetail caseDetail) {
//        this.caseName = caseName;
//        this.caseTime = caseTime;
//        this.caseDetail = caseDetail;
//    }

//    public MainCase()
//    {
//
//    }
//
//    public MainCase(String caseName, long caseTime) {
//        this.caseName = caseName;
//        this.caseTime = caseTime;
//    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public void setCaseTime(long caseTime) {
        this.caseTime = caseTime;
    }

    public Long getId() {
        return id;
    }

    public String getCaseName() {
        return caseName;
    }

    public long getCaseTime() {
        return caseTime;
    }
}
