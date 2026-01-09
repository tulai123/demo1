public class qs {

    public static int partition(int[] a, int l,int r){
        int pivot = a[(l+r) / 2 ], i=l,j=r;
        while (i <= j) {
            while (a[i] < pivot)
                i++;
            while (a[j] > pivot)
                j--;
            if (i <= j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }

    public static void quickSorf(int[] a, int l,int r){
        int i = partition(a,l,r);
        if (l < i - 1)
            quickSorf(a,l,i-1);
        if (i < r)
            quickSorf(a,i,r);
    }
    public static void main(String[] args) {
        System.out.println("Nhap cac pt cua mang:");
        int[] a = {6, 9, 22, 34, 1, 4, 6, 14, 28,11, 14, 21};
        for (int i =0;i <a.length;i++)
            System.out.println(a[i] + " ");
        System.out.println("----------");

        quickSorf(a, 0, a.length-1);
        for (int i =0;i <a.length;i++)
            System.out.println(a[i] + " ");
    }
}