/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_products;
import java.util.ArrayList;
import my_products.Product;
/**
 *
 * @author Ln
 */
public class Views {
    // update individual Views
    public Views(){
        
    }
    public void indvViews(ArrayList<Product> productList, int productType){
        // productType: 1 -> Book
        //              2 -> Movies
        //              3 -> Series
        if(productType==1){
            System.out.println("\nAll Books: ");
            String leftAlignFormat = "| %-15s | %-4d | %-4d | %.1f |%n";

            System.out.format("+----------------+-----------+-----------+---------+%n");
            System.out.format("|  Book          | Consuming | Consuming | Book    |%n");
            System.out.format("|  name          | days      | hours     | rating  |%n");
            System.out.format("+----------------+-----------+-----------+---------+%n");
            for (Product product:productList) {
                System.out.format(leftAlignFormat, product.getName(), product.getConsupmtionTimeInDays(), product.getConsupmtionTimeInHours(), product.getRating());
            }
            System.out.format("+----------------+-----------+-----------+---------+%n");
        }
        
        else if(productType==2){
            System.out.println("\nAll Movies: ");
            String leftAlignFormat = "| %-15s | %-4d | %-4d | %.1f |%n";

            System.out.format("+----------------+-----------+-----------+---------+%n");
            System.out.format("|  Movie         | Consuming | Consuming | Movie   |%n");
            System.out.format("|  name          | days      | hours     | rating  |%n");
            System.out.format("+----------------+-----------+-----------+---------+%n");
            for (Product product:productList) {
                System.out.format(leftAlignFormat, product.getName(), product.getConsupmtionTimeInDays(), product.getConsupmtionTimeInHours(), product.getRating());
            }
            System.out.format("+----------------+-----------+-----------+---------+%n");
        }
        else if(productType==3){
            System.out.println("\nAll Sereis: ");
            String leftAlignFormat = "| %-15s | %-4d | %-4d | %.1f |%n";

            System.out.format("+----------------+-----------+-----------+---------+%n");
            System.out.format("|  Series        | Consuming | Consuming | Series  |%n");
            System.out.format("|  name          | days      | hours     | rating  |%n");
            System.out.format("+----------------+-----------+-----------+---------+%n");
            for (Product product:productList) {
                System.out.format(leftAlignFormat, product.getName(), product.getConsupmtionTimeInDays(), product.getConsupmtionTimeInHours(), product.getRating());
            }
            System.out.format("+----------------+-----------+-----------+---------+%n");
        }
    }
    public void AllViews(int totalTimeConsumptionInDays, int indivBookConsumptionTimeInDays, int indivMovieConsumptionTimeInHDays, int indivSeriesConsumptionTimeInDays,
        int totalConsumptionTimeInHours, int indivBookConsumptionTimeInHours, int indivMovieConsumptionTimeInHours,int indivSeriesConsumptionTimeInHours,
        float totalAvgRating, float bookAvgRating, float movieAvgRating, float seriesAvgRating,
        int totalBookNumber,int totalMovieNumber, int totalSeriesNumber, int totalProductNumber){
        System.out.println("\nOverall info: ");
        String leftAlignFormat = "| %-4d | %-4d | %-4d | %-4d |%n";
        
        // consumption days
        System.out.println("\nConsuming Time in Days");
        System.out.format("-----------+-----------+-----------+---------+%n");
        System.out.format("|  Books   | Movies    | Series    | Total   |%n");
        System.out.format("+----------+-----------+-----------+---------+%n");
        System.out.format(leftAlignFormat, indivBookConsumptionTimeInDays, indivMovieConsumptionTimeInHDays, indivSeriesConsumptionTimeInDays, totalTimeConsumptionInDays);
        System.out.format("+----------+-----------+-----------+---------+%n");
        
        // consumption hours
        System.out.println("\nConsuming Time in Hours");
        System.out.format("-----------+-----------+-----------+---------+%n");
        System.out.format("|  Books   | Movies    | Series    | Total   |%n");
        System.out.format("+----------+-----------+-----------+---------+%n");
        System.out.format(leftAlignFormat, indivBookConsumptionTimeInHours, indivMovieConsumptionTimeInHours, indivSeriesConsumptionTimeInHours, totalConsumptionTimeInHours);
        System.out.format("+----------+-----------+-----------+---------+%n");
        
        
        // Ratings
        leftAlignFormat = "| %.1f | %.1f | %.1f | %.1f |%n";
        System.out.println("\n Total Average Ratings");
        System.out.format("-----------+-----------+-----------+---------+%n");
        System.out.format("|  Books   | Movies    | Series    | Total   |%n");
        System.out.format("+----------+-----------+-----------+---------+%n");
        System.out.format(leftAlignFormat, bookAvgRating, movieAvgRating, seriesAvgRating, totalAvgRating);
        System.out.format("+----------+-----------+-----------+---------+%n");
        
        
        // consumption hours
        leftAlignFormat = "| %-4d | %-4d | %-4d | %-4d |%n";
        System.out.println("\nTotal Product Numbers:");
        System.out.format("-----------+-----------+-----------+---------+%n");
        System.out.format("|  Books   | Movies    | Series    | Total   |%n");
        System.out.format("+----------+-----------+-----------+---------+%n");
        System.out.format(leftAlignFormat, totalBookNumber, totalMovieNumber, totalSeriesNumber, totalProductNumber);
        System.out.format("+----------+-----------+-----------+---------+%n");
    }
    public void productDetailsDisplay(Product product){
        System.out.println("\nProduct details: ");
        String leftAlignFormat = "| %-15s | %-15s | %-15s | %-4d | %-4d | %.1f |%n";

        System.out.format("+----------------+----------------+----------------+-----------+-----------+-----------+%n");
        System.out.format("|  Book          |  Start         |  End           | Consuming | Consuming | Rating    |%n");
        System.out.format("|  name          |  date          | hours          | days      |  hours    |           |%n");
        System.out.format("+----------------+----------------+----------------+-----------+-----------+-----------+%n");
        System.out.format(leftAlignFormat, product.getName(), product.getStartDate(), product.getEndDate(), product.getConsupmtionTimeInDays(), product.getConsupmtionTimeInHours(), product.getRating());
        System.out.format("+----------------+----------------+----------------+-----------+-----------+-----------+%n");
        System.out.println("");
    }
}
