/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_products;
import java.util.ArrayList;
import java.util.Scanner;

import my_products.Product;

/**
 *
 * @author Ln
 */
public class E_Products {
    // Consumption Time In Days
    private int totalConsumptionTimeInDays=0;
    private int totalBookConsumptionTimeInDays=0;
    private int totalMovieConsumptionTimeInDays=0;
    private int totalSeriesConsumptionTimeInDays=0;
    
    // Consumption Time in Hours
    private int totalConsumptionTimeInHours=0;
    private int totalBookConsumptionTimeInHours=0;
    private int totalMovieConsumptionTimeInHours=0;
    private int totalSeriesConsumptionTimeInHours=0;
    
    // Ratings (1-10)
    private float totalRating=0;
    private float totalBookARating=0;
    private float totalMovieRating=0;
    private float totalSeriesRating=0;
    
    //Product Numbers
    private int totalProductNumbers=0;
    
    // Products
    private ArrayList<Product> bookList = new ArrayList<Product>();
    private ArrayList<Product> movieList = new ArrayList<Product>();
    private ArrayList<Product> seriesList = new ArrayList<Product>();
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public E_Products(){
        
    }
    public void AddProduct(){
        
        String text = "Add integer value of product type:\n"+
                "\t1 -> Book\n"+
                "\t2 -> Movie \n"+
                "\t3 -> Sereies\n"+
                "\t4 -> exit\n";
        Product product = new Product();
        System.out.println(text);
        int productType = sc.nextInt();
        
        if (productType < 4 ){
            try{
                System.out.println("Enter the name: ");
                Scanner scan = new Scanner(System.in);
                String name="";
                name+=scan.nextLine();
    //            scan.close();
                sc = new Scanner(System.in);
                product.updateName(name);
                System.out.println("Enter the start date(YYYY-MM-DD) (for blank, type null): ");
                String start_date = sc.next();
                product.updateStartDate(start_date);
                System.out.println("Enter the end date(YYYY-MM-DD) (for blank, type null): ");
                String end_date = sc.next();
                product.updateEndDate(end_date);
                System.out.println("Enter the product consumptiontime in days (int): ");
                int days = sc.nextInt();
                product.updateConsupmtionTimeInDays(days);
                System.out.println("Enter the product consumption time in hours (int): ");
                int hours = sc.nextInt();
                product.updateConsmptionTimeInHours(hours);
                System.out.println("Enter the product ratings 1-10 (float)");
                float rating = sc.nextFloat();
                product.updateRating(rating);
               
                if(productType==1){
                    this.bookList.add(product);
                    this.totalBookConsumptionTimeInHours += product.getConsupmtionTimeInHours();
                    this.totalBookConsumptionTimeInDays += product.getConsupmtionTimeInDays();
                }
        
                // For Movie
                else if(productType==2){
                    this.movieList.add(product);
                    this.totalMovieConsumptionTimeInHours += product.getConsupmtionTimeInHours();
                    this.totalMovieConsumptionTimeInDays += product.getConsupmtionTimeInDays();
                }
                
                // For Series
                else if(productType==3){
                    this.seriesList.add(product);
                    this.totalSeriesConsumptionTimeInHours += product.getConsupmtionTimeInHours();
                    this.totalSeriesConsumptionTimeInDays += product.getConsupmtionTimeInDays();
                }  
                
                System.out.println("Product added successfully!");
            }
            catch(Exception e){
                System.out.println("Error occured. Please try  again!");
            }
        }
    }
    
