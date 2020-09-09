package com.zero.hjy.pojo;

import java.util.List;

public class Tempalte {

    private List<UnitTemplate> unitTemplates;

    public Tempalte() {
    }

    public Tempalte(List<UnitTemplate> unitTemplates) {
        this.unitTemplates = unitTemplates;
    }

    public List<UnitTemplate> getUnitTemplates() {
        return unitTemplates;
    }

    public void setUnitTemplates(List<UnitTemplate> unitTemplates) {
        this.unitTemplates = unitTemplates;
    }
}
