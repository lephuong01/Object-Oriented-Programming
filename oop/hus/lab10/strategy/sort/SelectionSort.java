package oop.hus.lab10.strategy.sort;

public class SelectionSort implements Sorter {
    @Override
    public void sort(int[] data) {
        int n = data.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (data[j] < data[min_idx]) {
                    min_idx = j;
                }
            }

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = data[min_idx];
            data[min_idx] = data[i];
            data[i] = temp;
        }
    }
}
