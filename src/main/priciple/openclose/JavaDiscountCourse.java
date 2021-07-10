package src.main.priciple.openclose;

// 通过继承的方式来增加新功能，页不是直接修改接口方法
public class JavaDiscountCourse extends JavaCource {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id,name,price);
    }

    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }
}
