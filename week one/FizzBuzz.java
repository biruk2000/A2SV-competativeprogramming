// week one
class Solution {
    public List<String> fizzBuzz(int n) {
    // String[] out = new String[n];
        List<String> answer= new ArrayList<>();
     for(int i=1; i<=n; i++){
         if(i%3==0 && i%5==0){
             answer.add("FizzBuzz");
         }else if(i%3==0){
             answer.add("Fizz");
         }else if(i%5 == 0){
             // out[i] = "Buzz";
             answer.add("Buzz");
         }else {
             answer.add(i+"");
         }
     }
        return answer;
     
}
}
