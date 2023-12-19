public class Or{
    private boolean inA;
    private boolean inB;
    private boolean output;
    
    public Or (){
        this.inA = false;
        this.inB = false;
        this.output = false;
    }
    public Or (boolean inA, boolean inB)
    {
        this.inA = false;
        this.inB = false;
        setOutput(inB);
    }
    
    public void setInA(boolean inA){
        this.inA = inA;
    }
    public void setInA(boolean inB){
        this.inB = inB;
    }
    public void setOutput(boolean output){
        this.output = inA || inB;
    }
    public boolean getInA(boolean inA){
        return this.inA;
    }
    public boolean getInB(boolean inB){
        return this.inB;
    }
    public boolean getInA(boolean output){
        return this.output;
    }

}