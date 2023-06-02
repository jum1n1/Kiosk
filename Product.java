package problem.self_problem3;

public class Product extends Menu{

    // 이 클래스에 num을 가르킴
    public Product(int num, String name, double price, String detail){
        this.num = num;
        this.name = name;
        this.price = price;
        this.detail = detail;
    }

    // 외부에 보낼 수 있는 name을 세팅(set)함

    public void setNum(int num){
        this.num = num;
    }
    public int getNum(){
        return num;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    public void setDetail(String detail){
        this.detail = detail;
    }
    public String getDetail(){
        return detail;
    }

}
