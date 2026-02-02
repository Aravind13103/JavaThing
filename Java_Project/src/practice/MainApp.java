package practice;

class Student {
    private int id;
    private String name;
    private double fee;

    public Student(int id, String name, double fee) {
        this.id = id;
        this.name = name;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        if (fee >= 0) {
            this.fee = fee;
        }
    }
}

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student(1, "Arjun", 5000);

        s.setFee(4500);

        System.out.println(s.getId());
        System.out.println(s.getName());
        System.out.println(s.getFee());
    }
}
