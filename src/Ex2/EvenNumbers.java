package Ex2;

public class EvenNumbers {
    //1
    public int findMaximum(int[] numbers){
        int max=numbers[0];
        for(int number: numbers){
            if(number>max)
                max=number;
        }
        return max;
    }
    //2
    public int findMinimum(int[] numbers){
        int min=numbers[0];
        for(int number: numbers){
            if(number<min)
                min=number;
        }
        return min;
    }
    //3
    public int findMaxSum(int[] numbers){
        int sum=0;
        for(int number: numbers){
            sum+=number;
        }
        return sum-findMinimum(numbers);
    }
    //4
    public int findMinSum(int[] numbers){
        int sum=0;
        for(int number: numbers){
            sum+=number;
        }
        return sum-findMaximum(numbers);
    }
}
