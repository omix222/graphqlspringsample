package com.example.demo.type;

/**
 * Mutation用のデータクラス.
 *
 */
public class _ToDo {

    private String content;
    private boolean completed;
    private int userId;

    public int getUserId() {
        return userId;
    }

    public String getContent() {
        return content;
    }

    public boolean isCompleted() {
        return completed;
    }

}
