package com.example.demo;

import com.example.demo.repository.ProcuratorRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProcuratorRepositoryTest {

    @Autowired
    private ProcuratorRepository procuratorRepository;

}
