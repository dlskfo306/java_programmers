package 평균구하기;

public class day1018 {
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int i=0; i<arr.length; i++) {
            answer += arr[i];
        }
        
        answer = answer/(double)arr.length;
        
        return answer;

    }
}
