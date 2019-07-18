package com.example.demo;

import com.example.demo.modle.MainCase;
import com.example.demo.modle.Procurator;
import com.example.demo.modle.Procuratorate;
import com.example.demo.repository.ProcuratorateRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProcuratorateRepositoryTest {

    @Autowired
    private ProcuratorateRepository procuratorateRepository;

    @Before
    public void setUp() {
        List<Procurator>procurators = new ArrayList<>();
        procurators.add(new Procurator("procuratorA"));
        procurators.add(new Procurator("procuratorB"));

        List<Procuratorate> Procuratorates = new ArrayList<Procuratorate>() {{
            add(new Procuratorate("ProcuratorateA",procurators));
            add(new Procuratorate("ProcuratorateB"));
            add(new Procuratorate("ProcuratorateC"));
        }};
        procuratorateRepository.saveAll(Procuratorates);
    }

    @Test
    public void should_return_procurators_by_procuratorateName()
    {
        Procuratorate procuratorate = procuratorateRepository.findByprocuratorateName("ProcuratorateA");
        Assert.assertEquals(2, procuratorate.getProcurators().size());
    }
}
