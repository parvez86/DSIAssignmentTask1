/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsiassignmenttask1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Ln
 */
public class Product {
    private String name;
    private String pattern = "yyyy-MM-dd";
    private SimpleDateFormat dateformat = new SimpleDateFormat(pattern);
    private Date start_date;
    private Date end_date;
    private Boolean isEndDate = false;
    private int consumptionTimeInHours=0;
    private int consumptionTimeInDays=0;
    private float rating;
    
    public Product(){
        
    }
    public Product(String name, String start_Date, String end_date, int timeInHours, int timeInDays, float rating){
        this.updateName(name);
//        this.updateStartDate(start_Date);
//        this.updateEndDate(end_date);
        this.updateConsmptionTimeInHours(timeInHours);
        this.updateConsupmtionTimeInDays(timeInDays);
        this.updateRating(rating);
        
        // start date
        if(start_Date==null){
            this.start_date= null;
        }
        else {
            try{
                this.start_date = dateformat.parse(start_Date);
            }
            catch(ParseException e){
                // no action
            }
        } 
        
        // end date
        if(end_date==null){
            this.end_date= null;
        }
        else {
            try{
                this.end_date = dateformat.parse(end_date);
            }
            catch(ParseException e){
                // no action
            }
        } 
    }
    public Product(Product obj){
        this.name = obj.name;
        this.start_date = obj.start_date;
        this.end_date = obj.end_date;
        this.consumptionTimeInDays = obj.consumptionTimeInDays;
        this.consumptionTimeInHours = obj.consumptionTimeInHours;
        this.rating = obj.rating;
        
    }
    public void updateName(String name){
        if(name!=null || name.length()>0){
            this.name = name;
        }
    }
    public String getName(){
        return this.name;
    }
    public void updateStartDate(String date){
        if (!date.equals(null)){
            try{
                this.start_date = dateformat.parse(date);
            }
             catch(ParseException e){
                System.out.println("Valid format of date(YYYY-MM-DD)");
            }
        }
    }
    public String  getStartDate(){
        return this.start_date == null ? null  : this.dateformat.format(this.start_date);
    }
    
    public void updateEndDate(String date){
        if(!isEndDate){
            if(!date.equals(null)){
                try{
                this.end_date = dateformat.parse(date);
                isEndDate = true;
                }
                catch(ParseException e){
                    System.out.println("Valid format of date(YYYY-MM-DD)");
                }
            }
        }
        else{
            System.out.println("The end date is already set! You can't reset end_date.");
        }
    }
    public String getEndDate(){
        return this.end_date == null ? null : this.dateformat.format(this.end_date);
    }
    public void updateConsmptionTimeInHours(int timme){
        if(timme>0){
            this.consumptionTimeInHours+=timme;
            if(this.consumptionTimeInHours>23){
                int days =(int) (this.consumptionTimeInHours/24);
                this.consumptionTimeInHours-=(days*24);
                this.consumptionTimeInDays+=days;
            }
        }
    }
    public int getConsupmtionTimeInHours(){
        return this.consumptionTimeInHours;
    }
    
    public void updateConsupmtionTimeInDays(int days){
//        if (days != null){
//            this.consumptionTimeInDays+=days;
//        }
          this.consumptionTimeInDays+=days;
    }
    public int getConsupmtionTimeInDays(){
        return this.consumptionTimeInDays;
    }
    public void updateRating(float rating){
        if(rating >= 0.0 && rating < 10.0){
            this.rating = rating;
        }
        else{
            System.out.println("Please Enter the valid rating value (1-10)");
        }
    }
    public float getRating(){
        return this.rating;
    }
}
