package org.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ToDoManager {
    Map<Integer, String> todoList;
    int ID;

    //key,value값 설정
    public ToDoManager() {
        todoList = new HashMap<>();
        ID = 0;

    }

    // 1.추가를 담당하는 메서드 addToDo
    public void addToDo(String todo) {

        ID += 1;
        todoList.put(ID, todo);
        System.out.printf("할 일이 추가되었습니다. %d:%s%n", ID, todo);
    }
    // 2.삭제를 담당하는 메서드 deleteToDo
    public void deleteToDo(int ID) {

        if (todoList.containsKey(ID)) {
            todoList.remove(ID);
            System.out.printf("할 일이 삭제되었습니다. ID:%d%n", ID);
        } else {
            System.out.println("해당 ID의 할 일이 없습니다.");
        }
    }
    // 3.조회를 담당하는 메서드 referToDo
    public void referToDo(int ID) {

        if (todoList.containsKey(ID)) {
            todoList.get(ID);
            System.out.printf("할 일ID:%d 내용:%s%n", ID, todoList.get(ID));
        } else {
            System.out.println("해당 ID의 할 일이 없습니다.");
        }
    }

}


