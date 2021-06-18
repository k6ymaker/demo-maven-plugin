package com.test.struct;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String[] args) {
        Build b = new Build("test-test","./target/class","./target");
        Parent p = new Parent("parentA","parentG","parentV");
        PomInfo pi = new PomInfo("jar",b,p);
        String str =  JSON.toJSONString(pi);
    }
}
