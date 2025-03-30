package suveniri.jurica.backend.dto;

public class SouvenirUpdateDto {

    private String name;
    private float price;
    private int ordered;
    private int sold;
    private Integer newBatch;

    public SouvenirUpdateDto(String name, float price, int ordered, int sold, Integer newBatch) {
        this.name = name;
        this.price = price;
        this.ordered = ordered;
        this.sold = sold;
        this.newBatch = newBatch;
    }

    public SouvenirUpdateDto() {
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

    public Integer getNewBatch() {
        return newBatch;
    }

    public void setNewBatch(Integer newBatch) {
        this.newBatch = newBatch;
    }
}
