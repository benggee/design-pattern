package src.main.priciple.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = (ICourse) new JavaDiscountCourse(12, "java入门到精通", 248d);
        // 由于接口没有getDiscountPrice方法，所以需要进行一次强转
        JavaDiscountCourse javaCource = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID:" + javaCource.getId() + " 名称:" + javaCource.getName() + " 原价：" + javaCource.getPrice()+" 折后价：" + javaCource.getDiscountPrice());
    }
}
