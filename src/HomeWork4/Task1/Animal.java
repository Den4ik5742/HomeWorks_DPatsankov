package HomeWork4.Task1;

public abstract class Animal {
    protected String name;
    protected String type;
    protected String family;
    protected String breed;

    public Animal(String name, String type, String family, String breed) {
        this.name = name;
        this.type = type;
        this.family = family;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public abstract void speak();
}
