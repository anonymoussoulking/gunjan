public class Tutorial9 {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.name = "alice";
        s2.name = "bob";
        s3.name = "classy";

        s1.marks = 10;
        s2.marks = 8;
        s3.marks = 9;

        s1.rollno = 21;
        s2.rollno = 22;
        s3.rollno = 23;

        Student stdnt[] = new Student[3];

        stdnt[0] = s1;
        stdnt[1] = s3;
        stdnt[2] = s2;

        for (int i =0 ; i < 3 ; i ++)
        {
            System.out.println(stdnt[i].name+" "+ stdnt[i].rollno+" "+ stdnt[i].marks);

        }

    }
}
