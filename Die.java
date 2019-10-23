package lab4;

public class Die 
{
    private int sides, faceValue;
    
    public Die(int s)
    {
        this.sides = s;
    }
    
    public int roll()
    { 
        faceValue = ((int)(Math.random()*sides) + 1);
        return faceValue;
    }
    
    public int getFaceValue()
    {
        return this.faceValue;
    }
    
    public int getNumFaces()
    {
        return this.sides;
    }
    
    public String toString()
    {        
        return ("d" + this.sides + " = " + this.faceValue + " ");
    }
}
