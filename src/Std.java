import java.util.TreeSet;

class Std implements Comparable<Std>{
    final static int N = 60;//константа для вывода оценок больше, чем она
    private String name;
    private int score;
    //конструктор класса
    Std(String name, int score){
        this.name = name;
        this.score = score;
    }
    //Инициализация трисета и заполнение его значениями
    public static void main(String[] args) {
        TreeSet<Std> students = new TreeSet<>();
        students.add(new Std("Alex", 69));
        students.add(new Std("John", 66));
        students.add(new Std("Alice", 47));
        students.add(new Std("Bongo", 88));
        
        for (Std s : students){
            if (s.score>N)
            System.out.println(s.name + " " + s.score);
        }
        System.out.println();
    }


    //Перегрузка метода сравнения, чтобы трисет мог отсортировать объекты
    @Override
    public int compareTo(Std o) {
        return Integer.compare(score, o.getScore());
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
