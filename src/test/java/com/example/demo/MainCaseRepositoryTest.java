package com.example.demo;

import com.example.demo.modle.CaseDetail;
import com.example.demo.modle.MainCase;
import com.example.demo.modle.Procuratorate;
import com.example.demo.repository.MainCaseRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public  class MainCaseRepositoryTest {

    @Autowired
    MainCaseRepository mainCaseRepository;

    @Before
    public void setUp() {
        List<MainCase> cases =new ArrayList<>();
        MainCase caseOne=new MainCase("caseA",new Date().getTime());
        MainCase caseTwo=new MainCase("caseB",new Date().getTime());
        MainCase caseThree=new MainCase("caseC",new Date().getTime());
        cases.add(caseOne);
        cases.add(caseTwo);
        cases.add(caseThree);
        mainCaseRepository.saveAll(cases);
    }

    @Test
    public void should_return_case_by_caseName()
    {
        List<MainCase> fetchedCases = mainCaseRepository.findByCaseName("caseA");
        Assert.assertEquals(1, fetchedCases.size());
    }

    @Test
    public void should_return_ordered_cases_ordered_by_caseTime()
    {
        List<MainCase> fetchedCases = mainCaseRepository.findAllByOrderByCaseTimeDesc();
//        Assert.assertEquals(1, fetchedCases.size());
    }

    @Test
    public void addcaseDetail(){
        MainCase newCase = new MainCase("caseD",111111111);
        CaseDetail caseDetail = new CaseDetail("subjectiveDetailD","objectiveDetailD");
        newCase.setCaseDetail(caseDetail);
        MainCase caseSaved = (MainCase) mainCaseRepository.saveAndFlush(newCase);
        Assert.assertEquals(caseSaved.getCaseDetail().getObjectiveDetail(),"objectiveDetailD");
    }

    @Test
    public void addProcuratorate(){
        MainCase newCase = new MainCase("caseD",111111111);
        Procuratorate procuratorate = new Procuratorate("ProcuratorateD");
        newCase.setProcuratorate(procuratorate);
        MainCase caseSaved = (MainCase) mainCaseRepository.saveAndFlush(newCase);
        Assert.assertEquals(caseSaved.getProcuratorate().getProcuratorateName(),"ProcuratorateD");
    }



}
