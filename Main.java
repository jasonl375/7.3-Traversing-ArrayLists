import java.util.ArrayList;
public class Main {
    public static void main(String[]args){
        String[] words = {"its", "very", "late"};
        ArrayList<String> confession = new ArrayList<String>();
        for(String b: words) confession.add(b);
        int yabadoo = 0;
        while(yabadoo < 3)
        {
            System.out.println(confession.get(yabadoo));
            yabadoo++;
        }
        for(int i=0; i < confession.size() ; i++)
        {
            System.out.println(confession.get(i) + ". :(");
        }
        ArrayList<Integer> lucidDream = new ArrayList<Integer>();
        lucidDream.add(8);
        lucidDream.add(1);
        lucidDream.add(2);
        lucidDream.add(3);
        System.out.println(lucidDream);
        removeInts(lucidDream, 8);
        System.out.println(lucidDream);
    }
    public static void removeInts(ArrayList<Integer> ints, int element) {
        for (int i = ints.size() - 1; i >= 0; i--) {
            if (ints.get(i) == element) {
                ints.remove(i);
            }
        }
    }
}
