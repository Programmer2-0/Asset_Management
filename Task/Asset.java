package Task;

class Asset 
{
	private String Asset_Name;
	private int Asset_Cost;
	private String Asset_Type;
	private int Asset_Date_of_purchase;
	public String getAsset_Name() 
	{
		return Asset_Name;
	}
	public void setAsset_Name(String asset_Name) 
	{
		Asset_Name = asset_Name;
	}
	public int getAsset_Cost() 
	{
		return Asset_Cost;
	}
	public void setAsset_Cost(int asset_Cost) 
	{
		Asset_Cost = asset_Cost;
	}
	public String getAsset_Type() 
	{
		return Asset_Type;
	}
	public void setAsset_Type(String asset_Type) 
	{
		Asset_Type = asset_Type;
	}
	public int getAsset_Date_of_purchase() 
	{
		return Asset_Date_of_purchase;
	}
	public void setAsset_Date_of_purchase(int asset_Date_of_purchase) 
	{
		Asset_Date_of_purchase = asset_Date_of_purchase;
	}
}