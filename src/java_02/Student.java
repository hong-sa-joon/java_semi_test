package java_02;

    public class Student {
        public static void main(String[] args) {
            Student student = new Student();
            System.out.println(student.getTotal());
            System.out.println(    student.getAverage());
        }
        String name = "김철수"; //학생 이름
        int ban = 1;   //반
        int no = 10;   //번호
        int kor = 90;  //국어점수
        int eng = 70;  //영어점수
        int math = 85; //수학점수

        private int Total;
        private double Average;

        public int getTotal() {
            Total=kor+eng+math;
            return Total;
        }

        public double getAverage() {
            Average=(double) Total/3;
            return Average;
        }

        @Override
        public String toString() {
            return name+" "+ban+" "+no;
        }
    }
