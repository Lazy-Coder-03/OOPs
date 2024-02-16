public class Sequence {
    public static void main(String[] args) {
        int[] nums = { 30, 1, 5, 2, 31, 4, 32, 5, 33, 6, 34 };

        int[] longestConsecutiveArray = findLongestConsecutive(nums);
        System.out.println("length of longest consecutive elements array is: " + longestConsecutiveArray.length);
        System.out.print("Longest consecutive array is: ");
        for (int num : longestConsecutiveArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int[] findLongestConsecutive(int[] nums) {

        bubbleSort(nums);

        int longestStart = 0;
        int longestLength = 1;

        int currentStart = 0;
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    currentLength++;
                } else {
                    currentStart = i;
                    currentLength = 1;
                }
            }

            if (currentLength > longestLength) {
                longestStart = currentStart;
                longestLength = currentLength;
            }
        }

        int[] result = new int[longestLength];
        for (int i = 0; i < longestLength; i++) {
            result[i] = nums[longestStart + i];
        }

        return result;
    }
}
