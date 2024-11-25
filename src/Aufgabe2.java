/*
    Aufgabe 2) Eindimensionale Arrays
*/
public class Aufgabe2 {

    public static void ausgabeA(short[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (i == 0){
                System.out.print("|" + arr[i] + ";");
            }
            else if (i == arr.length-1){
                System.out.println(arr[i] + "|");
            }else{
                System.out.print(arr[i] + ";");
            }
        }
    }

    public static char[] ausgabeB(char[] arr){
        int oldSize = arr.length;
        int newSize = oldSize;
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1 && arr[i] == arr[i+1]){
                newSize++;
            }
        }
        char[] result = new char[newSize];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            result[index] = arr[i];
            index++;
            if(i < arr.length -1 && arr[i] == arr[i+1]){
                result[index] = '+';
                index++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        return result;

    }

    public static void ausgabeC(int[] arr){
        String resultFor = "for-Schleife: ";
        String resultWhile = "while-Schleife: ";

        //For-Schleife
        for (int i = arr.length - 1; i >= 0; i--) {
            if(i != 0){
                resultFor += arr[i] + "!";
            }else{
                resultFor += arr[i];
            }
        }

        //While-Schleife
        int index = arr.length - 1;
        while (index >= 0) {
            if(index != 0){
                resultWhile += arr[index] + "!";
            }else{
                resultWhile += arr[index];
            }
            index--;
        }
        //Ausgabe
        System.out.println(resultFor);
        System.out.println(resultWhile);
    }

    public static void main(String[] args) {
        short[] arrayShort = new short[]{3,6,24,31,35,44,67,73,89,92};
        ausgabeA(arrayShort);

        char[] arrayChar = new char[]{'a', '8', '8', 'G', '2', ':', ':', ':', 'F', '7', 'b', 'b', '-', 'T'};

        ausgabeB(arrayChar);
        System.out.println();

        int[] arrayInt = new int[20];
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            arrayInt[arrayInt.length - 1 - i] = i;
        }
        ausgabeC(arrayInt);

    }

}

