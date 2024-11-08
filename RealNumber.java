public class RealNumber{
  //Hint: ONLY touch instance variables directly in your accessor methods/constructor.
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  @Override
  public String toString(){
    return ""+value;
  }


  /**
  *@return true if and only if the other parameter
    has the same value as this.
    hint: you should always use accessor methods.
  */
  public boolean equals(RealNumber other){
    //complete this method
    return true;
  }

  /**
  *@return 0 when other is the same as this,
    a positive value when this is greater than other,
    or a negative value when this is less than other
  */
  public int compareTo(RealNumber other){
    //complete this method
    return 0;
  }

  /**
  *@return the sum of this and the other
  *@param other - ANY RealNumber, including a RationalNumber or other subclasses of RealNumber (that aren't written yet)
  */
  public double add(RealNumber other){
    //COMPLETE THIS METHOD
    return 0;
  }

  /**
  *@return the product of this and the other
  *@param other - ANY RealNumber, including a RationalNumber or other subclasses of RealNumber (that aren't written yet)
  */
  public double multiply(RealNumber other){
    //COMPLETE THIS METHOD
    return 0;
  }

  /**
  *@return the this divided by the other, use the / operator and don't worry about errors.
  */
  public double divide(RealNumber other){
    //COMPLETE THIS METHOD
    return 0;
  }

  /**
  *@return the this minus the other
  */
  public double subtract(RealNumber other){
    //COMPLETE THIS METHOD
    return 0;
  }



}
