public class PalindromeArray {
    public static void main(String[] args) {
        int arr[] = {1,3,2,3,1};
        int originalarr[] = new int[arr.length];
        boolean palindrome = true;

        System.arraycopy(arr, 0, originalarr, 0, arr.length);

        // reversing 
        for(int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        // Checking Palindrome
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != originalarr[i]){
                palindrome = false;
                break;
            }
        }

        if(palindrome)
            System.out.print("Given array is a palindrome array");
        else
            System.out.print("Given array is a not palindrome array");
    }
}
