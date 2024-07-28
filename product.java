package entity;

public class product {
    public int id;
    public String name;
    public String type;
    public double price;
    public int quantity;

    public product(int id,String name,String type,double price,int quantity){
        super();
        this.id=id;
        this.name=name;
        this.type=type;
        this.price=price;
        this.quantity=quantity;
    }

    @Override
    public String toString() {
        return "Product detail[id="+id+", name="+name+", type="+type+", price="+price+", quantity="+quantity+"]";
    }
}
