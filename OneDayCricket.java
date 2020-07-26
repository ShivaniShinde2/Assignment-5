package Assignment5;

	class OneDayCricket extends Cricket
	{
		
		public double runratee() 
		{
			return super.getCurrentScore()/super.getCurrentOver();
			
		}
		public double Reqrunratee() {
			return (getTargetScore()-getCurrentScore())/(getMaxOvers() -getCurrentOver());
		}	
		
	}