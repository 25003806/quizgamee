/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VUSANI
 */
import java.util.Scanner;

public class Products {
    
    Scanner sc = new Scanner(System.in);
   
    String[] productCode = new String[100];
    String[] productName = new String[100];
    String[] category = new String[100];
    String[] warranty = new String[100];
    double[] price = new double[100];
    int[] stock = new int[100];
    String[] supplier = new String[100];

    int count = 0;
    
    public void DisplayMenu() {

    int option;

    do {

        System.out.println("************************************");
        System.out.println("EXTREME IT PRODUCTS");
        System.out.println("************************************");

        System.out.println("1. Capture Product");
        System.out.println("2. Search Product");
        System.out.println("3. Update Product");
        System.out.println("4. Delete Product");
        System.out.println("5. Print Report");
        System.out.println("6. Exit");

        System.out.print("Choose an option: ");
        option = sc.nextInt();
        sc.nextLine();

        switch(option){

            case 1:
                CaptureProduct();
                break;

            case 2:
                SearchProduct();
                break;

            case 3:
                UpdateProduct();
                break;

            case 4:
                DeleteProduct();
                break;

            case 5:
                PrintReport();
                break;

            case 6:
                ExitApplication();
                break;

            default:
                System.out.println("Invalid option.");

        }

    } while(option != 6);

}
    public void CaptureProduct(){
   System.out.println("\nCAPTURE PRODUCT");

    System.out.print("Enter Product Code: ");
    productCode[count] = sc.nextLine();

    System.out.print("Enter Product Name: ");
    productName[count] = sc.nextLine();

    // CATEGORY
    int choice;

    do {

        System.out.println("\nSelect Product Category");
        System.out.println("1. Desktop Computer");
        System.out.println("2. Laptop");
        System.out.println("3. Tablet");
        System.out.println("4. Printer");
        System.out.println("5. Gaming Console");
        System.out.print("Choice: ");

        choice = sc.nextInt();
        sc.nextLine();

        if(choice < 1 || choice > 5){
            System.out.println("Invalid Category. Please try again.");
        }

    }while(choice < 1 || choice > 5);

    switch(choice){

        case 1:
            category[count] = "Desktop Computer";
            break;

        case 2:
            category[count] = "Laptop";
            break;

        case 3:
            category[count] = "Tablet";
            break;

        case 4:
            category[count] = "Printer";
            break;

        case 5:
            category[count] = "Gaming Console";
            break;
    }

    // WARRANTY

    System.out.println("\nWarranty");
    System.out.println("1. 6 Months");
    System.out.println("2. 2 Years");
    System.out.print("Choice: ");

    int warrantyChoice = sc.nextInt();
    sc.nextLine();

    if(warrantyChoice == 1){
        warranty[count] = "6 Months";
    }
    else{
        warranty[count] = "2 Years";
    }

    // PRICE

    System.out.print("Enter Product Price: ");
    price[count] = sc.nextDouble();

    // STOCK

    System.out.print("Enter Stock Level: ");
    stock[count] = sc.nextInt();
    sc.nextLine();

    // SUPPLIER

    System.out.print("Enter Supplier: ");
    supplier[count] = sc.nextLine();

    count++;

    System.out.println("\nProduct successfully captured!\n");

}

public void SearchProduct(){
System.out.print("Enter Product Code to Search: ");
    String search = sc.nextLine();

    boolean found = false;

    for(int i = 0; i < count; i++){

        if(productCode[i].equalsIgnoreCase(search)){

            System.out.println("\nPRODUCT FOUND");
            System.out.println("Code: " + productCode[i]);
            System.out.println("Name: " + productName[i]);
            System.out.println("Category: " + category[i]);
            System.out.println("Warranty: " + warranty[i]);
            System.out.println("Price: R" + price[i]);
            System.out.println("Stock: " + stock[i]);
            System.out.println("Supplier: " + supplier[i]);

            found = true;
            break;
        }

    }

    if(!found){
        System.out.println("Product not found.");
    }

}

public void UpdateProduct(){
 System.out.print("Enter Product Code to Update: ");
    String search = sc.nextLine();

    boolean found = false;

    for(int i = 0; i < count; i++){

        if(productCode[i].equalsIgnoreCase(search)){

            found = true;

            System.out.println("Product Found!");

            System.out.print("Update Warranty? (Y/N): ");
            String answer = sc.nextLine();

            if(answer.equalsIgnoreCase("Y")){

                System.out.println("1. 6 Months");
                System.out.println("2. 2 Years");

                int choice = sc.nextInt();
                sc.nextLine();

                if(choice == 1){
                    warranty[i] = "6 Months";
                }else{
                    warranty[i] = "2 Years";
                }

            }

            System.out.print("Update Price? (Y/N): ");
            answer = sc.nextLine();

            if(answer.equalsIgnoreCase("Y")){

                System.out.print("Enter New Price: ");
                price[i] = sc.nextDouble();
                sc.nextLine();

            }

            System.out.print("Update Stock? (Y/N): ");
            answer = sc.nextLine();

            if(answer.equalsIgnoreCase("Y")){

                System.out.print("Enter New Stock: ");
                stock[i] = sc.nextInt();
                sc.nextLine();

            }

            System.out.println("Product Updated Successfully!");

            break;

        }

    }

    if(!found){
        System.out.println("Product not found.");
    }

}

public void DeleteProduct(){
System.out.print("Enter Product Code to Delete: ");
    String search = sc.nextLine();

    boolean found = false;

    for(int i = 0; i < count; i++){

        if(productCode[i].equalsIgnoreCase(search)){

            found = true;

            System.out.print("Are you sure? (Y/N): ");
            String answer = sc.nextLine();

            if(answer.equalsIgnoreCase("Y")){

                for(int j = i; j < count - 1; j++){

                    productCode[j] = productCode[j + 1];
                    productName[j] = productName[j + 1];
                    category[j] = category[j + 1];
                    warranty[j] = warranty[j + 1];
                    price[j] = price[j + 1];
                    stock[j] = stock[j + 1];
                    supplier[j] = supplier[j + 1];

                }

                count--;

                System.out.println("Product Deleted Successfully!");

            }

            break;

        }

    }

    if(!found){
        System.out.println("Product not found.");
    }

}

public void PrintReport(){
double total = 0;

    System.out.println("\n========== PRODUCT REPORT ==========");

    for(int i = 0; i < count; i++){

        ReportData report = new ReportData(

                productCode[i],
                productName[i],
                category[i],
                warranty[i],
                price[i],
                stock[i],
                supplier[i]

        );

        System.out.println("--------------------------------");

        System.out.println("Code      : " + report.getProductCode());
        System.out.println("Name      : " + report.getProductName());
        System.out.println("Category  : " + report.getCategory());
        System.out.println("Warranty  : " + report.getWarranty());
        System.out.println("Price     : R" + report.getPrice());
        System.out.println("Stock     : " + report.getStock());
        System.out.println("Supplier  : " + report.getSupplier());

        total += report.getPrice();

    }

    System.out.println("--------------------------------");
    System.out.println("Total Products : " + count);
    System.out.println("Total Value    : R" + total);

    if(count > 0){
        System.out.println("Average Value  : R" + (total / count));
    }
}

public void ExitApplication(){
    
    System.out.println("Thank you for using Extreme IT Products.");

}

}
