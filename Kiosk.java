package problem.self_problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    // main 은 여기서만 가져다 쓰기
    public static void main(String[] args) {
        Product product = new Product(0, "coffee", 0.0, "detail");

        Screen screen = new Screen();
        Scanner sc = new Scanner(System.in);
        List<Product> orderList = new ArrayList<>();

        screen.mainMenu();
        screen.coffeeMenus();
        screen.nonCoffeeMenus();
        screen.cakeMenus();

        int orderMenu = 0;

        while (true) {
            screen.mainMenuOutput();
            int next = sc.nextInt();
            System.out.println();

            switch (next) {
                case 1: // 커피를 고름
                    screen.coffeeListOutput();
                    System.out.print("메뉴를 골라주세요 : ");
                    System.out.println();
                    orderMenu = sc.nextInt();

                    orderMenu -= 1;

                    product.setNum(screen.coffeeList.get(orderMenu).num);
                    product.setName(screen.coffeeList.get(orderMenu).name);
                    product.setPrice(screen.coffeeList.get(orderMenu).price);
                    product.setDetail(screen.coffeeList.get(orderMenu).detail);

                    System.out.println(String.format("%-15s", product.getName()) + "|" + String.format("%-6s", "W " + product.getPrice()) + "|" + product.getDetail());
                    orderList.add(new Product(product.getNum(), product.getName(), product.getPrice(), product.getDetail()));

                    System.out.println();
                    break;
                case 2:
                    screen.nonCoffeeMenusOutput();
                    System.out.print("메뉴를 골라주세요 : ");
                    System.out.println();
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
                    screen.cakeListOutput();
                    System.out.print("메뉴를 골라주세요 : ");
                    System.out.println();
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
                case 6:
                    break;
            }
            if (next == 6) {
                break;
            }
        }

        // set 설정
//        product.setName("boby");
//        System.out.println(product.name); // 둘다 동일한 값나옴
//        System.out.println(product.getName()); // 동일

//        String name = orderList.get(0).name;
//        double price = orderList.get(0).price;
//        String detail = orderList.get(0).detail;
//
//        for(Menu val: orderList){
//            System.out.println(String.format("%-15s",val.name) + "|" + val.detail);
//        }
//
//        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
//        System.out.println(String.format("%-10s","1. 확인") + String.format("%-10s","2. 취소"));

    }
}