    public void updateProduct(int optType, int index){
        
        // Updating Book 
        sc = new Scanner(System.in);
        if(optType == 1){
            try{
                Product product = this.bookList.get(index);
                String optText = "Enter the integer value of options to update.\n"+
                        "\t1 -> Add consumption time in hours\n"
                        + "\t2 -> Add consumption time in days\n"
                        + "\t3 -> Add end date of product\n"
                        + "\t4 -> Add rating\n";
                System.out.println(optText);
                int type = sc.nextInt();
                
                // Adding consumption time in hours
                if(type==1){
                    System.out.println("Enter the consumption time (in hours): ");
                    try{
                        int hours = sc.nextInt();
                        product.updateConsmptionTimeInHours(hours);
                        this.bookList.set(index, product);
                        System.out.println("Consumption hours updated succesfully!");
                    }
                    catch(Exception e){
                        System.out.println("Error occured. Please enter the valid index.");
                    }
                }
                
                // Adding consumption time in days
                else if(type==2){
                    System.out.println("Enter the consumption time (in days): ");
                    try{
                        int days = sc.nextInt();
                        product.updateConsupmtionTimeInDays(days);
                        this.bookList.set(index, product);
                        System.out.println("Consumption days updated succesfully!");
                    }
                    catch(Exception e){
                        System.out.println("Error occured. Please enter the valid index.");
                    }
                }
                
                // Adding end date of product
                else if(type==3){
                    System.out.println("Enter the end date(YYYY-MM-DD): ");
                    try{
                        String date = sc.next();
                        product.updateEndDate(date);
                        this.bookList.set(index, product);
                        System.out.println("End date updated succesfully!");
                    }
                    catch(Exception e){
                        System.out.println("Error occured. Please enter the valid format.");
                    }
                }
                
                // Adding rating
                else if (type==4){
                    System.out.println("Enter the rating: ");
                    try{
                        float rating = sc.nextFloat();
                        product.updateRating(rating);
                        this.bookList.set(index, product);
                        System.out.println("Rating updated succesfully!");
                        
                    }catch(Exception e){
                        System.out.println("Error ocured. Please enter the valid type.");
                    }
                }
            }
            catch (Exception e){
                System.out.println("Error occured. Please enter a valid index no.");
            }
        }
        
        // Update Movie
        if(optType == 2){
            try{
                Product product = this.movieList.get(index);
                String optText = "Enter the integer value of options to update.\n"+
                        "\t1 -> Add consumption time in hours\n"
                        + "\t2 -> Add consumption time in days\n"
                        + "\t3 -> Add end date of product\n"
                        + "\t4 -> Add rating\n";
                System.out.println(optText);
                int type = sc.nextInt();
                
                // Adding consumption time in hours
                if(type==1){
                    System.out.println("Enter the consumption time (in hours): ");
                    try{
                        int hours = sc.nextInt();
                        product.updateConsmptionTimeInHours(hours);
                        this.movieList.set(index, product);
                        System.out.println("Consumption hours updated succesfully!");
                    }
                    catch(Exception e){
                        System.out.println("Error occured. Please enter the valid index.");
                    }
                }
                
                // Adding consumption time in days
                else if(type==2){
                    System.out.println("Enter the consumption time (in days): ");
                    try{
                        int days = sc.nextInt();
                        product.updateConsupmtionTimeInDays(days);
                        this.movieList.set(index, product);
                        System.out.println("Consumption days updated succesfully!");
                    }
                    catch(Exception e){
                        System.out.println("Error occured. Please enter the valid index.");
                    }
                }
                
                // Adding end date of product
                else if(type==3){
                    System.out.println("Enter the end date(YYYY-MM-DD): ");
                    try{
                        String date = sc.next();
                        product.updateEndDate(date);
                        this.movieList.set(index, product);
                        System.out.println("End date updated succesfully!");
                    }
                    catch(Exception e){
                        System.out.println("Error occured. Please enter the valid format.");
                    }
                }
                
                // Adding rating
                else if (type==4){
                    System.out.println("Enter the rating: ");
                    try{
                        float rating = sc.nextFloat();
                        product.updateRating(rating);
                        this.movieList.set(index, product);
                        System.out.println("Rating updated succesfully!");
                        
                    }
                catch(Exception e){
                        System.out.println("Error ocured. Please enter the valid type.");
                    }
                }
            }
            catch (Exception e){
                System.out.println("Error occured. Please enter a valid index no.");
            }
        }
        
        // Update Series
        if(optType == 3){
            try{
                Product product = this.seriesList.get(index);
                String optText = "Enter the integer value of options to update.\n"+
                        "\t1 -> Add consumption time in hours\n"
                        + "\t2 -> Add consumption time in days\n"
                        + "\t3 -> Add end date of product\n"
                        + "\t4 -> Add rating\n";
                System.out.println(optText);
                int type = sc.nextInt();
                
                // Adding consumption time in hours
                if(type==1){
                    System.out.println("Enter the consumption time (in hours): ");
                    try{
                        int hours = sc.nextInt();
                        product.updateConsmptionTimeInHours(hours);
                        this.seriesList.set(index, product);
                        System.out.println("Consumption hours updated succesfully!");
                    }
                    catch(Exception e){
                        System.out.println("Error occured. Please enter the valid index.");
                    }
                }
                
                // Adding consumption time in days
                else if(type==2){
                    System.out.println("Enter the consumption time (in days): ");
                    try{
                        int days = sc.nextInt();
                        product.updateConsupmtionTimeInDays(days);
                        this.seriesList.set(index, product);
                        System.out.println("Consumption days updated succesfully!");
                    }
                    catch(Exception e){
                        System.out.println("Error occured. Please enter the valid index.");
                    }
                }
                
                // Adding end date of product
                else if(type==3){
                    System.out.println("Enter the end date(YYYY-MM-DD): ");
                    try{
                        String date = sc.next();
                        product.updateEndDate(date);
                        this.seriesList.set(index, product);
                        System.out.println("End date updated succesfully!");
                    }
                    catch(Exception e){
                        System.out.println("Error occured. Please enter the valid format.");
                    }
                }
                
                // Adding rating
                else if (type==4){
                    System.out.println("Enter the rating: ");
                    try{
                        float rating = sc.nextFloat();
                        product.updateRating(rating);
                        this.seriesList.set(index, product);
                        System.out.println("Rating updated succesfully!");
                        
                    }catch(Exception e){
                        System.out.println("Error ocured. Please enter the valid type.");
                    }
                }
            }
            catch (Exception e){
                System.out.println("Error occured. Please enter a valid index no.");
            }
        }
        else{
            System.out.println("Please enter a valid product type.");
        }
    }
    public void deleteProduct(int optType, int index){
        
        // Delete Book
        if(optType == 1){
            try{
                this.bookList.remove(index);
                System.out.println("Product deleted successfully");
            }
            catch (Exception e){
                System.out.println("Error occured. Please enter a valid index no.");
            }
        }
        
        // Delete movie
        if(optType == 2){
            try{
                this.movieList.remove(index);
                System.out.println("Product deleted successfully");
            }
            catch (Exception e){
                System.out.println("Error occured. Please enter a valid index no.");
            }
        }
        
        // Delete series
        if(optType == 3){
            try{
                this.seriesList.remove(index);
                System.out.println("Product deleted successfully");
            }
            catch (Exception e){
                System.out.println("Error occured. Please enter a valid index no.");
            }
        }
        else{
            System.out.println("Please enter a valid product type.");
        }
    }
    public void UpdateAll(){
        
        // Updating Hours Consumption Time
        this.totalConsumptionTimeInHours = this.totalBookConsumptionTimeInHours + this.totalMovieConsumptionTimeInHours + this.totalSeriesConsumptionTimeInHours;
        
        // Updating Days Consumption Time
        this.totalConsumptionTimeInDays = this.totalBookConsumptionTimeInDays + this.totalMovieConsumptionTimeInDays+ this.totalSeriesConsumptionTimeInDays;
        
        // Update TotalConsumption Hours Again
        if(this.totalConsumptionTimeInHours>=23){
            int tempDays = (int)(this.totalConsumptionTimeInHours/24);
            this.totalConsumptionTimeInDays += tempDays;
            this.totalConsumptionTimeInHours -= (tempDays * 24);
        }
        
        // Updating Rating
        this.totalBookARating = 0;
        this.totalMovieRating = 0;
        this.totalSeriesRating = 0;
        for(Product prod:this.bookList){
            this.totalBookARating  += prod.getRating();
        }
        for(Product prod:this.movieList){
            this.totalMovieRating  += prod.getRating();
        }
        for(Product prod:this.seriesList){
            this.totalSeriesRating  += prod.getRating();
        }
        this.totalRating = this.totalBookARating + this.totalMovieRating + this.totalSeriesRating;
        
        // Updating Total Product Numbers
        this.totalProductNumbers = this.bookList.size()+ this.movieList.size()+ this.seriesList.size();
    }
    public ArrayList<Product> getBookList(){
        return this.bookList;
    }
    public ArrayList<Product> getMovieList(){
        return this.movieList;
    }
    public ArrayList<Product> getSeriesList(){
        return this.seriesList;
    }
    
