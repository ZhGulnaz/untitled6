public static bubbleSort(int[] arr) {
        for(int i=0; i< arr.length; i++) {
        for(int j=0; j<arr.length -1 - i; j++) {
        if(arr[j] > arr[j+1]){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j + 1] = temp;
        }
        }
        }

        return arr;
        }

public static void main(String[] args) {
        int[] arr = { 10, 9, 4, 5, 1};
        arr=bubbleSort(arr);

        for(int i=0; i< arr.length; i++)
        System.out.println(arr[i]);
        }