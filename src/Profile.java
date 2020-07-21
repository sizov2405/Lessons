class Profile {
    private String firstName;
    private String lastName;
    private int age = 18;

    public void setAge (int age){
        if(age>18){
            this.age = age;
         //   return;
        }else{
            System.out.println("Age should be more or equal to 18");
        }
    }

    public String getFullProfileInfo(){
        return "First name: "+ firstName + " Last name: " + lastName + " Age: " + age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }
}
