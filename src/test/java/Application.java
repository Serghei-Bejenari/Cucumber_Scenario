import driver.Driver;
import org.openqa.selenium.WebDriver;
import pages.*;

public class Application {
    private final WebDriver driver;
    private HomePage homePage;
    private P2pTransferPage p2pTransferPage;
    private InternetBankingPage internetBankingPage;
    private AccountStatementPage accountStatementPage;
    private LogInPage logInPage;

    public Application() {
        this.driver = Driver.getDriver();
    }

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage(driver);
        }
        return homePage;
    }

    public P2pTransferPage p2pTransferPage() {
        if (p2pTransferPage == null) {
            p2pTransferPage = new P2pTransferPage(driver);
        }
        return p2pTransferPage;
    }

    public InternetBankingPage internetBankingPage() {
        if (internetBankingPage == null) {
            internetBankingPage = new InternetBankingPage(driver);
        }
        return internetBankingPage;
    }

    public AccountStatementPage accountStatementPage() {
        if (accountStatementPage == null) {
            accountStatementPage = new AccountStatementPage(driver);
        }
        return accountStatementPage;
    }

    public LogInPage logInPage() {
        if (logInPage == null) {
            logInPage = new LogInPage(driver);
        }
        return logInPage;
    }
}

