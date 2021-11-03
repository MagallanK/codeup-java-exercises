import java.util.Arrays;
import java.util.Scanner;

public class Candy {
    public String name;
    public String size;
    public String[] descriptors;

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

    public Candy(String name, String size, String[] descriptors){
        this.name = name;
        this.size = size;
        this.descriptors = descriptors;
    }

    public static void main(String[] args) {

//        Candy unknownCandy = new Candy("funky candy");
//        System.out.println("unknownCandy.name = " + unknownCandy.name);
//        System.out.println("unknownCandy.size = " + unknownCandy.size);
//        unknownCandy.talkaboutCandy();
//
//        Candy funsizeSnickers = new Candy("Snickers", "fun-size");
//
//        System.out.println("funsizeSnickers.name = " + funsizeSnickers.name);
//        System.out.println("funsizeSnickers.size = " + funsizeSnickers.size);
//        unknownCandy.talkaboutCandy();

        Candy funsizeSnickers = new Candy("Snickers", "fun-size", new String[]{"Chocolate", "Candy-coated", "Classic"});
        Candy butterFingers = new Candy("ButterFinger", "Bite-size", new String[]{"Chocolate", "Peanut-Butter", "Classic"});

        System.out.println(Arrays.toString(funsizeSnickers.descriptors));

        Candy[] myBag = {funsizeSnickers, butterFingers};

        for(Candy singleCandy : myBag){
            String descriptors = Arrays.toString(singleCandy.descriptors);
            descriptors = descriptors.substring(1, descriptors.length() - 1);

            System.out.printf("Here's a %s that is %s - it's described as having the following traits: %s%n", singleCandy.name, singleCandy.size, descriptors);
        }
    }
}
