import java.util.*;
public class Main {

    public static void main(String[] args) {
        /*
        List<String> strings = new ArrayList<>();
        strings.add("bbb");
        strings.add("aaaaabbbdddd");
        strings.add("aaa");
        System.out.println(strings);
        filterTripleA(strings);
        System.out.println(strings);
  */
        /*
          try {
            int[] sourceArray = {5, 3, 2, 8, 1, 4};
            int[] sortedArray = sort(sourceArray);
            // Вывод отсортированного массива
            for (int value : sortedArray) {
                System.out.print(value + " ");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

         */

    }

    /*
    Необходимо реализовать на Java метод, принимающий на вход коллекцию строк и выбрасывающий из переданной коллекции все элементы, начинающиеся на «aaa».
    Сигнатура необходимого метода должна иметь вид:
     */
    public static void filterTripleA(Collection<String> strings) {
        Iterator<String> iterator = strings.iterator();
        // Цикл wile повторяется до тех пор, пока в коллекции есть элементы
        while (iterator.hasNext()) {
            // Получение следущего элемента коолекции
            String str = iterator.next();
            // Проверка начинается ли текущая строка с "aaa"
            if (str.startsWith("aaa")) {
                // Если условие истино, то удаляем этот элемент из коллекции
                iterator.remove();
            }
        }
    }

    /*
    Дан массив double[ N ], необходимо реализовать на Java метод, возвращающий частное от деления разности максимального с минимальным элементов и среднего арифметического значения элементов массива.
    В случае ошибки требуемый метод должен возвращать только указанный Exception.
    Сигнатура требуемого метода должна иметь вид:
    */
    public static double foo(double[] sourceArray) throws MyException {
        double min = sourceArray[0];
        double max = sourceArray[0];
        double sum = 0;
        // Ищем минимальное, максимальные элементы и суммируем все элементы массивов
        for (double v : sourceArray) {
            if (v < min) min = v;
            if (v > max) max = v;
            sum += v;
        }
        // Вычисляем среднее арифметическое значение элементов массива
        double average = sum / sourceArray.length;
        // проверяем массив на null или пустоту
        if (average == 0) {
            throw new MyException("Array is not empty");
        }
        // Возращаем частное от деления разности максимального и минимального значения на среднее арифметическое
        return (max - min) / average;
    }
    /*
    Необходимо написать на Java метод, реализующий сортировку «пузырьком».
    Неинициализированный массив считается ошибкой входных данных.
    Сигнатура требуемого метода должна иметь вид
     */
    public static int[] sort(int[] sourceArray) throws MyException {
        // Проверка на null
        if (sourceArray == null){
            throw new MyException("Array in null");
        }
        // Копируем входной массив, чтобы не изменять исходный массив
        int[] array = sourceArray.clone();
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            // Если текузий элемент больше следущего, меняем их местами
            for (int i = 0; i< array.length - 1; i++){
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }
}

