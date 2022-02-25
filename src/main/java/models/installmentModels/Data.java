
package models.installmentModels;

import java.util.List;

public class Data {
    private Object categoryName;
    private List<Product> products;
    private Object filter;
    private Object banners;
    private Object branch;
    private Object message;
    private long productCount;
    private Object title;
    private boolean isAlternate;
    private Object storeId;

    public Object getCategoryName() { return categoryName; }
    public void setCategoryName(Object value) { this.categoryName = value; }

    public List<Product> getProducts() { return products; }
    public void setProducts(List<Product> value) { this.products = value; }

    public Object getFilter() { return filter; }
    public void setFilter(Object value) { this.filter = value; }

    public Object getBanners() { return banners; }
    public void setBanners(Object value) { this.banners = value; }

    public Object getBranch() { return branch; }
    public void setBranch(Object value) { this.branch = value; }

    public Object getMessage() { return message; }
    public void setMessage(Object value) { this.message = value; }

    public long getProductCount() { return productCount; }
    public void setProductCount(long value) { this.productCount = value; }

    public Object getTitle() { return title; }
    public void setTitle(Object value) { this.title = value; }

    public boolean getIsAlternate() { return isAlternate; }
    public void setIsAlternate(boolean value) { this.isAlternate = value; }

    public Object getStoreId() { return storeId; }
    public void setStoreId(Object value) { this.storeId = value; }
}