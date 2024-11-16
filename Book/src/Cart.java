import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Cart {

    public void showCart(Stage parentWindow) {
        Stage cartWindow = new Stage();
        cartWindow.setTitle("Your Cart");

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.setStyle("-fx-background-color: #f8f9fa;");

        Label cartTitle = new Label("Cart");
        cartTitle.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");

        // Placeholder for cart items
        Label cartPlaceholder = new Label("Your cart is currently empty.");
        cartPlaceholder.setStyle("-fx-font-size: 14px; -fx-text-fill: #6c757d;");

        // Close button
        Button closeButton = new Button("Close");
        closeButton.setOnAction(e -> cartWindow.close());

        layout.getChildren().addAll(cartTitle, cartPlaceholder, closeButton);

        Scene scene = new Scene(layout, 400, 300);
        cartWindow.setScene(scene);
        cartWindow.initOwner(parentWindow);
        cartWindow.show();
    }
}
