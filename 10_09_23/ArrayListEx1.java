import java.util.ArrayList;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Amy");
        students.add("Bod");
        students.add("Cindy");
        students.add("David");
        students.set(0,"Nick");
        students.set(1, "Mike");
        students.remove(3);
        for(int i = 0;i<students.size();i++){
            System.out.println(students.get(i));
        }
        System.out.println("the number of students is: "+students.size());
    }
    
}
