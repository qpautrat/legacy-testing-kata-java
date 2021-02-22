import com.arolla.legacy.testing.quotebot.AutomaticQuoteBot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BotSendAllQuotesTest
{
    @Test
    public void it_sends_all_quotes()
    {
        // Arrange
        AutomaticQuoteBot bot = new AutomaticQuoteBot();
        String mode = "";

        // Act
        bot.sendAllQuotes(mode);

        // Assert
        Assertions.assertTrue(false);
    }
}
