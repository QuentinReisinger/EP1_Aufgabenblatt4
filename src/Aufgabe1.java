/*
    Aufgabe 1) Code Analyse - Eindimensionale Arrays
*/
public class Aufgabe1 {

    private static void printArray(int[] workArray) {
        for (int i = workArray.length; i > 0; i--) {
            System.out.print(workArray[i-1] + " ");
        }
        System.out.println();
    }

    private static void fillArray(int[] filledArray) {
        int number = 3;
        for (int i = 0; i < filledArray.length; i++) {
            filledArray[i] = number;
            number += 3;
        }
    }

    private static void printContentFilteredArray(int[] workArray) {
        int[] copiedArray = workArray;
        for (int i = 0; i < copiedArray.length; i++) {
            if (copiedArray[i] % 9 == 0) {
                copiedArray[i] = -1;
            }
        }
        printArray(copiedArray);
    }

    private static void fillArrayWithNewContent(int[] workArray) {
        int[] helpArray = new int[15];
        int number = 4;
        for (int i = 0; i < helpArray.length; i++) {
            helpArray[i] = number;
            number += 4;
        }
        workArray = helpArray;
        printArray(workArray);
    }

    public static void main(String[] args) {
        int[] filledArray = new int[15];
        fillArray(filledArray);
        printArray(filledArray);

        printContentFilteredArray(filledArray);
        printArray(filledArray);

        filledArray[0] = 123;
        printArray(filledArray);

        fillArrayWithNewContent(filledArray);
        printArray(filledArray);
    }

    //**************************************************************************
    //**** Notizen und Fragebeantwortungen bitte hier unterhalb durchführen! ***
    //**************************************************************************
    //Antwort zu Punkt a:
    //Es kommt zu dem Fehler, dass der index -1 ist und das ist bei einem Array nicht möglich. Wenn man in der Schleife auf i > 0 ändert ist der Fehler beseitigt.
    //Antwort zu Punkt b:
    //Für das Befüllen muss man nichts returnen. Ein Array ist eine Referenz und diese wird direkt verändert.
    //Antwort zu Punkt c:
    //Mit einem = wird nur eine Referenz auf das ursprüngliche Array gesetzt. copiedArray zeigt auf die selbe Speicherstelle wie workArray, man ändert also das workArray
    //Antwort zu Punkt d:
    //workArray ist eine lokale Variable und auch eine lokale Referenz, die ändert nicht das eigentliche Array

    /* Zusatzfragen
    1. Welchen Datentyp muss der Indexausdruck haben, mit dem die Position in einem Array
       bestimmt wird?
    A: Integer und alles was in ein integer automatisch konvertiert wird

    2. Wie kann die Länge eines Arrays verändert werden?
    A: Neues Array erstellen mit gewünschter Größe und die alten Werte reinkopieren.

    3. Wie gehen Sie vor, wenn Sie ein int-Array kopieren mussen?
    A: Mit System.arraycopy

    4. Ist es sinnvoll, zwei Arrays mit "==" zu vergleichen? Was passiert im Detail bei einem Vergleich mit "=="?
    A: Nein ist nicht sinnvoll, == überprüft ob die Arrays auf den selben Speicherbereich zeigen. Mit Arrays.equals() kann man vergleichen.
    */
}
