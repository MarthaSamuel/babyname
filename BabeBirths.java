
/**
 * BabeBirths is a code used to print out information in a file containing babynames,gender and 
 * number of babies with the given names.this data in csv files has no header row,so we will 
 * access the csv record data by index: 0 for name,as its the first column in each row
 * and 1 for gender as its the 2nd column in each row.
 *
 *N9a
 * Dimgba Martha Otisi 
 * @2020,January
 * @martha_samuel_ 
 *
 */
import edu.duke.*;
import org.apache.commons.csv.*;

public class BabeBirths {
public void printNames(){
    FileResource fr=new FileResource ();
    for(CSVRecord rec:fr.getCSVParser(false)){//false because it has no header row
        //this is to print out names with borns<=100.To print all ignore these 2 lines
        int numBorn = Integer.parseInt(rec.get(2));
        if (numBorn<=100){
            System.out.println("Name "+rec.get(0)+" Gender "+rec.get(1)+" Number "+rec.get(2));
        }
    }
}
//this code prints totalBirths
public void totalBirths(FileResource fr){
    int totalBirths=0;
    //add these two lines if we want to print totalBirths according to gender,if not ignore
    int totalBoys=0;
    int totalGirls=0;
    for(CSVRecord rec:fr.getCSVParser(false)){
        int numBorn=Integer.parseInt(rec.get(2));
        totalBirths+=numBorn;
    
        //add these 5 lines if we want to print totalBirths according to gender,if not ignore
        if(rec.get(1).equals("M")){
            totalBoys+=numBorn;
        }
        else{
            totalGirls+=numBorn;
        }
    }
            System.out.println("Total Births = "+totalBirths);
            //add these 2 lines to print totalbirths accordingto gender
            System.out.println("Total girls "+ totalGirls);
            System.out.println("Total boys "+ totalBoys);
        }
    

 
public void testtotalBirths(){
    FileResource fr= new FileResource();
    totalBirths(fr);
}
}
