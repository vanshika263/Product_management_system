package collection;

import entity.product;

import java.util.ArrayList;

public class listOfItems {
    // for flexible in storing used array list
    ArrayList<product> productList=new ArrayList<>();

    public void addProduct(product product){
        productList.add(product);
        System.out.println("Product added successfully..");
    }

    public boolean removeProduct(int prodid){
        for(int i=0;i<productList.size();i++){
            product product=productList.get(i);
            if(product.id== prodid){
                productList.remove(product);
                return true;
            }
        }
        return false;
    }

    public boolean updateProduct(int prodid,double price){
        for(int i=0;i<productList.size();i++){
            product product=productList.get(i);
            if(product.id== prodid){
                product.price=price;
                productList.set(i,product);
                return true;
            }
        }
        return false;
    }

    public void displayProduct(){
        if(productList.size()==0){
            System.out.println("No product added yet");
            return;
        }
        System.out.println("id\tname\tqty\ttype\t\tprice");
        for(int i=0;i<productList.size();i++){
            product product=productList.get(i);
            System.out.print(product.id+"\t "+product.name+"\t "+product.quantity+"\t "+product.type+"\t "+product.price);
            System.out.println(" ");
        }
    }
}