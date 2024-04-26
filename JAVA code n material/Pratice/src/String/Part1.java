package String;

public class Part1 {

	public String findsimple(String s){
	    
        int starti= s.indexOf("ATG");
        int endi = s.indexOf("TAA", starti+3);
        String dna = s.substring(starti, endi+3);
        return dna;   
    }
	
    public void test(){
    String gene = "ATGCGTAGTGATCGATACTGTAAATC";
    String answer=findsimple(gene);
    System.out.println(answer);
    }
    
    public static void main(String args[]){
    Part1 fn = new Part1();
    fn.test(); 
    } 

}
