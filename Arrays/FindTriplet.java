import java.util.ArrayList;
import java.util.HashSet;

public class FindTriplet{
    public static void main(String[] args) {
        int arr[] = {1, -1, 2, 1, 3};
        ArrayList<ArrayList<Integer>> list = findTriplet(arr);
        System.out.println("The triplets are: "+list);
    }
    public static ArrayList<ArrayList<Integer>> findTriplet(int arr[]){
        HashSet<ArrayList<Integer>> result = new HashSet<>();
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr.length ; j++){
                for(int k=0 ; k<arr.length ; k++){
                    HashSet<Integer> set = new HashSet<>();
                    set.add(arr[i]);
                    set.add(arr[j]);
                    set.add(arr[k]);
                    if(set.size() == 3){
                        ArrayList<Integer> temp = new ArrayList<>(set);
                        result.add(temp);
                    }
                }
            }
        }
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(result);
        return list;
    }
}