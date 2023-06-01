package problem.self_problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// extendsExample package 보기
// superExample 도

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu(0,"coffee",0.0,"detail");
        // 기존 인스턴스는 () <- 빈괄호인데 Menu 클래스에서 public Menu로 선언한 값에 자료형이 들어있으면 맞춰 줘야함

        Scanner sc = new Scanner(System.in);

        List<Menu> mainMenus = new ArrayList<>();

        while (true){
            System.out.println("1메뉴 선택, 2메뉴 출력, 3종료");
            int userInput = sc.nextInt(); // 1
            boolean isExit = false;

            switch (userInput){
                case 1:
                    System.out.println("주문하실 메뉴를 선택하세요 1=커피, 2=맥주");
                    int menuSelection = sc.nextInt(); // 1
                    
                    if(menuSelection == 1){
                        //커피
                        Menu coffee = new Menu(1,"커피",5.0,"커피입니다.");
                        mainMenus.add(coffee);
                    } else if (menuSelection ==  2){
                        // 맥주
                        Menu beer = new Menu(2,"맥주",7.0,"맥주입니다");
                        mainMenus.add(beer);
                    } else {
                        System.out.println("잘 못 입력하셨습니다.");
                    }
                     break;
            }
            if(userInput == 3 ){
                break;
            }
        }
        System.out.println(menu.getName()); // coffee

        // 리스트에 있는 내용 아래 4줄 처럼 출력 해야함!!
        // https://lasbe.tistory.com/64
        String name = mainMenus.get(0).name; // 리스트 -> get(가져오기) -> name을 name으로 부르겠다
        double price = mainMenus.get(0).price;

        for(Menu val : mainMenus){
            System.out.println(val.name + val.price);
        }




    }
}
