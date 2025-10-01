public class OccurrenceOfAnElement {
    public static void main(String[] args) {
        int array[] = {1,2,3,1,4,5,2,6,7,7,8,9};
        boolean visited[] = new boolean[array.length];
        for(int i = 0; i < array.length; i++){
            if(visited[i]) continue; // Skip already counted elements
            int Occurrence = 0;
            for(int j = 0; j < array.length; j++){
                if(array[i] == array[j]){
                    Occurrence += 1;
                    visited[j] = true; // Mark as counted
                }
            }
            System.out.println("Occurrence of " + array[i] + ": " + Occurrence);
        }
    }
}
