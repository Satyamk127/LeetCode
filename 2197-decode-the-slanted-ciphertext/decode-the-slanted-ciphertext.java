class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if (rows == 1) return encodedText;

        int n = encodedText.length();
        int cols = n / rows;


        char[][] mat = new char[rows][cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = encodedText.charAt(index++);
            }
        }


        StringBuilder result = new StringBuilder();

        for (int j = 0; j < cols; j++) {
            int i = 0;
            int col = j;

            while (i < rows && col < cols) {
                result.append(mat[i][col]);
                i++;
                col++;
            }
        }

     
        while (result.length() > 0 && result.charAt(result.length() - 1) == ' ') {
            result.deleteCharAt(result.length() - 1);
        }

        return result.toString();
    }
}