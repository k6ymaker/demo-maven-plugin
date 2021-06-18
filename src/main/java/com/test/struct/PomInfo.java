package com.test.struct;

import com.alibaba.fastjson.annotation.JSONField;

public class PomInfo {
    @JSONField(name = "packaging")
    private String packaging;
    @JSONField(name = "build")
    private Build build;
    @JSONField(name="parent")
    private Parent parent;

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public Build getBuild() {
        return build;
    }

    public void setBuild(Build build) {
        this.build = build;
    }

    public Parent getParent() {
        return parent;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public PomInfo(String packaging, Build build, Parent parent) {
        this.packaging = packaging;
        this.build = build;
        this.parent = parent;
    }

    public PomInfo(){
    }
}
