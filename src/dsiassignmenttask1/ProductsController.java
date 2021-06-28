/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsiassignmenttask1;
import java.util.Scanner;
import dsiassignmenttask1.Views;
import dsiassignmenttask1.E_Products;
import dsiassignmenttask1.Product;
/**
 *
 * @author Ln
 */
public class ProductsController {
    public ProductsController(){
        
    }
    public void control() {
        Views view = new Views();
        E_Products products = new E_Products();
        Scanner sc = new Scanner(System.in);
        String text = "Enter the integer value of optioins:\n"+
                "\t1 -> Add Product\n"+
                "\t2-> Update Product COnsumption Time\n"+
                "\t3 -> Delete Product\n"+
                "\t4 -> Disply Individual ProductList\n"+
                "\t5 -> Display Overall Info.\n"+
                "\t6 -> exit\n";
        while(true){
//            view.indvViews(products.getBookList(), 1);
//            view.indvViews(products.getMovieList(), 2);
//            view.indvViews(products.getSeriesList(), 3);

            System.out.println(text);
            int optionType = sc.nextInt();
            
            // Add products
            if(optionType==1){
                products.AddProduct();
            }
            
            // Update Product
            else if(optionType==2){
                view.indvViews(products.getBookList(), 1);
                view.indvViews(products.getMovieList(), 2);
                view.indvViews(products.getSeriesList(), 3);
                
                while(true){
                    String text2 = "Add integer value of product type to update product consumption time.:\n"+
                            "\t1 -> Book\n"+
                            "\t2 -> Movie \n"+
                            "\t3 -> Sereies\n"+
                             "\t4 -> exit\n";
                    System.out.println(text2);
                    int type2 = sc.nextInt();
                    if (type2==4) break;
                    System.out.println("Enter the index of the product (initial index 0):");
                    int indx = sc.nextInt();
                    products.updateProduct(type2, indx);
                }
            }
            
            // Delete Product
            else if(optionType==3){
                view.indvViews(products.getBookList(), 1);
                view.indvViews(products.getMovieList(), 2);
                view.indvViews(products.getSeriesList(), 3);
                
                while(true){
                    String text2 = "Add integer value of product type to delete product.:\n"+
                            "\t1 -> Book\n"+
                            "\t2 -> Movie \n"+
                            "\t3 -> Sereies\n"+
                             "\t4 -> exit\n";
                    System.out.println(text2);
                    int type2 = sc.nextInt();
                    if (type2==4) {
                        break;
                    }
                    System.out.println("Enter the index of the product (initial index 0):");
                    int indx = sc.nextInt();
                    products.deleteProduct(type2, indx);
                }
            }
            
            // Individual Product List Display
            else if(optionType==4){
                String options = "Enter the enteger value of Product type:\n"+
                        "\t1 -> BookList\n"+
                        "\t2 -> MovieList\n"+
                        "\t3 -> SeriesList\n"+
                        "\t4 - > exit\n"; 
                while(true){
                     System.out.println(options);
                     int type = sc.nextInt();
                     
                     if(type == 1){
                         view.indvViews(products.getBookList(), 1);
                     }
                    if(type == 2){
                         view.indvViews(products.getMovieList(), 2);
                     }
                    if(type == 3){
                         view.indvViews(products.getSeriesList(), 3);
                     }
                     if(type == 4){
                         break;
                     }
                     String optText = "Do you want to see product details?\n"+
                             "Enter the integer value of options:\n"
                             + "\t1 -> yes\n"
                             + "\t2 -> no\n";
                     int optype = 1;
                     while(optype==1){
                         System.out.println(optText);
                         optype = sc.nextInt();
                         if(optype==1){
                             if(type==1){
                                view.indvViews(products.getBookList(), type);
                                System.out.println("Enter the row index number of the product (initial index 0):");
                                int indx = sc.nextInt();
                                view.productDetailsDisplay(products.getBookList().get(indx));
                             }
                             if(type==2){
                                view.indvViews(products.getMovieList(), type);
                                System.out.println("Enter the row index number of the product (initial index 0):");
                                int indx = sc.nextInt();
                                view.productDetailsDisplay(products.getMovieList().get(indx));
                             }
                             if(type==3){
                                view.indvViews(products.getSeriesList(), type);
                                System.out.println("Enter the index of the product (initial index 0):");
                                int indx = sc.nextInt();
                                view.productDetailsDisplay(products.getSeriesList().get(indx));
                             }
                         }
                         else if (optype == 2){
                             optype = 2;
                         }
                     }
                     
                }
            }
            
            // Overall Info. Display
            else if(optionType==5){
                products.UpdateAll();
                view.AllViews(products.getTotalConsumptionTimeInDays(), products.getTotalBookConsumptionTimeInDays(), products.getTotalMovieConsumptionTimeInDays(), products.getTotalSeriesConsumptionTimeInDays(),
                products.getTotalConsumptionTimeInHours(), products.getTotalBookConsumptionTimeInHours(), products.getTotalMovieConsumptionTimeInHours(), products.getTotalSeriesConsumptionTimeInHours(),
                products.getTotalAvgRating(), products.getTotalBookAvgRating(), products.getTotalMovieAvgRating(), products.getTotalSeriesAvgRating(),
                products.getBookList().size(), products.getMovieList().size(), products.getSeriesList().size(), products.getTotalProductNumber());
            }
            
            // Exit
            else if(optionType==6){
                System.out.println("Exiting...");
                break;
            }
            else{
                System.out.println("Please enter a valid ipnut.");
            }
        }
             
    }
    
}
