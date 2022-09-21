package entities;

public class Model {
    private Integer id;
    private String description;
    private Integer pow;
    private Brand brand;

    public Model (Integer id, String description, Integer pow, Brand brand) {
        this.id = id;
        this.description = description;
        this.pow = pow;
        this.brand = brand;
    }

    public Model() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPow() {
        return pow;
    }

    public void setPow(Integer pow) {
        this.pow = pow;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