    // Get Consumption times in days
    public int getTotalConsumptionTimeInDays(){
        return this.totalConsumptionTimeInDays;
    }
    
    public int getTotalBookConsumptionTimeInDays(){
        return this.totalBookConsumptionTimeInDays;
    }
    
    public int getTotalMovieConsumptionTimeInDays(){
        return this.totalMovieConsumptionTimeInDays;
    }
    
    public int getTotalSeriesConsumptionTimeInDays(){
        return this.totalSeriesConsumptionTimeInDays;
    }
    
    // get Consumption time in Hours
    public int getTotalConsumptionTimeInHours(){
        return this.totalConsumptionTimeInHours;
    }
    
    public int getTotalBookConsumptionTimeInHours(){
        return this.totalBookConsumptionTimeInHours;
    }
   
    public int getTotalMovieConsumptionTimeInHours(){
        return this.totalMovieConsumptionTimeInHours;
    }
   
    public int getTotalSeriesConsumptionTimeInHours(){
        return this.totalSeriesConsumptionTimeInHours;
    }
    public int getTotalProductNumber(){
        return this.totalProductNumbers;
    }
   
    // Get ratings
    public float getTotalAvgRating(){
        return this.totalRating/this.totalProductNumbers;
    }
    
    public float getTotalBookAvgRating(){
        return this.totalBookARating/this.bookList.size();
    }
    
    public float getTotalMovieAvgRating(){
        return this.totalMovieRating/this.movieList.size();
    }
    
    public float getTotalSeriesAvgRating(){
        return this.totalSeriesRating/this.seriesList.size();
    }
}
