package labs;

/**
 * Created by Kirilenko_MV on 02.05.2015.
 * Определить сумму элементов массива, расположенных между мин. и мах элементами
 */
public class Ex14 {
    public static void main(String[] args) {
        int[] marks = new int[20];
        for (int i = 0; i <marks.length ; i++) {
            marks[i] = (int)(Math.random()*10+1);
            System.out.print(" "+marks[i]);
        }
        System.out.println();
        int minMark = marks[0];
        int maxMark = marks[0];
        int minIndex =0;
        int maxIndex =0;
        for (int i = 1; i <marks.length ; i++) {
            if(minMark>marks[i]){
                minMark=marks[i];
                minIndex = i;
            }else if(maxMark<marks[i]){
                maxMark=marks[i];
                maxIndex = i;
            }
        }
        int result = 0;
        for (int i = minIndex+1; i <maxIndex ; i++) {
            result += marks[i];
            System.out.print(" + " + marks[i]);
        }
        System.out.println(" = "+result+"  индексы:"+minIndex+"; "+maxIndex);
    }
}
