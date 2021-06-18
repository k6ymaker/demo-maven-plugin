package com.test.struct;

import com.alibaba.fastjson.annotation.JSONField;

public class Build {
    @JSONField(name = "finalname")
    private String finalName;
    @JSONField(name = "outputdirectory")
    private String outputDirectory;
    @JSONField(name = "directory")
    private String dirctory;

    public String getDirctory() {
        return dirctory;
    }

    public void setDirctory(String dirctory) {
        this.dirctory = dirctory;
    }

    public String getFinalName() {
        return finalName;
    }

    public void setFinalName(String finalName) {
        this.finalName = finalName;
    }

    public String getOutputDirectory() {
        return outputDirectory;
    }

    public Build(String finalName, String outputDirectory, String dirctory) {
        this.finalName = finalName;
        this.outputDirectory = outputDirectory;
        this.dirctory = dirctory;
    }

    public void setOutputDirectory(String outputDirectory) {
        this.outputDirectory = outputDirectory;
    }


}
