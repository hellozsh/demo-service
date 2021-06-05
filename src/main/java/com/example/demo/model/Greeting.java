package com.example.demo.model;

/**
 * @author zhousuhua
 * @date 2021/6/5 5:21 下午
 */
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }


}
