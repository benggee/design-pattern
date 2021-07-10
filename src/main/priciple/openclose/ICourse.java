package src.main.priciple.openclose;

// 接口方法应该是稳定的，不能轻易改动
public interface ICourse {
    Integer getId();
    String getName();
    Double getPrice();
}
