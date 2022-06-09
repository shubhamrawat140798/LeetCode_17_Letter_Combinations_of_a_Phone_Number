package com.phone_dailer_combination;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * for generating combination of letter of phone dialer.
 * and printing those combination.
 */
public class LetterCombination {
    /**
     * for generating combination of characters.
     * @param numberDigit input number string.
     * @param sizeOfInput size of input.
     * @param phoneDigitTable phone digit table.
     * @return list of letter combination.
     */
    private List<String> letterCombinationsGenerator(final String numberDigit,
                                                final int sizeOfInput,
                          final String[] phoneDigitTable) {
        // To store the letter combinations
        List<String> resultList = new ArrayList<>();
        Queue<String> combinationQueue = new LinkedList<>();
        combinationQueue.add("");
        while (!combinationQueue.isEmpty()) {
            String combinationString = combinationQueue.remove();
            // if word is complete the combination length.
            // push it in the resultList
            if (combinationString.length() == sizeOfInput) {
                resultList.add(combinationString);
            } else {
                int indexOfPhoneDigitTable = Integer.parseInt(
                        String.valueOf(
                                numberDigit.charAt(combinationString.length())
                        )
                );
                String valueAtPhoneDigitTable
                        = phoneDigitTable[indexOfPhoneDigitTable];
                for (int indexOfCharacterOfPhoneDigitTable = 0;
                     indexOfCharacterOfPhoneDigitTable
                             < valueAtPhoneDigitTable.length();
                     indexOfCharacterOfPhoneDigitTable++) {
                    combinationQueue.add(combinationString
                            + valueAtPhoneDigitTable.charAt(
                                    indexOfCharacterOfPhoneDigitTable)
                    );
                }
            }
        }
        return resultList;
    }
    /**
     * this method create map of character string.
     * and call letterCombinations
     * @param numberDigit for passing input number string.
     * @param sizeOfNumberDigit size numberDigit.
     */
    public void letterCombinations(final String numberDigit,
                                   final int sizeOfNumberDigit) {
       final String[] phoneDigitTable
                = {"0",   "1",   "abc",  "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> resultList
                = letterCombinationsGenerator(numberDigit, sizeOfNumberDigit,
                phoneDigitTable);
        System.out.print("Combination of letters: ");
        for (String s : resultList) {
            System.out.print(s + " ");
        }
    }
}
