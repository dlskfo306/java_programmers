package 짝수와홀수;

public class day1018 {
    public String solution(int num) {
        String answer = "";
        
        
        if(num%2==0) {
            answer = "Even";
        }else {
            answer = "Odd";
        }
       
        
        return answer;
    }

}
