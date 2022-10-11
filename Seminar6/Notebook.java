package Seminar6;

public class Notebook {

    int id;
    int price;
    String RAM;
    String capacity;
    String brandName;
    String seriaType;
    String operationSys;
    String color;

    public Integer getId() {
        return id;
    }

    public Integer getPrice() {
        return price;
    }

    public String getCapacity() {
        return capacity;
    }

    public String getRAM() {
        return RAM;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getSeriaType() {
        return seriaType;
    }

    public String getOperationSys() {
        return operationSys;
    }

    public String getColor() {
        return color;
    }

    public void setData(int id, int price, String RAM, String capacity, String brandName, String seriaType,
            String operationSys, String color) {
        this.id = id;
        this.price = price;
        this.capacity = capacity;
        this.brandName = brandName;
        this.seriaType = seriaType;
        this.operationSys = operationSys;
        this.RAM = RAM;
        this.color = color;

    }

    @Override
    public String toString() {
        return String.format(
                " id:|%d|%n Бренд:|%s|%n Серия:|%s|%n Объем памяти:|%s|%n Объем жесткого диска:|%s|%n Операционная систему:|%s|%n Цвет:|%s|%n Стоимость:|%d|%n",
                id, brandName, seriaType, RAM, capacity, operationSys, color, price);

    }

    @Override
    public boolean equals(Object o) {
        Notebook t = (Notebook) o;
        return id == t.id && brandName == t.brandName;
    }

    @Override
    public int hashCode() {
        return id;
    }

}
