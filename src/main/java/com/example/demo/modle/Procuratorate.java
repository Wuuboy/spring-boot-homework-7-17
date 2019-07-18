package com.example.demo.modle;

import javax.persistence.*;
import java.util.List;

@Entity
public class Procuratorate {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false,unique = true)
    private String procuratorateName;

    @OneToMany(cascade= CascadeType.ALL ,fetch = FetchType.EAGER)
    private List<Procurator>procurators;


    public Procuratorate() {

    }

    public void setProcurators(List<Procurator> procurators) {
        this.procurators = procurators;
    }

    public List<Procurator> getProcurators() {
        return procurators;
    }

    public Procuratorate(String procuratorateName, List<Procurator> procurators) {
        this.procuratorateName = procuratorateName;
        this.procurators = procurators;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProcuratorateName(String procuratorateName) {
        this.procuratorateName = procuratorateName;
    }

    public String getProcuratorateName() {
        return procuratorateName;
    }

    public Procuratorate(String procuratorateName) {
        this.procuratorateName = procuratorateName;
    }
}
