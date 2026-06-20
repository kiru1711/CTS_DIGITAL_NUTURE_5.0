package AlgorithmDataStructures;
import java.util.*;
class Product{
    int productId;
    String productName;
    String category;
    Product(int productId, String productName, String category){
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}
public class ECommerceSearch{
    //Linear Search
    public static Product linearSearch(Product[] products,int id){
        for(Product product: products){
            if(product.productId == id){
                return product;
            }
        }
        return null;
    }
    //Binary Search
    public static Product binarySearch(Product[] products,int id){
        int left = 0;
        int right = products.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(products[mid].productId == id){
                return products[mid];
            }
            else if(products[mid].productId < id){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return null;
}

public static void main(String[]args){
    Product[] products = {
        new Product(1, "Laptop", "Electronics"),
        new Product(2, "Smartphone", "Electronics"),
        new Product(3, "Table", "Furniture"),
        new Product(4, "Chair", "Furniture"),
        new Product(5, "Headphones", "Electronics")
    };
    
    Product result = linearSearch(products, 3);
    if(result != null){
        System.out.println("Product found: " + result.productName);
    } else {
        System.out.println("Product not found");
    }
    // For binary search, the products array must be sorted by productId
    Arrays.sort(products, Comparator.comparingInt(p -> p.productId));
    result = binarySearch(products, 3);
    if(result != null){
        System.out.println("Product found: " + result.productName);
    } else {
        System.out.println("Product not found");
    }
}
}
/* OUTPUT :
Product found: Table
Product found: Table */
/* Time Complexity: O(n) for linear search and O(log n) for binary search
O(log n) < O(n) 
So binary search is more efficient suitable for this use case */