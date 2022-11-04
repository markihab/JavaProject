package chapter8;

public class TextProcessor {
    public static void main(String[] args) {
        var text = "My name is mark ihab ayad khalil missak";
        var text2 = "Camel";
        var text3 = "MyNameIsMarkEhabAyadKhalil";
        countWords(text);
        System.out.println(reverseString(text2));
        addSpaces(text3);
    }

    private static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);
        for (int i = 0; i < modifiedText.length() ; i++) {
            if(i != 0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }

    public static void countWords(String text){
        var arr = text.split(" ");
        int numberOfWords = arr.length;
        System.out.println("The number of words in this text is : " + numberOfWords);
        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(arr[i]);
        }
    }

    public static String reverseString(String text){
        var emptyArr = "";
        for (int i = text.length(); i > 0 ; i--) {
                emptyArr = emptyArr + text.charAt(i-1);
        }
        return emptyArr;
    }
}
