package Session_3;

public class Bài6 {
    static void main(String[] args) {
        int[] arrayFirst = {1,3,5,7,9};
        int[] arraySecond = {2,3,5,6,8,9,10};
        int[] arrayMerge = mergeBook(arrayFirst,arraySecond);
        for (int number : arrayMerge) {
            System.out.print(number + " ");
        }
    }

    static int[] mergeBook(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] temp = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            int value;
            if (a[i] < b[j]) {
                value = a[i++];
            } else if (a[i] > b[j]) {
                value = b[j++];
            } else {
                value = a[i];
                i++;
                j++;
            }

            if (k == 0 || temp[k - 1] != value) {
                temp[k++] = value;
            }
        }

        while (i < n) {
            if (k == 0 || temp[k - 1] != a[i]) {
                temp[k++] = a[i];
            }
            i++;
        }

        while (j < m) {
            if (k == 0 || temp[k - 1] != b[j]) {
                temp[k++] = b[j];
            }
            j++;
        }

        return temp;
    }
}
