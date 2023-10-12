import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        Iterator<Integer> iterator1 = numbers.iterator();
        while(iterator1.hasNext()){
            int num = iterator1.next();
            System.out.println(num);
            if(num%2==0){
                iterator1.remove();
            }
        }
        System.out.println(numbers);   
    }
}
