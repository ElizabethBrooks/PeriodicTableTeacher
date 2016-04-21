//A class to determine the n,l,mth's of l, and s values of the quantum number of elements
//in terms of the specified elements atomic number.
public class QuantumNums {
	
	//Fields to store quantum number values.
	private int n;
	private int l;
	private int[] lValues;
	private String lShellDesignation;
	private int mL;
	private double s;
	private String nobelGas;
	private int electronAmount;
	private int elementAtomicNum;
	
	//The QuantumNums class constructor.
	public QuantumNums(int atomicNum){
		elementAtomicNum = atomicNum;
		setNobelGas();
		setNValue();
		setLShellDesignation();
		
	}
	
	//Get the string stored in nobelGas.
	public String getNobelGas(){
		return nobelGas;
	}
	
	//Get the n value for the shell designation.
	public int getNValue(){
		return n;
	}
   
   //Get the values for l.
   public int getLValue(){
      return l;
   }
	
	//get the lShellDesignation value for the letter designation of the sub shell indicated by l.
	public String getLShellDesignation(){
		return lShellDesignation;
	}
	
	//get the mL value for the Mth's of l.
	public int getMLValue(){
		return mL;
	}
	
	//Get the s value for the electron spin.
	public double getSValue(){
		return s;
	}
	
	//Get the leftover electron amount.
	public int getElectronAmount(){
		return electronAmount;
	}
	
	//Set the values for n.
	public void setNValue(){
		//The number of electrons in any shell is equal to 2(n^2), where n is the shell energy level.
		//Therefore, n = sqrt.(number of electrons/2), almost. The value of n is a whole number though.
		double nValue = Math.sqrt(elementAtomicNum/2);
		
		//Cast the nValue as type int to round it off.
		n = (int) (nValue);
		
		//However, there is an error for hydrogen's n value will come out to zero (incorrectly) 
		//if determined through the code above.
		if(n == 0){
			n = 1;
		}
	}
	
	//Set the values for l.
	public void setLShellDesignation(){
		//An if statement to fill the value of lShellDesignation with the appropriate sub shell designation.
		if(l == 0){
			lShellDesignation = "s";
		}else if(l == 1){
			lShellDesignation = "p";
		}else if(l == 2){
			lShellDesignation = "d";
		}else if(l == 3){
			lShellDesignation = "f";
		}
	}
	
	//A method to determine the value of l in terms of n, as well as the leftover electron amount.
	public void setNobelGas(){
		switch(n)
		{
			case 1:
			{
				l = 0;
				electronAmount = 2;
				nobelGas = "";
				break;
			}
			case 2:
			{
				l = 1;
				electronAmount = 6;
				nobelGas = "[HE]";
				break;
			}
			case 3:
			{
				l = 1;
				electronAmount = 6;
				nobelGas = "[NE]";
				break;
			}
			case 4:
			{
				l = 1;
				electronAmount = 6;
				nobelGas = "[AR]";
				break;
			}
			case 5:
			{
				l = 1;
				electronAmount = 6;
				nobelGas = "[KR]";
				break;
			}
			case 6:
			{
				l = 1;
				electronAmount = 6;
				nobelGas = "[XE]";
				break;
			}
		}
	}
	
	//Set the values for l.
	public void setLValues(){
		int[]lValues = new int [n];
		int incrementVal = 0;

		//Use a for loop to fill the array with the appropriate l values.
		for(int i = 0; i<lValues.length; i++){
			lValues[i] = incrementVal++;
		}
	}
	
/*	public void setMValues(){
		//if statement to determine the values of m in terms of l.
		if(l == 0){
			int[]mArray = {0};
		}else if(l == 1){
			int[]mArray = {-1,0,1};
		}else if(l == 2){
			int[]mArray = {-2,-1,0,1,2};
		}else if(l == 3){
			int[]mArray = {-3,-2,-1,0,1,2,3};
		}
	}
*/
}
