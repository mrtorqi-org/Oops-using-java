class Product {
    int pcode;
    String pname;
    double price;

    Product(int pcode, String pname, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.price = price;
    }
}

class ProductMain {
    public static void main(String[] args) {

        Product product1 = new Product(1, "Laptop", 55000);
        Product product2 = new Product(2, "Smartphone", 35000);
        Product product3 = new Product(3, "Headphone", 5000);

        Product cheapestProduct;
        
        if (product1.price < product2.price && product1.price < product3.price) {
            cheapestProduct = product1;
        } 
        else if (product2.price < product1.price && product2.price < product3.price) {
            cheapestProduct = product2;
        } 
        else {
            cheapestProduct = product3;
        }

        System.out.println("The cheapest product is: " + cheapestProduct.pname + " with price RS." + cheapestProduct.price);
    }
}