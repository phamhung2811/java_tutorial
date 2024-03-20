package MayTinhBoTui;

public class SapXepChon implements SapXepInterface {

    @Override
    public void sapXepTang(double[] arr) {
        int n = arr.length;
        int i, min_index, j;
        for (i = 0; i < n - 1; i++) {
            min_index = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                    double temp = arr[min_index];
                    arr[min_index] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    @Override
    public void sapXepGiam(double[] arr) {
        int n = arr.length;
        int i, min_index, j;
        for (i = 0; i < n - 1; i++) {
            min_index = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] > arr[min_index]) {
                    min_index = j;
                    double temp = arr[min_index];
                    arr[min_index] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
