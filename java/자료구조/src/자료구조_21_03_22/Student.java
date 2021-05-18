package src.자료구조_21_03_22;

public class Student {
    private int id;
    private String name;
    private int score;

    public int getScore(){
        return score;
    }
    public class StudentList {
        private Student[] sts;
        private int size;

        public StudentList() {
            sts = new Student[100];
            size = 0;
        }


        public void add(Student s) {
            sts[size] = s;
            size++;
        }

        public Student getByid(int id){
            for(int i = 0; i < size; i++){
                if(sts[i].id == id){
                    return sts[size];
                }
            }
            return null;
        }

        public Student getByname(String nm){
            for(int i = 0; i < size; i++){
                if(sts[i].name == nm){
                    return sts[size];
                }
            }
            return null;
        }

        public void sortByScore(){
            for(int i = 0; i < size; i++){
                for(int j = 0; j < size; j++){
                    if(sts[i].getScore() < sts[j].getScore()){
                        Student temp = sts[i];
                        sts[i] = sts[j];
                        sts[j] = temp;
                    }
                }
            }
        }
    }
}
