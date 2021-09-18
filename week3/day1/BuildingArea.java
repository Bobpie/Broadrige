package week3.day1;

public class BuildingArea extends PartiallyBuildHouse implements BuildingPlan,InteriorDesign{

	@Override
	public void buildBedRoom() {
		System.out.println("Build Bedroom");
		
	}
	
	public void buildBalcony() {
		System.out.println("Build if space is available");
	}

	@Override
	public void buildFirstFloor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildWardrobe() {
		// TODO Auto-generated method stub
		
	}

}
