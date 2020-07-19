package com.maven.Interest;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Interest
{
   private static Logger LOG =LogManager.getLogger(Interest.class);
    public static void main (String args[ ])
{
    double principle, rate, time, SimpleInterest,CompoundInterest;
    Scanner sc=new Scanner(System. in);
    LOG.info("Enter the principle:");
    principle=sc.nextDouble();
    LOG.info("Enter the time:");
    time=sc.nextDouble();
    LOG.info("Enter the Rate of Interest");
    rate=sc.nextDouble();
    SimpleInterest=(principle * time * rate)/100;
    CompoundInterest =principle * Math.pow(1.0+rate/100.0,time) - principle;
    LOG.info("Simple Interest="+SimpleInterest);
    LOG.info("Compound Interest="+CompoundInterest);
    sc.close();
   }
    
}
