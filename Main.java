import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        
        Delimiters d1 = new Delimiters("(", ")");
        String[] t1 = {"(", "x + y", ")", " * 5"};
        ArrayList<String> list1 = d1.getDelimitersList(t1);
        System.out.println(list1);
        
        Delimiters d2 = new Delimiters("<q>", "</q>");
        String[] t2 = {"<q>", "yy", "</q>", "zz", "</q>"};
        ArrayList<String> list2 = d2.getDelimitersList(t2);
        System.out.println(list2);
        
        
        Delimiters d3 = new Delimiters("<sup>", "</sup>");
        
        
        String[] t3 = {"<sup>", "<sup>", "</sup>", "<sup>", "</sup>", "</sup>"};
        ArrayList<String> list3 = d3.getDelimitersList(t3);
        System.out.println(d3.isBalanced(list3));
        
        
        String[] t4 = {"<sup>", "</sup>", "</sup>"};
        ArrayList<String> list4 = d3.getDelimitersList(t4);
        System.out.println(d3.isBalanced(list4));
        
        
        String[] t5 = {"</sup>"};
        ArrayList<String> list5 = d3.getDelimitersList(t5);
        System.out.println(d3.isBalanced(list5));
        
        
        String[] t6 = {"<sup>", "<sup>", "</sup>"};
        ArrayList<String> list6 = d3.getDelimitersList(t6);
        System.out.println(d3.isBalanced(list6));
    }
}
