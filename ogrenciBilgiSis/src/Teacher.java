public class Teacher {
    String name, mpNo, branch;

    Teacher(String name, String branch, String mpNo) {
        this.name = name;
        this.branch = branch;
        this.mpNo = mpNo;
    }

    void print() {
        System.out.println("Adı : " + this.name);
        System.out.println("Telefonu : " + this.mpNo);
        System.out.println("Bölümü : " + this.branch);
    }

}
