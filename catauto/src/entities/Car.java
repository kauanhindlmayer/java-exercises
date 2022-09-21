package entities;

public class Car {
    private Integer id;
    private Integer fabricationYear;
    private Integer modelYear;
    private String observations;
    private float price;
    private Integer kilometers;
    private Model model;

    public Car(Integer id, Integer fabricationYear, Integer modelYear, String observations, float price, Integer kilometers, Model model) {
        this.id = id;
        this.fabricationYear = fabricationYear;
        this.modelYear = modelYear;
        this.observations = observations;
        this.price = price;
        this.kilometers = kilometers;
        this.model = model;
    }

    public Car() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(Integer fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    public Integer getModelYear() {
        return modelYear;
    }

    public void setModelYear(Integer modelYear) {
        this.modelYear = modelYear;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getKilometers() {
        return kilometers;
    }

    public void setKilometers(Integer kilometers) {
        this.kilometers = kilometers;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }
}
