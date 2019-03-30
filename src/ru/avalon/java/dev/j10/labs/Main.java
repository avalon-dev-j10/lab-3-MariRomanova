package ru.avalon.java.dev.j10.labs;
import ru.avalon.java.dev.j10.labs.initialization.*;
import ru.avalon.java.dev.j10.labs.sort.*;

public class Main {

    public static void main(String[] args) {
        //int[] array;

	    /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Создать массив из 20 целых чисел и адресовать
	     *    его с сохранить ссылку в переменную array.
	     */
		int[] array = new int[20];

	     /* 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     */

		FibonacciInitializer fibonacci = new FibonacciInitializer();
		fibonacci.initialize(array);

		System.out.print ("Фибоначчи: ");
		for (int i = 0;  i < array.length; i++) {
			System.out.print(array[i] + " ");}
		System.out.println();

		/* 2. Найти сумму элементов массива.
	     */

		int sum = 0;
		for (int a = 0; a < array.length; a++){
			sum += array[a];
		}
		System.out.println("Сумма = " + sum);

		/* 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     */

		RandomInitializer random = new RandomInitializer(-50, 50);
		random.initialize(array);

		/* 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     */

		int[] bubbleArr = new int[20];
		random.initialize(bubbleArr);

		System.out.println("\nДо сортировки пузырьком: ");
		for ( int j=0; j<bubbleArr.length; j++)
			System.out.print (bubbleArr[j] + " ");

		BubbleSort bubble = new BubbleSort();
		bubble.sort(bubbleArr);

		System.out.println("\n После сортировки пузырьком: ");
		for (int c: bubbleArr){
			System.out.print(c + " ");
		}

		/* 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         */
		int[] selectArr = new int[20];
		random.initialize(selectArr);

        /* 6. Отсортировать массив с использованием
         *    сортировки выбором.
         */

		System.out.println("\n \nДо сортировки выбором: ");

		for ( int j=0; j<selectArr.length; j++)
			System.out.print (selectArr[j] + " ");

		SelectionSort select = new SelectionSort();
		select.sort(selectArr);

		System.out.println("\nПосле сортировки выбором: ");
		for (int c: selectArr){
			System.out.print(c + " ");
		}

         /* 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         */
		int[] shellArr = new int[20];
		random.initialize(shellArr);

		/* 8. Отсортировать массив с использованием
         *    сортировки Шелла.
	     */

		System.out.println("\n \n До сортировки Шелла: ");

		for ( int j=0; j<shellArr.length; j++)
			System.out.print (shellArr[j] + " ");

		ShellSort shell = new ShellSort();
		shell.sort(shellArr);

		System.out.println("\nПосле сортировки Шелла: ");
		for (int c: shellArr){
			System.out.print(c + " ");
		}

    }
}
