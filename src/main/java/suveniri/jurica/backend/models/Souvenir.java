package suveniri.jurica.backend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "souvenirs")
public class Souvenir {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String name;
    private float price;
    private int ordered;
    private int sold;

    public Souvenir(Long id, String name, float price, int ordered, int sold) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.ordered = ordered;
        this.sold = sold;
    }

    public Souvenir() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getOrdered() {
        return ordered;
    }

    public void setOrdered(int ordered) {
        this.ordered = ordered;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }
}
