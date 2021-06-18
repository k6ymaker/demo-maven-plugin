package com.test.struct;

import com.alibaba.fastjson.annotation.JSONField;

public class Parent {
    @JSONField(name = "artifactid")
    private String artifactid;
    @JSONField(name = "groupid")
    private String gourpid;
    @JSONField(name="version")
    private String version;

    public String getArtifactid() {
        return artifactid;
    }

    public void setArtifactid(String artifactid) {
        this.artifactid = artifactid;
    }


    public String getGourpid() {
        return gourpid;
    }

    public void setGourpid(String gourpid) {
        this.gourpid = gourpid;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Parent(String artifactid, String gourpid, String version) {
        this.artifactid = artifactid;
        this.gourpid = gourpid;
        this.version = version;
    }

}
