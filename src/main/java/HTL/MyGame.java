package HTL;
import HTLProceduralAPI.HTLProceduralAPI;

/**
 * @author Kunlakan (Jeen) Cherdchusilp
 * @author Tom Lai
 * 
 * ----------------------------------------------------------------------------
 * LAB 1 - What does a Method look like?
 * 
 * LEARNING OBJECTIVE:
 * 		Student will be able to write a method/function in Java
 * 
 * FUNCTIONS TO USE:
 * 		drawMedicWizard()
 * 		drawSpeedyWizard()
 * ----------------------------------------------------------------------------
 */

public class MyGame extends HTLProceduralAPI
{
	public void buildGame()
	{
		drawMedicWizard();
		drawMedicWizard();
		drawMedicWizard();
		drawMedicWizard();
		
		drawSpeedyWizard();
		drawSpeedyWizard();
		drawSpeedyWizard();
		drawSpeedyWizard();
	}
}
