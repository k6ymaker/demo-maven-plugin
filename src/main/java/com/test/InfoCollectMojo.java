package com.test;

import com.alibaba.fastjson.JSON;
import com.test.struct.Build;
import com.test.struct.Parent;
import com.test.struct.PomInfo;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name="infocollect")
public class InfoCollectMojo  extends AbstractMojo {


    @Parameter(property = "project", required = true)
    private MavenProject project;

    public void execute() throws MojoExecutionException, MojoFailureException {
        
        PomInfo pi  = new PomInfo();

        pi.setPackaging(project.getPackaging());

        if(project.getParent() != null){
            pi.setParent(new Parent(project.getParent().getArtifactId(),
                    project.getParent().getGroupId(),
                    project.getParent().getVersion()));
        }

        Build b = new Build(project.getBuild().getFinalName(),project.getBuild().getOutputDirectory(),project.getBuild().getDirectory());
        pi.setBuild(b);

        String str =  JSON.toJSONString(pi);

        getLog().info( project.getBuild().getDirectory());
        getLog().info(str);
    }
}
