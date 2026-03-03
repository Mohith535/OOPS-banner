/**
 * OOPS Banner App - UC7
 *
 * Stores character patterns using a dedicated static inner class
 *
 * @author Mohith
 * @version 7.0
 */

import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, CharacterPatternMap> patternMap = initializePatterns();

        String word = "OOPS";
        StringBuilder[] banner = new StringBuilder[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = new StringBuilder();
        }

        for (char ch : word.toCharArray()) {

            CharacterPatternMap pattern = patternMap.get(ch);

            for (int i = 0; i < 7; i++) {
                banner[i].append(pattern.getPattern()[i]).append("   ");
            }
        }

        for (StringBuilder line : banner) {
            System.out.println(line);
        }
    }

    // Initialize character patterns
    private static Map<Character, CharacterPatternMap> initializePatterns() {

        Map<Character, CharacterPatternMap> map = new HashMap<>();

        map.put('O', new CharacterPatternMap('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        map.put('P', new CharacterPatternMap('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        }));

        map.put('S', new CharacterPatternMap('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        }));

        return map;
    }

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
}