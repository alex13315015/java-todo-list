package org.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ToDoList {

    public static void main(String[] args) {

        Map<Integer,String> todoList = new HashMap<>();
        
        int ID = 0;
        String todo = null;
        
        //key,value값 설정

        Scanner in = new Scanner(System.in); // 사용자에게 값 입력받을 때 사용

        int option = 0; // 옵션 값 
        boolean bool = true; //while문에 true/false값 대입, default는 true

        while(bool) {
            System.out.println("옵션을 선택해주세요.");
            System.out.println("1.추가");
            System.out.println("2.삭제");
            System.out.println("3.조회");
            System.out.println("4.종료");

            option = in.nextInt();
            in.nextLine();

            switch (option) {
                case 1:

                    System.out.println("추가 할 일을 입력해주세요.");

                    todo = in.nextLine();
                    ID += 1;
                    todoList.put(ID,todo);
                    //System.out.println(todoList);
                    System.out.printf("할 일이 추가되었습니다. %d:%s%n",ID,todo);
                    break;

                case 2:

                    System.out.println("삭제 하고싶은 할 일의 ID를 입력해주세요.");

                    ID = in.nextInt();

                    if(todoList.containsKey(ID)) {
                        todoList.remove(ID);
                        System.out.printf("할 일이 삭제되었습니다. ID:%d%n", ID);
                    } else {
                        System.out.println("해당 ID의 할 일이 없습니다.");
                    }
                    break;

                case 3:

                    System.out.println("조회하고 싶은 할 일의 ID를 입력해주세요.");

                    ID = in.nextInt();

                    if(todoList.containsKey(ID)) {
                        todoList.get(ID);
                        System.out.printf("할 일ID:%d 내용:%s%n" , ID , todoList.get(ID));
                    }else {
                        System.out.println("해당 ID의 할 일이 없습니다.");
                    }
                    break;

                case 4:

                    if(option == 4) {
                        bool = false;
                        System.out.println("프로그램을 종료합니다.");
                        break;
                    }
            }

        }
    }
}
