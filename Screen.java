package problem.self_problem3;

import java.util.ArrayList;
import java.util.List;
public class Screen {
    Product product = new Product(0,"coffee",0.0,"detail");
    List<Menu> mainMenus = new ArrayList<>();

    public void MainMenu(){
        mainMenus.add(new Menu(1,"Coffee","다양한 원두가 있는 커피"));
        mainMenus.add(new Menu(2,"NonCoffee","프라페, 차 등의 다양한 음료"));
        mainMenus.add(new Menu(3,"Cake","투썸만에 오리지널 케잌과 계절감 있는 다양한 케이크"));

        System.out.println("TWOSOME PLACE 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[TWOSOME MENU]");

        int num = mainMenus.get(0).num;
        String name = mainMenus.get(0).name;
        String detail = mainMenus.get(0).detail;

        for(Menu val: mainMenus){
            System.out.println(val.num + " . " + String.format("%-10s",val.name) + "|" + val.detail);
        }
        System.out.print("메뉴를 골라주세요 : ");
    }

    List<Product> coffeeList = new ArrayList<>();
    List<Product> nonCoffeeList = new ArrayList<>();
    List<Product> cakeList = new ArrayList<>();

 //위에 내용은 그냥 출력하고 아래만 바뀌도록 가능?
    public void coffeeMenus() {
        coffeeList.add(new Product(1, "Americano", 4.5, "진하게 로스팅한 커피 원두를 사용한 커피"));
        coffeeList.add(new Product(2, "Cafe latte", 5.0, "풍부하고 진한 농도의 에스프레소와 스팀밀크가 들어간 따듯한 라떼"));
        coffeeList.add(new Product(3, "Einspanner", 6.1, "부드러운 라떼에 더욱 부드러운 크림을 듬뿍얹은 라떼타입 아인슈페너"));
        coffeeList.add(new Product(4, "Cold brew", 6.0, "우유, 연유, 생크림을 넣어 달콤하게 카페인을 충전할 수 있는 콜드브루 라떼"));

        int num = coffeeList.get(0).num;
        String name = coffeeList.get(0).name;
        double price = coffeeList.get(0).price;
        String detail = coffeeList.get(0).detail;

        System.out.println("TWOSOME PLACE 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[COFFEE MENU]");

        for(Menu val: coffeeList){
            System.out.println(val.num + " . " + String.format("%-15s",val.name) + "|" + val.detail);
        }
        System.out.println();
        System.out.println("5. 주문완료");
    }

    public void nonCoffeeMenus() {
        nonCoffeeList.add(new Product(1, "chocolate latte", 6.0, "초콜릿의 풍부한 맛과 초코칩이 조화로운 달콤한 초콜릿 음료"));
        nonCoffeeList.add(new Product(2, "peach ade", 6.0, "천도 복숭아를 듬뿍 넣어 아삭한 식감이 그대로 느껴지는 달콤하고 청량한 과일 에이드"));
        nonCoffeeList.add(new Product(3, "Lemon chamomile", 6.3, "상큼한 레몬청에 은은한 카모마일을 더하고, 라즈베리로 색을 낸 봄의 싱그러움을 그대로 담은 티"));
        nonCoffeeList.add(new Product(4, "yogurt", 5.8, "요거 파우더와 우유가 조화된 깔끔하고 상큼한 맛의 요거트 아이스 블렌디드"));

        int num = nonCoffeeList.get(0).num;
        String name = nonCoffeeList.get(0).name;
        double price = nonCoffeeList.get(0).price;
        String detail = nonCoffeeList.get(0).detail;

        System.out.println("TWOSOME PLACE 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[NONCOFFEE MENU]");

        for(Menu val: nonCoffeeList){
            System.out.println(val.num + " . " + String.format("%-15s",val.name) + "|" + val.detail);
        }
        System.out.println();
        System.out.println("5. 주문완료");
    }

    public void cakeMenus() {
        cakeList.add(new Product(1,"cookie&cream",6.5,"촉촉한 초코시트와 묵직한 블랙 초코시트가 있는 달콤한 쿠키앤크림 케이크"));
        cakeList.add(new Product(2,"Red velvet",6.5,"붉은 컬러 시트에 고소한 버터 크림치즈의 투썸 대표 구움 케이크"));
        cakeList.add(new Product(3,"Cheesecake",5.9,"부드럽고 촉촉한 식감과 진한 치즈의 향의 구움치즈 케이크"));
        cakeList.add(new Product(4,"chocolatecake",6.5,"부드러운 초코 시트에 벨기에산 다크&밀크 초콜릿 가나슈의 초콜릿 케이크"));

        int num = cakeList.get(0).num;
        String name = cakeList.get(0).name;
        double price = cakeList.get(0).price;
        String detail = cakeList.get(0).detail;

        System.out.println("TWOSOME PLACE 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println();
        System.out.println("[CAKE MENU]");

        for(Menu val: cakeList){
            System.out.println(val.num + " . " + String.format("%-15s",val.name) + "|" + val.detail);
        }
        System.out.println();
        System.out.println("5. 주문완료");
    }










//     "SHAKESHACK BURGER 에 오신걸 환영합니다."
//    아래 상품메뉴판을 보시고 상품을 골라 입력해주세요.
//
//[ Burgers MENU ]
// 1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
//2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
//3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거
//3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
//4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거




}
