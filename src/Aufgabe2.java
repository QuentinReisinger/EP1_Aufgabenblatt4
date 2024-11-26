/*
    Aufgabe 2) Eindimensionale Arrays
*/
public class Aufgabe2 {

    /*public static void ausgabeA(short[] arr){
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
    }*/

    public static void main(String[] args) {

        //a
        short[] arrayShort = new short[]{3,6,24,31,35,44,67,73,89,92};
        for (int i = 0; i < arrayShort.length; i++) {
            if (i == 0){
                System.out.print("|" + arrayShort[i] + ";");
            }
            else if (i == arrayShort.length-1){
                System.out.println(arrayShort[i] + "|");
            }else{
                System.out.print(arrayShort[i] + ";");
            }
        }


        //b
        char[] arrayChar = new char[]{'a', '8', '8', 'G', '2', ':', ':', ':', 'F', '7', 'b', 'b', '-', 'T'};

        int oldSize = arrayChar.length;
        int newSize = oldSize;
        for (int i = 0; i < arrayChar.length; i++) {
            if(i < arrayChar.length - 1 && arrayChar[i] == arrayChar[i+1]){
                newSize++;
            }
        }
        char[] result = new char[newSize];
        int index = 0;

        for (int i = 0; i < arrayChar.length; i++) {
            result[index] = arrayChar[i];
            index++;
            if(i < arrayChar.length -1 && arrayChar[i] == arrayChar[i+1]){
                result[index] = '+';
                index++;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();


        //c
        int[] arrayInt = new int[20];
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            arrayInt[arrayInt.length - 1 - i] = i;
        }
        String resultFor = "for-Schleife: ";
        String resultWhile = "while-Schleife: ";

        //For-Schleife
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            if(i != 0){
                resultFor += arrayInt[i] + "!";
            }else{
                resultFor += arrayInt[i];
            }
        }

        //While-Schleife
        int indexC = arrayInt.length - 1;
        while (indexC >= 0) {
            if(indexC != 0){
                resultWhile += arrayInt[indexC] + "!";
            }else{
                resultWhile += arrayInt[indexC];
            }
            indexC--;
        }
        //Ausgabe
        System.out.println(resultFor);
        System.out.println(resultWhile);

    }

}

