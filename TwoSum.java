public class TwoSum {

    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int[] output = {};

        for (int i = 0; i < numbers.length; i++) {

            if (hashMap.get(numbers[i]) != null) {

                int[] output = {hashMap.get(numbers[i]) , i};
                return output;
            }

            hashMap.put(target - numbers[i], i);
        }  

        return output;
    }
}