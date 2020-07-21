package social;

public class Cat {
    private String name = "Murzik";
    private int age = 5;
    private String color = "White";
    private int visitCount = 0;
    private boolean isHungry = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void feed (){
        isHungry = false;
    }

    public void goodMorning (){
        System.out.println(catHappiness());
    }

    private String catHappiness (){
        if(isHungry) {
            return "Myau";
        }
            return "Hello";
    }

    public void goingToTheVet() {
        visitCount++;

        if (visitCount == 1) {
            System.out.println("First visit to the vet?");
        }
        if (visitCount == 2) {
            System.out.println("Oh, hi again " + name);
        }
        if (visitCount > 2) {
            System.out.println("Welcome again, sweety");
        }

//        switch (visitCount){
//            case 1:
//                System.out.println("First visit to the vet?");
//                break;
//            case 2:
//                System.out.println("Oh, hi again " + name);
//                break;
//            case 3:
//                System.out.println("Welcome again, sweety");
//                break;
//        }
    }

}

