package com.maven.House_Construction;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
class HouseConstructionCost{
    public void cost(){
        
       Logger LOGGER =LogManager.getLogger(HouseConstructionCost.class);
		Scanner sc= new Scanner(System.in);
     LOGGER.info("select the type of material from the following");
     LOGGER.info("\n 1.Standard Materials \n 2.Above Standard Materials \n 3.High Standard Materials \n 4.High Standard Materials and Fully Automated Home");
        int n= sc.nextInt();
        
        switch(n){
            case 1: LOGGER.info("the cost of the house Construction is 1200INR");break;
            case 2: LOGGER.info("the cost of the house Construction is 1500INR");break;
            case 3: LOGGER.info("the cost of the house Construction is 1800INR");break;
            case 4: LOGGER.info("the cost of the house Construction is 2500INR");break;
            default: LOGGER.error("enter the valid option");break;
                    }
        sc.close();
    }
}
public class House{
    public static void main(String args[]){
        HouseConstructionCost hc=new HouseConstructionCost();
        hc.cost();

    }
}

