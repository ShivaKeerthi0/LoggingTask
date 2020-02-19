package com.maven.Interest;
import java.util .*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */

public class Interest
{
   private static Logger LOGGER =LogManager.getLogger(Interest.class);
    public static void main (String args[ ])
{
    double p, rate, t, SimpleInterest,CompoundInterest;
    Scanner sc=new Scanner(System. in);
    LOGGER.info("Enter the amount:");
    p=sc.nextDouble();
    LOGGER.info("Enter the No.of years:");
    t=sc.nextDouble();
    LOGGER.info("Enter the Rate of  interest");
    rate=sc.nextDouble();
    SimpleInterest=(p * t * rate)/100;
    CompoundInterest =p * Math.pow(1.0+rate/100.0,t) - p;
    LOGGER.info("Simple Interest="+SimpleInterest);
    LOGGER.info("Compound Interest="+CompoundInterest);
    sc.close();
   }
    
}