package com.umiitkose.strings.easy.exam13.Cozum;

public class Main {
    private static int getOneCharacterData(char firstCharacter) {

        int data;
        switch (firstCharacter) {
            case 'M':
                data = 1000;
                break;
            case 'D':
                data = 500;
                break;
            case 'C':
                data = 100;
                break;
            case 'L':
                data = 50;
                break;
            case 'X':
                data = 10;
                break;
            case 'V':
                data = 5;
                break;
            case 'I':
                data = 1;
                break;
            default:
                data = 0;

        }
        return data;
    }

    private static int getTwoCharacterData(String twoCharacter) {
        int data;

        switch (twoCharacter) {
            case "CM":
                data = 900;
                break;
            case "CD":
                data = 400;
                break;
            case "XC":
                data = 90;
                break;
            case "XL":
                data = 40;
                break;
            case "IX":
                data = 9;
                break;
            case "IV":
                data = 4;
                break;

            default:
                data = 0;

        }
        return data;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Girilen değerin Roma Rakamı :  " + main.convertToRomanNumeral("MI")); //1994
    }

    public int convertToRomanNumeral(String s) {
        int result = 0;
        int index = 0;
        int length = s.length();

        while (index < length) {
            if (index + 1 < length && getTwoCharacterData(s.substring(index, index + 2)) > 0) {
                result += getTwoCharacterData(s.substring(index, index + 2));
                index += 2;
            } else {
                result += getOneCharacterData(s.charAt(index));
                index += 1;
            }
        }
        return result;
    }
}
