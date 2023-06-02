package problem.self_problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // main 은 여기서만 가져다 쓰기
    public static void main(String[] args) {

        Screen screen = new Screen();
        Scanner sc = new Scanner(System.in);
        List<Product> orderList = new ArrayList<>();

        // 빼내는 리스트 방법이 있고
        // 그놈에 get은 언제쓰지

        int orderMenu = 0;

        screen.totalMenu();

        while (true) {
            screen.MainMenu();
            int next = sc.nextInt();
            System.out.println();

            switch (next) {
                case 1: // 커피를 고름
                    screen.coffeeMenus();
                    System.out.print("메뉴를 골라주세요 : ");
                    orderMenu = sc.nextInt();

                    if (orderMenu == 1) { // 커피 메뉴1
                        orderList.add(screen.coffeeList.get(0));
                    } else if (orderMenu == 2) {
                        orderList.add(screen.coffeeList.get(1));
                    } else if (orderMenu == 3) {
                        orderList.add(screen.coffeeList.get(2));
                    } else {
                        orderList.add(screen.coffeeList.get(3));
                    }
                    break;
                case 2:
                    screen.nonCoffeeMenus();
                    System.out.print("메뉴를 골라주세요 : ");
                    orderMenu = sc.nextInt();

                    if (orderMenu == 1) {
                        orderList.add(screen.nonCoffeeList.get(0));
                    } else if (orderMenu == 2) {
                        orderList.add(screen.nonCoffeeList.get(1));
                    } else if (orderMenu == 3) {
                        orderList.add(screen.nonCoffeeList.get(2));
                    } else {
                        orderList.add(screen.nonCoffeeList.get(3));
                    }
                    break;
                case 3:
                    screen.cakeMenus();
                    System.out.print("메뉴를 골라주세요 : ");
                    orderMenu = sc.nextInt();

                    if (orderMenu == 1) {
                        orderList.add(screen.cakeList.get(0));
                    } else if (orderMenu == 2) {
                        orderList.add(screen.cakeList.get(1));
                    } else if (orderMenu == 3) {
                        orderList.add(screen.cakeList.get(2));
                    } else {
                        orderList.add(screen.cakeList.get(3));
                    }
                    break;
                case 4:
                    System.out.println("장바구니");
                    break;
                case 5:
                    System.out.println("주문 취소");
                    break;
                default:
                    System.out.println("메뉴를 다시 선택해주세요");
            }
            if (orderMenu == 3) {
                break;
            }
        }
    }
}
