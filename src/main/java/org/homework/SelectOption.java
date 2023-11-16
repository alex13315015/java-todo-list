package org.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public enum SelectOption {

        ADD, DELETE, REFER, END;

    public static void main(String[] args) {
        ToDoManager toDoManager = new ToDoManager();

        Scanner user = new Scanner(System.in);


        boolean isTrue = true;

        try {
            while (isTrue) {

                System.out.println("옵션을 선택해주세요.");
                System.out.println("< 입력 주의사항 : 4가지 옵션만 입력해 주세요.>");
                System.out.println("ADD : 추가");
                System.out.println("DELETE : 삭제");
                System.out.println("REFER : 조회");
                System.out.println("END : 종료");

                String type = user.nextLine();
                SelectOption selectOption = SelectOption.valueOf(type);

                switch (selectOption) {

                    case ADD:
                        System.out.println("추가 할 일을 입력해주세요.");
                        String todo = user.nextLine();
                        toDoManager.addToDo(todo);
                        break;

                    case DELETE:
                        System.out.println("삭제 하고싶은 할 일의 ID를 입력해주세요.");
                        int ID = user.nextInt();
                        toDoManager.deleteToDo(ID);
                        break;

                    case REFER:
                        System.out.println("조회하고 싶은 할 일의 ID를 입력해주세요.");
                        ID = user.nextInt();
                        toDoManager.referToDo(ID);
                        break;

                    case END:

                        isTrue = false;
                        System.out.println("프로그램을 종료합니다.");
                        break;

                }
            }
        } catch (IllegalArgumentException e){
                    e.printStackTrace();
                    System.out.println("잘못된 입력사항입니다. 입력 주의사항을 확인 후 다시 실행해주세요.");
                    user.close();
        }
    }
}


