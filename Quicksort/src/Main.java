import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(39);
        arr.add(24);
        arr.add(1);
        arr.add(4);
        System.out.println(qsort(arr));

    }

    public static List<Integer> qsort(List<Integer> array){
//        Caso base
        if(array.size() < 2){
            return array;
        }
//      Caso recursivo:

//      Declaração de listas
        List<Integer> smallest = new ArrayList<>();
        List<Integer> greatest = new ArrayList<>();
        int pivot = array.get(0);
//        Adicionando elementos menores e maiores que pivot a suas respectivas listas.
        for(int i=1; i < array.size(); i++){
            if(array.get(i) < pivot) {smallest.add(array.get(i));}
            else if(array.get(i) > pivot) {greatest.add(array.get(i));}
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(qsort(smallest));  //Ordena a lista de menores e adiciona ao resultado
        result.add(pivot);
        result.addAll(qsort(greatest));  //Ordena a lista de maiores e adiciona ao resultado.

        return result;


    }
}

