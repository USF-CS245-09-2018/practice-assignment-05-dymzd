public class InsertionSort implements SortingAlgorithm {

    public void sort(int [] a) {
        int n = a.length;
        for(int i = 1; i < n; i++){
            int x = a[i];
            int j = i-1;
            while(j>=0 &&a[j]>x){
                a[j+1]= a[j];
                j = j -1; 
            }
            a[j+1]= x;

        }
    }
}