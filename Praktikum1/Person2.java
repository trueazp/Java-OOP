/**
 * Person2
 */
public class Person2 {
    
    String name;
    int age;
    boolean isMale;
    
    // setter
    void setAge() {
        age = Integer.bitCount(age);
    }
    
    void setName() {
        name = name.toUpperCase();
    }
    
    void setGender() {
        isMale = isMale;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }

    String getGender() {
        if (!isMale) {
            return "Female";
        } else {
            return "Male";
        }
    }

    void desc() {
        System.out.printf("Name \t: %s\n", getName());
        System.out.printf("Gender \t: %s\n", getGender());
        System.out.printf("Age \t: %d", getAge());
    }

    public static void main(String[] args) {
        
        Person2 p1 = new Person2();
        p1.name = "person1";
        p1.age = 20;
        p1.isMale = true;
        p1.setName();
        p1.setAge();
        p1.setGender();
        p1.desc();


    }

}