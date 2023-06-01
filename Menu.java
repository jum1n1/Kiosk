package problem.self_problem3;

//10:40 ~ 11:40/11:55

public class Menu {
    String name;
    String detail;
    double price;
    int num;

    // 이 클래스에 num을 가르킴
    public Menu(int num, String name, double price, String detail){
        this.num = num;
        this.name = name;
        this.price = price;
        this.detail = detail;
    }

    // 외부에 보낼 수 있는 name을 세팅(set)함
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


}

