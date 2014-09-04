package PageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import FunctionLibraries.FunctionLibrary;
import Logger.LoggerInstance;

public class ResourcesPage {

	private final String XPath_ResourceTab = "//*[@id='menu-wrapper']/ul/li[7]/a";
	private final String XPath_GeneralEconomicIndicators = "//*[@id='aspnetForm']/div[5]/div/div[10]/div/div[2]/div[1]/h2[1]";
	private final String Xpath_CCilIndicatorsIndices = "//*[@id='aspnetForm']/div[5]/div/div[10]/div/div[2]/div[2]/h2";
	private final String Xpath_NSEFIMMDAIndicators = "//*[@id='aspnetForm']/div[5]/div/div[10]/div/div[2]/div[1]/h2[2]";
	private final String Xpath_IndicatorName = "//*[@id='aspnetForm']/div[5]/div/div[10]/div/div[2]/div[1]/table[1]/thead/tr/th[1]";
	private final String Xpath_RBIPolicyIndicators = "//*[@id='aspnetForm']/div[5]/div/div[10]/div/div[2]/div[1]/table[2]/thead/tr/th[1]";
	private final String Xpath_RBIReferExchRates = "//*[@id='aspnetForm']/div[5]/div/div[10]/div/div[2]/div[1]/table[3]/thead/tr/th[1]";

	private final String Xpathpath_Key_Economic_Indicators = "//*[@id='aspnetForm']/div[5]/div/div[10]/div/div[1]/span/div/h1";
	@FindBy(xpath = XPath_ResourceTab)
	public WebElement we_ResourceTab;
	@FindBy(xpath = Xpathpath_Key_Economic_Indicators)
	public WebElement we_Key_Economic;
	// XPath_GeneralEconomicIndicators
	@FindBy(xpath = XPath_GeneralEconomicIndicators)
	public WebElement we_GeneralEconomicIndicators;
	@FindBy(xpath = Xpath_CCilIndicatorsIndices)
	public WebElement we_CCilIndicatorsIndices;
	@FindBy(xpath = Xpath_NSEFIMMDAIndicators)
	public WebElement we_NSEFIMMDAIndicators;
	@FindBy(xpath = Xpath_IndicatorName)
	public WebElement we_IndicatorName;
	@FindBy(xpath = Xpath_RBIPolicyIndicators)
	public WebElement we_RBIPolicyIndicators;
	@FindBy(xpath = Xpath_RBIReferExchRates)
	public WebElement we_RBIReferExchRates;

	
	/* Method Name: Function to click on Resource Tab
     * Description: 
     * Created By: Mohd Suhail
     * Created Date: 13-08-2014
     * */
	public void clickOnResourceTab() {
		try {

			LoggerInstance.logger.info("click on Resource Tab");
			FunctionLibrary.clickWebLink(we_ResourceTab);

		} catch (Exception e) {
			LoggerInstance.logger.info("Not able to click on Resource Tab");
		}
	}

	
	/* Method Name: 
     * Description: Verify SubTab KeyEconomic Indicators Page is Displayed
     * Created By: Mohd Suhail
     * Created Date: 13-08-2014
     * */
	public Boolean verify_KeyEconomic() {
		boolean result = false;
		try {
			result = we_Key_Economic.isDisplayed();
			if (result == true)
				LoggerInstance.logger.info("Key_Economic is displayed.");
			return result;
		} catch (Exception e) {
			LoggerInstance.logger.info("Key_Economic is not displayed.");
			return result;
		}
	}

	

	/* Method Name: 
     * Description: Verify verify GeneralEconomicIndicators is displayed
     * Created By: Mohd Suhail
     * Created Date: 13-08-2014
     * */

	public Boolean verify_GeneralEconomicIndicatorsIsDisplayed() {
		boolean result = false;
		try {
			result = we_GeneralEconomicIndicators.isDisplayed();
			if (result == true)
				LoggerInstance.logger
						.info("GeneralEconomicIndicators is displayed.");
			return result;
		} catch (Exception e) {
			LoggerInstance.logger
					.info("GeneralEconomicIndicators is not displayed.");
			return result;
		}
	}

	// Function verify CCilIndicatorsIndices is displayed
	
	/* Method Name: 
     * Description: Verify  CCilIndicatorsIndices is displayed
     * Created By: Mohd Suhail
     * Created Date: 13-08-2014
     * */
	public Boolean verify_CCilIndicatorsIndicesIsDisplayed() {
		boolean result = false;
		try {
			result = we_CCilIndicatorsIndices.isDisplayed();
			if (result == true)
				LoggerInstance.logger
						.info("CCilIndicatorsIndices is displayed.");
			return result;
		} catch (Exception e) {
			LoggerInstance.logger
					.info("CCilIndicatorsIndices is not displayed.");
			return result;
		}
	}

	
	
		/* Method Name: 
	     * Description: Verify  NSE FIMMDA Indicators is displayed 
	     * Created By: Mohd Suhail
	     * Created Date: 13-08-2014
	     * */
	public Boolean verify_NSEFIMMDAIndicatorsIsDisplayed() {
		boolean result = false;
		try {
			result = we_NSEFIMMDAIndicators.isDisplayed();
			if (result == true)
				LoggerInstance.logger.info("NSEFIMMDAIndicators is displayed.");
			return result;
		} catch (Exception e) {
			LoggerInstance.logger.info("NSEFIMMDAIndicators is not displayed.");
			return result;
		}
	}
	

	/* Method Name: 
     * Description: Verify General Economic Contains Indicator Name
     * Created By: Mohd Suhail
     * Created Date: 13-08-2014
     * */

	public Boolean verify_GeneralEconomicContainsIndicator() {

		boolean result = false;

		result = we_IndicatorName.isDisplayed();
		try {
			if (result == true)

				LoggerInstance.logger
						.info("General Economic Contains IndicatorName.");
			return result;

		} catch (Exception e) {
			LoggerInstance.logger
					.info("GeneralEconomicIndicators does not contains IndicatorName.");
			return result;
		}
	}

	
	/* Method Name: 
     * Description: General Economic Contains RBI Policy Indicator.
     * Created By: Mohd Suhail
     * Created Date: 13-08-2014
     * */

	public Boolean verify_GeneralEconomicContainsRBIPolicyIndicator() {

		boolean result = false;

		result = we_RBIPolicyIndicators.isDisplayed();
		try {
			if (result == true)
				LoggerInstance.logger
						.info("General Economic Contains RBI Policy Indicator.");
			return result;
		} catch (Exception e) {
			LoggerInstance.logger
					.info("GeneralEconomicIndicators does not contains RBI Policy Indicator.");
			return result;
		}
	}

	
	/* Method Name: 
     * Description: General Economic Contains RBI Reference Exchange Rates.
     * Created By: Mohd Suhail
     * Created Date: 13-08-2014
     * */

	public Boolean verify_GeneralEconomicContainsRBIReferenceExchange() {

		boolean result = false;
		try {
			result = we_RBIReferExchRates.isDisplayed();
			if (result == true)

				LoggerInstance.logger
						.info("General Economic Contains RBI Reference Exchange Rates.");
			return result;
		} catch (Exception e) {
			LoggerInstance.logger
					.info("GeneralEconomicIndicators does not contains RBI Reference Exchange Rates.");
			return result;
		}

	}

}
