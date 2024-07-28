package client;

import java.util.Scanner;

import collection.listOfItems;
import entity.product;

public class testPMS {

    public static void displayMenu(){
        System.out.println("---------------------------------------------------");
        System.out.println("Choose an option");
        System.out.println("1. Add Product");
        System.out.println("2. Display Product");
        System.out.println("3. Remove Product");
        System.out.println("4. Update Product");
        System.out.println("5. Exit");
        System.out.println("----------------------------------------------------");
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        listOfItems productItems=new listOfItems();
        while (true) {
            displayMenu();  
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("Adding Product");
                System.out.println("Enter product id");
                int id=sc.nextInt();
                System.out.println("Enter product name");
                String name=sc.next();
                System.out.println("Enter product type");
                String type=sc.next();
                System.out.println("Enter product price");
                double price=sc.nextDouble();
                System.out.println("Enter product quantity");
                int quantity=sc.nextInt();
                product p1=new product(id, name, type, price, quantity);
                productItems.addProduct(p1);
            }        
            else if(choice==2){
                productItems.displayProduct();
            }        
            else if(choice==3){
                System.out.println("Enter product id to delete");
                int id=sc.nextInt();
                if(productItems.removeProduct(id)){
                    System.out.println("product deleted");
                }
                else{
                    System.out.println("could not delete the product");
                }
            }        
            else if(choice==4){
                System.out.println("Enter product id to update");
                int id=sc.nextInt();
                System.out.println("Enter product price to update");
                double price=sc.nextDouble();
                if(productItems.updateProduct(id,price)){
                    System.out.println("product updated successfully");
                }
                else{
                    System.out.println("could not update the product");
                }
            }        
            else{
                System.out.println("Thanks visting");
                break;
            }
        }
        sc.close();
    }
}
