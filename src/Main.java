import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import sun.awt.image.ImageWatched;

import javax.tools.Tool;
import java.util.LinkedList;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }

    private LinkedList<Menu> createMenu(){
        LinkedList<Menu> menuList = new LinkedList<>();

        Menu menu1 = new Menu("Color");
        LinkedList<MenuItem> itemsForMenu1 = new LinkedList<MenuItem>();
        itemsForMenu1.add(new MenuItem("Blue"));
        itemsForMenu1.add(new MenuItem("Yellow"));
        itemsForMenu1.add(new MenuItem("Red"));
        itemsForMenu1.add(new MenuItem("Black"));
        itemsForMenu1.add(new MenuItem("Green"));

        Menu menu2 = new Menu("Text");
        LinkedList<MenuItem> itemsForMenu2 = new LinkedList<MenuItem>();
        itemsForMenu2.add(new MenuItem("Un"));
        itemsForMenu2.add(new MenuItem("Deux"));
        itemsForMenu2.add(new MenuItem("Trois"));
        itemsForMenu2.add(new MenuItem("Quatre"));
        itemsForMenu2.add(new MenuItem("Cinq"));

        Menu menu3 = new Menu("AZERTYUIOP");
        Menu subMenu1 = new Menu("1st row");
        Menu subMenu2 = new Menu("2nd row");
        Menu subMenu3 = new Menu("3rd row");
        LinkedList<MenuItem> itemsForMenu3 = new LinkedList<MenuItem>();
        itemsForMenu3.add(new MenuItem("A"));
        itemsForMenu3.add(new MenuItem("Z"));
        itemsForMenu3.add(new MenuItem("E"));
        itemsForMenu3.add(new MenuItem("R"));
        itemsForMenu3.add(new MenuItem("T"));

        menu1.getItems().addAll(itemsForMenu1);
        menu2.getItems().addAll(itemsForMenu2);
        menu3.getItems().addAll(itemsForMenu3);

        menuList.add(menu1);
        menuList.add(menu2);
        menuList.add(menu3);
        return menuList;
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World");
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250, Color.LIGHTGREEN);
        Button btn = new Button();
        btn.setLayoutX(100);
        btn.setLayoutY(80);
        btn.setText("Hello World");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                System.out.println("Hello World");
            }
        });

        MenuBar menuBar = new MenuBar();

        menuBar.getMenus().addAll(this.createMenu());
        root.getChildren().add(btn);
        root.getChildren().add(menuBar);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
