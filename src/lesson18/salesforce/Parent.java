package lesson18.salesforce;


public class Parent {

   private Child[] children  = new Child[10];


    public void addChild(Child child) {
        for(int i = 0 ; i < children.length; i++) {
            if(children[i] == null) {
                children[i] = child;
                return;
            }
        }
    }

    public Child[] getChildren() {
        return children;
    }

    public int getSum() {
        int sum = 0;
        for(Child child : children) {
            if(child != null) {
                sum += child.getAmount();
            }
        }
        return sum;
    }
}
