import java.util.Scanner;

public class Candy {
    public String name;
    public String size;

    public void talkaboutCandy(){
        System.out.printf("Ahh, a %s! I see you also got the %s size of it. Looks good! :) \n", this.name, this.size);
    }


    public Candy(String candyName){
        this.name = candyName;
        this.size = "unknown";
    }

    public Candy(String candyName, String candySize){
        this.name = candyName;
        this.size = candySize;
    }


    public static void main(String[] args) {

        Candy unknownCandy = new Candy("funky candy");
        System.out.println("unknownCandy.name = " + unknownCandy.name);
        System.out.println("unknownCandy.size = " + unknownCandy.size);
        unknownCandy.talkaboutCandy();

        Candy funsizeSnickers = new Candy("Snickers", "fun-size");

        System.out.println("funsizeSnickers.name = " + funsizeSnickers.name);
        System.out.println("funsizeSnickers.size = " + funsizeSnickers.size);
        unknownCandy.talkaboutCandy();

    }
}
