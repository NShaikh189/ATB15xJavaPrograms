package Practice;

public class J_17_BuilderPattern {

     static void main() {
        J_17_BuilderPattern obj1 = new J_17_BuilderPattern();
        obj1.login().search().logout();
        System.out.println("-------------------");
        obj1.login().search().addToCart().order().payment().getOrderId().search().addToCart().order().payment().getOrderId().logout();
    }

    public J_17_BuilderPattern login() {
        System.out.println("Login successful");
        return this;
    }

    public J_17_BuilderPattern search() {
        System.out.println("Searching product");
        return this;
    }

    public J_17_BuilderPattern addToCart() {
        System.out.println("Product added to the Cart successfully");
        return this;
    }

    public J_17_BuilderPattern order() {
        System.out.println("Placing Order");
        return this;
    }

    public J_17_BuilderPattern payment() {
        System.out.println("Payment made successfully");
        return this;
    }

    public J_17_BuilderPattern getOrderId() {
        System.out.println("Order Id generated successfully");
        return this;
    }

    public J_17_BuilderPattern logout() {
        System.out.println("Logged out successfully");
        return this;
    }

}
