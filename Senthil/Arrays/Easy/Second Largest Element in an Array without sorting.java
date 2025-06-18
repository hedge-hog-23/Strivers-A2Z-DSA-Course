//most optimized approach

class Main {
    public static void main(String[] args) {
        int[] arr = {1,4,5,3,2,5};
        int maxi = Integer.MIN_VALUE;
        int secMaxi = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] > maxi){
                secMaxi = maxi;
                maxi = arr[i];
            }
            else if(arr[i]>secMaxi && arr[i] != maxi){
                secMaxi = arr[i];
            }
        }
        System.out.println(secMaxi);
    }
}
