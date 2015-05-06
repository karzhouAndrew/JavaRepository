package lab14;

// Sum of array elements between max & min values

public class Lab14 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50 + 1);
        }
        arrayShow(array);
        int maxPos = maxArrayValuePos(array);
        int minPos = minArrayValuePos(array);
        int answer = 0;

        if (minPos < maxPos) {
            for (int i = minPos; i <= maxPos; i++) {
                answer += array[i];
            }
        } else if (minPos > maxPos) {
            for (int i = maxPos; i <= minPos; i++) {
                answer += array[i];
            }
        } else {
            answer = 0;
        }

        System.out.println("Maximum value = " + array[maxPos]);
        System.out.println("Minimum value = " + array[minPos]);
        System.out.println("Sum of array elements between max & min values is " + answer);
    }


    public static void arrayShow(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int maxArrayValuePos(int[] array) {
        int maxValuePos = 0;
        int maxValue = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxValuePos = i;
            }
        }
        return maxValuePos;
    }

    public static int minArrayValuePos(int[] array) {
        int minValuePos = 0;
        int minValue = 1000;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minValuePos = i;
            }
        }
        return minValuePos;
    }
}
