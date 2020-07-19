package com.maven.House_Construction;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class HouseConstructionCost{
    public void ccost(){
        
       Logger LOG =LogManager.getLogger(HouseConstructionCost.class);
		Scanner sc= new Scanner(System.in);
     LOG.info("select the type of material from the following");
     LOG.info("\n 1.Standard Materials \n 2.Above Standard Materials \n 3.High Standard Materials \n 4.High Standard Materials and Fully Automated Home");
        int n= sc.nextInt();
        
        switch(n){
            case 1: LOG.info("the cost of the house Construction is 1200INR");break;
            case 2: LOG.info("the cost of the house Construction is 1500INR");break;
            case 3: LOG.info("the cost of the house Construction is 1800INR");break;
            case 4: LOG.info("the cost of the house Construction is 2500INR");break;
            default: LOG.error("enter the valid option");break;
                    }
        sc.close();
    }
}
public class House{
    public static void main(String args[]){
        HouseConstructionCost h=new HouseConstructionCost();
        h.ccost();

    }
}

