package Day1.cycletask;

public class CycleTaskRunner {

    public static void main(String[] args) {
        WhileTask whileTask = new WhileTask();
        whileTask.printWithWhile();
        System.out.println();

        ForTask forTask = new ForTask();
        forTask.printWithFor();
        System.out.println();

        int arraySize = 7;
        CreateArray createArray = new CreateArray(arraySize);
        int[] array = createArray.createArray();

        PrintArray printArray = new PrintArray(array);
        printArray.printArray();

        PrintReversedArray printReversedArray = new PrintReversedArray(array);
        printReversedArray.printReversedArray();

        PrintArrayX5 printArrayX5 = new PrintArrayX5(array);
        printArrayX5.printArrayX5();

        PrintArraySquared printArraySquared = new PrintArraySquared(array);
        printArraySquared.printArraySquared();

        FindMin findMin = new FindMin(array);
        findMin.findMin();

        SwapFirstAndLast swapFirstAndLast = new SwapFirstAndLast(array);
        swapFirstAndLast.swapFirstAndLast();
        printArray.printArray();

        SortArray sortArray = new SortArray(array);
        sortArray.sortArray();
        printArray.printArray();
    }
}
