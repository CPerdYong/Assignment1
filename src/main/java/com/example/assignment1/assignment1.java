package com.example.assignment1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class assignment1 extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        BorderPane borderPane = new BorderPane();

        Image background_image = new Image(Objects.requireNonNull(assignment1.class.getResource("Forest.png")).openStream());
        ImageView backgroundImage = new ImageView(background_image);
        backgroundImage.setFitWidth(800);
        backgroundImage.setFitHeight(800);
        borderPane.getChildren().add(backgroundImage);

        borderPane.setTop(TopMenu());//The top navigation bar
        borderPane.setCenter(Background());//The center part of the game


        Scene scene = new Scene(borderPane, 800, 700);
        stage.setTitle("The Forest");
        stage.setScene(scene);
        stage.show();
    }

    //the code for the navigation
        public HBox TopMenu(){
            //title
            HBox gameTitle = new HBox();
            Text gameName = new Text("The Forrest");
            Font font = Font.font("Verdana", FontWeight.EXTRA_BOLD, 25);
            gameName.setFont(font);
            gameName.setFill(Color.BLACK);
            gameTitle.getChildren().addAll(gameName);
            gameTitle.setPadding(new Insets(0, 100, 0, 0));

            //menu bar
            MenuBar menuBar = new MenuBar();
            Menu menu = new Menu("Menu");
            Menu docs = new Menu("Docs");
            Menu whitepaper = new Menu("Whitepaper");
            menuBar.getMenus().addAll(menu, docs, whitepaper);
            menuBar.setPadding(new Insets(5, 0, 0, 0));
            menuBar.setStyle("-fx-background-color: rgba(0,0,0,0)");

            //icons
            HBox icons = new HBox();

            //facebook
            Image icon1 = new Image(assignment1.class.getResource("facebookIcon.jpg").toString());
            ImageView viewIcon1 = new ImageView(icon1);
            viewIcon1.setFitHeight(25);
            viewIcon1.setFitWidth(25);
            Button Facebook = new Button("",viewIcon1);
            Facebook.setStyle("-fx-background-color: rgba(0, 0, 0, 0)");

            //instagram
            Image icon2 = new Image(assignment1.class.getResource("instagramIcon.png").toString());
            ImageView viewIcon2 = new ImageView(icon2);
            viewIcon2.setFitHeight(25);
            viewIcon2.setFitWidth(25);
            Button Instagram = new Button("",viewIcon2);
            Instagram.setStyle("-fx-background-color: rgba(0, 0, 0, 0)");

            //youtube
            Image icon3 = new Image(assignment1.class.getResource("youtubeIcon.jpg").toString());
            ImageView viewIcon3 = new ImageView(icon3);
            viewIcon3.setFitHeight(25);
            viewIcon3.setFitWidth(30);
            Button Youtube = new Button("",viewIcon3);
            Youtube.setStyle("-fx-background-color: rgba(0, 0, 0, 0)");

            //combine the icons
            icons.getChildren().addAll(Facebook, Instagram,Youtube);
            icons.setPadding(new Insets(0, 0, 0, 100));

            //combine the title, menu bar, icons
            HBox topMenu = new HBox(gameTitle, menuBar,icons);
            topMenu.setStyle("-fx-background-color: rgba(255, 255, 255, 0.2)");
            topMenu.setAlignment(Pos.TOP_CENTER);

            return topMenu;
        }

        public VBox Background(){
            VBox frontText = new VBox();
            Font font1 = Font.font("Verdana", FontWeight.BOLD,30);
            Text discText1 = new Text("Are You Ready For");
            discText1.setFont(font1);
            discText1.setFill(Color.BLACK);

            Font font2 = Font.font("Verdana", FontWeight.EXTRA_BOLD,30);
            Text discText2 = new Text("The ADVENTURE");
            discText2.setFont(font2);
            discText2.setFill(Color.rgb(78, 78, 78));
            discText2.setStyle("-fx-background-color: rgba(255, 255, 255, 0.2)");

            Font font3 = Font.font("Verdana", FontWeight.BOLD,18);
            Text discText3 = new Text("What Kind of Challenges Await You?");
            discText3.setFont(font3);
            discText3.setFill(Color.WHEAT);

            Button startGame = new Button("Lets GO");
            Font font4 = Font.font("Verdana", FontWeight.BOLD,16);
            startGame.setFont(font4);
            startGame.setStyle("-fx-background-color: rgba(255, 255, 255, 0.2)");
            startGame.setMaxHeight(300);
            startGame.setMaxWidth(150);

            frontText.setSpacing(6);
            frontText.setPadding(new Insets(100, 0, 0, 100));
            frontText.getChildren().addAll(discText1, discText2, discText3, startGame);

            return frontText;
        }

    public static void main(String[] args) {
        launch();
    }
}