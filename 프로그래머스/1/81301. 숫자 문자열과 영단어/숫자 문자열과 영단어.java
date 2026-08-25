import java.util.*;
class Solution {
    public int solution(String s) {
        StringBuilder answer = new StringBuilder();
        StringBuilder word = new StringBuilder(); // 영어 단어 임시저장
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                answer.append(ch);                
            }else{
                word.append(ch);
                // word가 zero~nine 됐는지 검사
                switch(word.toString()){
                    case "zero":
                        answer.append("0");
                        word.setLength(0);
                        break;
                    case "one":
                        answer.append("1");
                        word.setLength(0);
                        break;
                    case "two":
                        answer.append("2");
                        word.setLength(0);
                        break;
                    case "three":
                        answer.append("3");
                        word.setLength(0);
                        break;
                    case "four":
                        answer.append("4");
                        word.setLength(0);
                        break;
                    case "five" : 
                        answer.append("5");
                        word.setLength(0);
                        break;
                        
                    case "six" : 
                        answer.append("6");
                        word.setLength(0);
                        break;
                    case "seven":
                        answer.append("7");
                        word.setLength(0);
                        break;
                    case "eight":
                        answer.append("8");
                        word.setLength(0);
                        break;
                    case "nine":
                        answer.append("9");
                        word.setLength(0);
                        break;                      
                                             
                }
                
                
            }
            
                    
        }
        return Integer.parseInt(answer.toString());
    }
}