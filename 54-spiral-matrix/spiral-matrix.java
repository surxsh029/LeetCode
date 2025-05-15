class Solution {
    public List<Integer> spiralOrder(int[][] nums) {

        int startRow = 0;
        int startCol = 0;
        int endRow = nums.length - 1;
        int endCol = nums[0].length - 1;
        List<Integer> numbers = new ArrayList<>();


        while (startCol <= endCol && startRow <= endRow) {
            for (int i = startCol; i <= endCol; i++) {
               numbers.add(nums[startRow][i]);
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                numbers.add(nums[i][endCol]);
            }
            for (int i = endCol - 1; i >= startCol; i--) {
                if (endRow == startRow) {
                    break;
                }
                numbers.add(nums[endRow][i]);
            }
            for (int i = endRow -1; i >= startRow + 1; i--) {
                if (endCol == startCol) {
                    break;
                }
                numbers.add(nums[i][startCol]);
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }

        return numbers;

    }
}