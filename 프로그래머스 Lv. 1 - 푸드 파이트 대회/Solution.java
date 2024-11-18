import java.util.*;

// 테스트 환경
public void main(String[] args) {
    Solution solution = new Solution();
    int[] food = {1, 3, 4, 6}; // 테스트 데이터
    String result = solution.solution(food);
    System.out.println("결과: " + result); // 결과 출력
}

// 솔루션
static class Solution {
    public String solution(int[] food) {
        List<String> num = new ArrayList<>(); // 각 플레이어가 먹을 음식 수 칼로리 순, 첫번째 원소는 물
        String answer = "0";
        // food : 각 플레이어가 먹을 음식 수 [1,3,4,6]

        for (int i = 0; i<food.length; i++){
            num.add( Integer.toString(food[i]/2) );
        }
        // num : 해당 음식의 개수를 담은 배열 [0,1,2,3]

        // j : 배열 순서
        // i : 음식의 개수
        for (int j = num.size()-1; j > 0; j--){
            System.out.print(j);
            System.out.print("번째 음식의 개수는");
            System.out.println(num.get(j));
            for (int i = 0 ; i < Integer.parseInt(num.get(j)) ; i++){
                answer = String.valueOf(j) + answer + String.valueOf(j);
            }
        }

        return answer;
    }
}