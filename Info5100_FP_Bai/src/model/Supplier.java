/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 粥嘚嘚
 */
public class Supplier {

    private String supplyName;
    private ProductCatalog productCatalog;

//    public Supplier() {
//        productCatalog = new ProductCatalog();
//    }

    // 默认构造器
    public Supplier() {
        this.supplyName = "Default Supplier";
        this.productCatalog = new ProductCatalog(); // 初始化一个空的产品目录
    }

    // 带参数构造器
    public Supplier(String supplyName) {
        this.supplyName = supplyName;
        this.productCatalog = new ProductCatalog();
    }
    
    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    @Override
    public String toString() {
        return supplyName; 
    }

}
