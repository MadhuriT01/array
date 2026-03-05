public class FindVowels {
    public static void main(String[] args) {

        char[] arr = {'a','b','c','e','i','o','u','x'};

        System.out.println("Vowels in the array:");

        for(int i=0;i<arr.length;i++) {
            char ch = arr[i];

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                System.out.println(ch);
            }
        }
    }
}