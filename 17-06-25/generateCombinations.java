// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        generateCombinations("abc",0,"");
    }
    public static void generateCombinations(String str,int index,String result){
        if (index==str.length()){
            System.out.println(result.length() !=0 ? result: "emptySet");
            return;
    }
    generateCombinations(str,index+1,result+str.charAt(index));
    generateCombinations(str,index+1,result);
    }
}