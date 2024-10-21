import java.util.Scanner;
import java.io.File;
public class Reader{
    public static void main(String[] args)throws Exception{
        File puzzle = new File("puzzle.txt");
        Scanner reader = new Scanner(puzzle);
        String text = reader.nextLine();
        // for(int i=0;i<10;){
        //     int giraffeCount = 0;
        //     if(text.indexOf("giraffe")>=0){
        //         giraffeCount++;
        //         System.out.println(text.indexOf("giraffe"));
        //         text = text.substring(text.indexOf("giraffe")+7);
        //         i++;
        //     }
        //     System.out.println(text.substring(text.indexOf("giraffe")));
        // }
        // String longest = "";
        // for(int i = 0; i<text.length()-1; i++){
        //     if(text.substring(i,i+1).equals(text.substring(i+1,i+2))){
        //         longest += text.substring(i+1,i+2);
        //     }
        // }
        // System.out.println(text.substring(text.indexOf("dddddddddddd"), text.indexOf("dddddddddddd")+200));
        // String section = "";
        // int count = 0;
        // int bestCount = 0;
        // String bestString = "";
        // String x = "";
        // for(int i=0; i<text.length()-30;i++){
        //         section = text.substring(i,i+30);
        //         for(int j=0; j<section.length();j++){
        //         x = section.substring(j, j+1);
        //         if(x.equals("a") || x.equals("e") || x.equals("i") || x.equals("o") || x.equals("u")){
        //             count++;
        //         }
        //         if(count>bestCount){
        //             bestCount = count;
        //             bestString = section;
        //         }
        //         }
        //         count = 0;
        //     }
        // System.out.println("There are " + bestCount + " vowels in the string " + bestString + ".");
        // System.out.println(text.indexOf("aeibuiogeiodaaoiuoooiupeeohuuu"));
        // System.out.println(text.substring(69048, 69048+200));
        String word = "";
        String backword = "";
        String elevendrome = "";
        for(int i=0; i<text.length()-11;i++){
            for(int j=11; j>0; j--){
             word = text.substring(i, i+11);
             backword+=word.substring(j-1,j);
             if(word.equals(backword)){
                elevendrome = backword;
             }  
            }
            //System.out.println(elevendrome);
            backword = "";
        }
        
        System.out.println(text.substring(text.indexOf("yobananaboy"),text.indexOf("yobananaboy")+100));

    }
}