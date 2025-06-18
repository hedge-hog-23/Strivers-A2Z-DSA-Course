class Main {
    public static void main(String[] args) {
        int[] arr = {1,4,5,3,2,5};
        if(arr.length == 0)
            System.out.println("-1");
        else{
            int maxi = Integer.MIN_VALUE;
            for(int i : arr){
                if(i>maxi)
                    maxi = i;
            }
            System.out.println(maxi);
        }
    }
}
