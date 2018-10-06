public class QuickSort implements SortingAlgorithm {

    public void sort(int a[]) {
        int n = a.length;
        sort(a, 0, n-1);
    }
    public void sort(int a[], int l, int r){
        if(l < r){
            int part = qs(a, l, r);
            sort(a,l, part-1);
            sort(a,part+1, r);
        }
    }

    public int qs(int a[], int l, int r){
        int piv = a[r];
        int i = l-1; 
        for (int j = l; j < r; j++){
            if(a[j] <= piv){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[r];
        a[r] = temp;

        return i+1;
    }

}