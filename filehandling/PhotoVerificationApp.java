package filehandling;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class PhotoVerificationApp extends Application {

    private Image livePhoto;
    private Image scannedPhoto;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Photo Verification");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Live photo upload button
        Button livePhotoButton = new Button("Upload Live Photo");
        livePhotoButton.setOnAction(e -> {
            livePhoto = uploadPhoto(); // Implement method to upload photo
        });
        GridPane.setConstraints(livePhotoButton, 0, 0);

        // Scanned photo upload button
        Button scannedPhotoButton = new Button("Upload Scanned Photo");
        scannedPhotoButton.setOnAction(e -> {
            scannedPhoto = uploadPhoto(); // Implement method to upload photo
        });
        GridPane.setConstraints(scannedPhotoButton, 1, 0);

        // Verify button
        Button verifyButton = new Button("Verify");
        verifyButton.setOnAction(e -> {
            boolean verified = verifyPhotos(); // Implement method to verify photos
            if (verified) {
                displaySuccessMessage();
            } else {
                displayErrorMessage();
            }
        });
        GridPane.setConstraints(verifyButton, 0, 1);

        grid.getChildren().addAll(livePhotoButton, scannedPhotoButton, verifyButton);

        Scene scene = new Scene(grid, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // Method to upload photo (implementation not provided)
    private Image uploadPhoto() {
        // Implement photo upload logic here
        return null; // Placeholder return value
    }

    // Method to verify photos (implementation not provided)
    private boolean verifyPhotos() {
        // Implement photo verification logic here
        return true; // Placeholder return value
    }

    // Method to display success message
    private void displaySuccessMessage() {
        Stage successStage = new Stage();
        successStage.setTitle("Verification Success");
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(10, 10, 10, 10));
        hbox.getChildren().add(new Label("Face verification successful"));
        Scene scene = new Scene(hbox, 250, 100);
        successStage.setScene(scene);
        successStage.show();
    }

    // Method to display error message
    private void displayErrorMessage() {
        Stage errorStage = new Stage();
        errorStage.setTitle("Verification Error");
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(10, 10, 10, 10));
        hbox.getChildren().add(new Label("Face verification failed"));
        Scene scene = new Scene(hbox, 250, 100);
        errorStage.setScene(scene);
        errorStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
