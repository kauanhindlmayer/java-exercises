package entities;

public class Brand {
    private Integer id;
    private String name;

    private Model[] models;

    public Brand (Integer id, String name, Model[] models) {
        this.id = id;
        this.name = name;
        this.models = models;
    }

    public Brand () {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Model[] getModels() {
        return models;
    }

    public void setModels(Model[] models) {
        this.models = models;
    }
}
