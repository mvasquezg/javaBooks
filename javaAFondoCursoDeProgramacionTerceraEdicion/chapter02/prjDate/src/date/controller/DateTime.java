package date.controller;

public class DateTime extends DetailsDate{
    private int hour;
    private int minute;
    private int second;

    public DateTime(String sDate, int hour, int minute, int second){
        super(sDate);
        this.hour=hour;
        this.minute=minute;
        this.second=second;

    }//end constructor DateTime

    public String toString(){
        return super.toString() + " ( "+this.hour+" : "+this.minute+" : "+this.second+" )";
    }

}//end DateTime