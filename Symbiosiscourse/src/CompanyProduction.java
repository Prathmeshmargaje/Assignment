class Product
{
	void basicReq()
	{
		System.out.println("Basic req of product");
	}
}

  class PreProduction extends Product
  {
	  void rawMaterial()
	  {
		  System.out.println("Raw material");
	  }
  }
   class Production extends Product
  {
	void finalProduct()
	{
		System.out.println("final product");
	}
  }


public class CompanyProduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  PreProduction pre = new PreProduction();
  pre.basicReq();
  pre.rawMaterial();
  Production prod = new Production();
  prod.basicReq();
  prod.finalProduct();
  
  
  
	}

}

