public class Frequency {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5};
        boolean[] isvisited = new boolean[arr.length];
        for(int i=0; i < arr.length; i++){
            if(isvisited[i]==true){
                continue;
            }
            int count=1; 
            for(int j=i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    isvisited[j]=true;
                }
            }
            System.out.println(arr[i]+" "+count);
        }
        
    }
    
}
