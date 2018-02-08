package com.stupidchen.blog.model;

/**
 * Created by mike on 2/8/18.
 */
public class TestModel {

    private String msg;
    private int id;

    public TestModel() {
        msg = "Hello World Test!";
        id = 1010101;
    }

    public TestModel(String msg, int id) {
        this.msg = msg;
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public TestModel setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public int getId() {
        return id;
    }

    public TestModel setId(int id) {
        this.id = id;
        return this;
    }
}
