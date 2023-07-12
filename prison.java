import java.util.Random;

public class prison {
    public static void main(String[] args) {
        int arr []  = new int[100];
        for(int i=0 ; i<100 ; i++){
            arr[i] = i;
        }
        float count = 0;
        for(int i=0 ; i<10000 ; i++){
            shuffle((arr));
            if(canWin(arr)){
                count ++;
            }
        }
        float Probability = count/10000;
        System.out.println("Probability of prisoners successfully finding their assigned boxes: " + Probability);
    }
    static boolean canWin(int [] arr){
        for(int i=0 ; i< 100; i++){
            int cur = i;
            boolean found = false;
            for(int j=0 ; j<50 ; j++){
                if(arr[cur]==i){
                    found = true;
                }
                cur = arr[cur];
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
    static void shuffle(int [] arr){
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
