/**
  *Book: JAVA HOW TO PROGRAM, 9TH EDITION, BY PAUL DEITEL AND HARVEY DEITEL. 
  *Chapter 03: Introduction to classes. objects, methods and string,
  *Program 06.-Class to create objects. 
*/
public class HardwareStore{
    private String partNumber;
    private String partDescription;
    private int pieceQuantity;
    private double partPrice;

    //Constructor
    public HardwareStore(String partNumber, String partDescription, int pieceQuantity, double partPrice){
        this.partNumber=partNumber;
        this.partDescription=partDescription;
        
        if(pieceQuantity>0){
            this.pieceQuantity=pieceQuantity;
        }else{
            this.pieceQuantity=0;
        }
        
        if(partPrice>0){
            this.partPrice=partPrice;
        }else{
            this.partPrice=0;
        }
        
    }

    //methods Set
    public void setPartNumber(String partNumber){
        this.partNumber=partNumber;
    }//setPartNumber

    public void setPartDescription(String partDescription){
        this.partDescription=partDescription;
    }//setPartDescription

    public void setPieceQuantity(int pieceQuantity){
                if(pieceQuantity>0){
            this.pieceQuantity=pieceQuantity;
        }else{
            this.pieceQuantity=0;
        }
    }//setPartNumber

    public void setPartPrice(double partPrice){
        if(partPrice>0){
            this.partPrice=partPrice;
        }else{
            this.partPrice=0;
        }
    }//setPartNumber
    
    //Methods get 
    public String getPartNumber(){
        return this.partNumber;
    }//setPartNumber

    public String getPartDescription(){
        return this.partDescription;
    }//setPartDescription

    public int getPieceQuantity(){
        return this.pieceQuantity;
    }//setPartNumber

    public double getPartPrice(){
        return this.partPrice;
    }//setPartNumber
    
    //Others Methods
    public double calculateTotalBill(){
        double totalToPay;

        totalToPay=getPartPrice()*getPieceQuantity();

        return totalToPay;

    }//end calculateTotalBill

}//end HardwareStore