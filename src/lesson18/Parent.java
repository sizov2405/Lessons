package lesson18;

public class Parent {

    private static final Children [] childrenStorage = new Children[100];

    public void addToChildren(Children children){
        for(int i = 0; i<childrenStorage.length; i++ ){
            if (childrenStorage [i] == null){
                childrenStorage [i] = children;
                return;
            }
        }
    }

    public int getTotalAmount(){
        int result = 0;
        for(int i = 0; i<childrenStorage.length; i++ ){
            if (childrenStorage [i] != null){
                result += childrenStorage [i].getAmount();
            }
        }
        return result;
    }
}
