package org.homework;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public enum SelectOption {
        ADD(1), DELETE(2), REFER(3);
        final private int num;

        public int getNum() {

            return num;
        }
        SelectOption(int num) {

            this.num = num;
        }
    }

    public static void main(String[] args)  {

        ToDoManager toDoManager = new ToDoManager();

        Scanner user = new Scanner(System.in); // 사용자에게 값 입력받을 때 사용
        boolean isTrue = true; //while문에 true/false값 대입, default는 true

        try{
            while (isTrue) {

                System.out.println("옵션을 선택해주세요.");
                System.out.println("1.추가");
                System.out.println("2.삭제");
                System.out.println("3.조회");
                System.out.println("4.종료");


                int selectOption = user.nextInt();
                user.nextLine();

                switch (selectOption) {

                    case 1:
                        System.out.println("추가 할 일을 입력해주세요.");
                        String todo = user.nextLine();
                        toDoManager.addToDo(todo);
                        break;

                    case 2:
                        System.out.println("삭제 하고싶은 할 일의 ID를 입력해주세요.");
                        int ID = user.nextInt();
                        toDoManager.deleteToDo(ID);
                        break;

                    case 3:
                        System.out.println("조회하고 싶은 할 일의 ID를 입력해주세요.");
                        ID = user.nextInt();
                        toDoManager.referToDo(ID);
                        break;

                    case 4:

                        isTrue = false;
                        System.out.println("프로그램을 종료합니다.");
                        break;

                    default:
                        System.out.println("1~4 중에서만 입력가능합니다.다시 시도해주세요.");

                }
            }

        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("문자는 입력할 수 없습니다. 입력값을 확인 후 프로그램을 재실행해주세요.");
            user.close();
        }

    }
}

