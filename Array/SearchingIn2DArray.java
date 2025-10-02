public class SearchingIn2DArray {
    public static void main(String args[]){
        int arr[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int target = 10;
        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    found = true;
                    break;
                }
            }
        }
        if(found)
            System.out.print("Element found in the array");
        else
            System.out.print("Element not found in the array");
    }
}
