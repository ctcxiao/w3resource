class Exercises6{
    public static void main(String[] args) {
        String str1 = "Java exercises";
        String str2 = "Java exercises";
        String str3 = "python examples";

        int var1 = str1.compareTo( str2 );
        System.out.println("str1 & str2 comparison: "+var1);

        int var2 = str1.compareTo( str3 );
        System.out.println("str1 & str3 comparison: "+var2);
    }
}