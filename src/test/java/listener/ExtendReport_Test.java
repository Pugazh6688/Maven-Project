//package listener;
//
//import com.aventstack.extentreports.ExtentTest;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeSuite;
//
//import java.io.IOException;
//
//
//public class ExtentReport_Test {
//
//    public static ExtentTest extenttest;
//
//
//    @BeforeSuite
//    public void extentTestReportStartup() throws IOException {
//        Base_Class base = new Base_Class() {
//        };
//        base.extentReportStart(location:null);
//    }
//
//    @AfterSuite
//    public void extentReportEnd() throws IOException {
//        Base_Class base = new Base_Class() {
//        };
//        base.extentReportTearDown(location:null);
//    }
//}
