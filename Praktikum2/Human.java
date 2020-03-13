class Human {
    
    String skinColor, name;
    int age;
    double weight, height;

    Human() {
        name = "Unnamed";
        skinColor = "Uncolored";
        age = 0;
        weight = 0;
        height = 0;
    }

    Human(int age, double weight, double height) {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    Human(String skinColor, String name) {
        this.name = name;
        this.skinColor = skinColor;
    }

    void rapping() {
        if (age <= 30 && skinColor.equals("Black")) {
            System.out.printf("%s is rapping really good...", name);
        } else {
            System.out.printf("%s is rapping really bad...", name);
        }
    }

    void sleep() {
        System.out.printf("%s is sleeping...", name);
    }

    void workOut() {
        if ((height * weight / 2) <= 25) {
            System.out.printf("%s doesn't need to work out...", name);
        } else {
            System.out.printf("%s really need to work out...", name);
        }
    }

}