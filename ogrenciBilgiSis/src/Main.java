public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "530 000 0000");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "000");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "007");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        //tarih.addTeacher(t2);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Dogukaan", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100, 70, 50);
        s1.isPass();

        Student s2 = new Student("Patika", "333", "3", tarih, fizik, biyo);
        s2.addBulkExamNote(20, 60, 80);
        s2.isPass();
    }
}