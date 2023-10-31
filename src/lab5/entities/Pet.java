package lab5.entities;

public class Pet {
    private String name;
    private int id;
    private String species;
    private int age;
    private String sex;
    private String description;
    private String images;
    public enum TYPE {
        DOG,CAT;
    }
    private TYPE petType;
    private static int autoId = 0;
    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", description='" + description + '\'' +
                ", images='" + images + '\'' +
                '}';
    }

    public Pet() {
        this.id=++autoId;
    }

    public TYPE getPetType() {
        return petType;
    }

    public void setPetType(TYPE petType) {
        this.petType = petType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}
