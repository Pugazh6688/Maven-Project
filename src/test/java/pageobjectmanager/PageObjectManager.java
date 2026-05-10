package pageobjectmanager;

import Utility.FileReaderManager;
import pageobjectmodule.LoginPage;

public class PageObjectManager {
    private LoginPage loginpage;
    private FileReaderManager fileReaderManager;
    private static PageObjectManager pageObjectManager;

    public LoginPage getLoginpage() {
        if (loginpage == null){
            loginpage = new LoginPage();
        }
        return loginpage;
    }

    public FileReaderManager getFileReaderManager() {
        if (fileReaderManager == null){
            fileReaderManager = new FileReaderManager();
        }
        return fileReaderManager;
    }

    public static PageObjectManager getPageObjectManager() {
        if (pageObjectManager == null){
            pageObjectManager = new PageObjectManager();
        }
        return pageObjectManager;
    }
}
