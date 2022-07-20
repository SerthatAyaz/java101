package StudentInformation;
public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("mahmut hoca", "Tarih", "+905333333333");
        Teacher t2 = new Teacher("grhml", "fizik", "+905555555555");
        Teacher t3 = new Teacher("ahmet", "biyoloji", "+90777777777");

        Course tarih = new Course("Tarih", "101", "Tarih");
        tarih.addTeacher(t1);

        Course fizik = new Course("fizik", "102","Fizik");
        fizik.addTeacher(t2);

        Course biyo = new Course("biyoloji","103", "biyoloji");
        biyo.addTeacher(t3);

        Student s1 = new Student("şaban ", "123","4", tarih, fizik,biyo);
        s1.addBulExampleNote(100,200,50);
        s1.isPass();

        Student s2 = new Student("necmi ", "124","4", tarih, fizik,biyo);
        s1.addBulExampleNote(100,50,50);
        s2.isPass();
    }
}
