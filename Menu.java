package problem.self_problem3;

//10:40 ~ 11:40/11:55

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {
    String name;
    String detail;
    double price;
    int num;

    Menu() {}
    Menu(int num, String name,String detail) {
        this.num = num;
        this.name = name;
        this.detail = detail;
    }

    Map<Integer, String> intMap = new HashMap<>();

}

