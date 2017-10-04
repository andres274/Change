import javafx.scene.control.Alert;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.TextInputDialog;
import java.util.Optional;

public class Change extends Application {
    @Override
    public void start(Stage primaryStage) {
        final int QUARTERS = 25;
        final int DIMES = 10;
        final int NICKELS = 5;
        final int PENNIES = 1;

        TextInputDialog textInputDialog = new TextInputDialog("Enter your dollar bills");
        Optional<String> inputValue = textInputDialog.showAndWait();
        System.out.println(inputValue.toString());
        int inputIntValue = Integer.parseInt(inputValue.get()) * 100;
        int quarters = inputIntValue / QUARTERS;
        int dimes = inputIntValue / DIMES;
        int nickels = inputIntValue / NICKELS;
        int pennies = inputIntValue / PENNIES;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Your change is " + quarters + " quarters" + "\n" + dimes + " dimes" + "\n" + nickels + " nickels" + "\n"
         + pennies + " pennies");
        alert.showAndWait();
    }
}
