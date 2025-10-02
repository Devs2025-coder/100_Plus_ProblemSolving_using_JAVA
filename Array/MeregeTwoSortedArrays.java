public class MeregeTwoSortedArrays {
    public static void main(String args[]){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9,10};
        int arr3[] = new int[arr1.length + arr2.length];
        int index1 = 0,  index2 = 0, index3 = 0;


        // Merging arrays
        while(index1 < arr1.length && index2 < arr2.length){
            if(arr1[index1] <= arr2[index2]){
                arr3[index3] = arr1[index1];
                index1++;
            }
            else if(arr2[index2] <= arr1[index1]){
                arr3[index3] = arr2[index2];
                index2++;
            }
            index3++;
        }
        while(index1 < arr1.length){
            arr3[index3] = arr1[index1];
            index3++;
            index1++;
        }
        while(index2 < arr2.length){
            arr3[index3] = arr2[index2];
            index3++;
            index2++;
        }

        for(index3 = 0; index3 < arr3.length; index3++){
            System.out.print(arr3[index3] + " ");
        }
    }
}
