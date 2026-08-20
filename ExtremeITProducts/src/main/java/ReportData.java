/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VUSANI
 */
public class ReportData {

    private String productCode;
    private String productName;
    private String category;
    private String warranty;
    private double price;
    private int stock;
    private String supplier;

    public ReportData(String productCode, String productName, String category,
            String warranty, double price, int stock, String supplier) {

        this.productCode = productCode;
        this.productName = productName;
        this.category = category;
        this.warranty = warranty;
        this.price = price;
        this.stock = stock;
        this.supplier = supplier;

    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public String getWarranty() {
        return warranty;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getSupplier() {
        return supplier;
    }

}
