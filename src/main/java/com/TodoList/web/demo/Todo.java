package com.TodoList.web.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // 이 클래스가 데이터베이이스의 테이블을 나타낸다는 것을 알려줌.
public class Todo {
    @Id // 이 필드가 고유번호 임을 나타냄
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 번호 자동생성
    private Long id; // 고유 번호
    private String task; // 할 일
    private boolean completed; // 완료 여부

    // 아래는 이 상자 (Todo)에서 정보를 꺼내고 넣는 방법

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
