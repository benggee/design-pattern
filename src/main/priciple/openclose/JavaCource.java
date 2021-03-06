package src.main.priciple.openclose;

public class JavaCource implements ICourse {
    private Integer id;
    private String name;
    private Double price;

    public JavaCource(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
