public class EXERCISE7_1 {
    private int quad; 
    private int prep; 
    private int beginwork; 
    private int minutes; 
    private int hours; 

    public EXERCISE7_1(int quad, int prep, int beginwork){
        this.quad=quad; 
        this.prep=prep;
        this.beginwork=beginwork; 
    }

    public int getQuad(){
        return quad; 
    }

    public int getPrep(){
        return prep; 
    }
    public int getBeginwork(){
        return beginwork; 
    }

    public int computeHours(){
        return hours = getBeginwork()-1; 
    }
    public int computeMinutes(){
        return minutes = getPrep()-getQuad(); 
    }
    public void display(){
        System.out.printf("Juan will leave home at %d:%d AM", computeHours(), computeMinutes()); 
    }
}
